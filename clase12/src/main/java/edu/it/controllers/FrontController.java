package edu.it.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import edu.it.components.model.ResultadoError;
import edu.it.components.model.ResultadoOK;
import edu.it.controllers.customControllers.RestApiController;
import edu.it.dto.UriID;
import edu.it.enumerados.TipoDeGet;
import edu.it.errores.HttpException;
import edu.it.errores.NotFoundException;
import edu.it.utiles.UtilesHTTP;
import edu.it.utiles.UtilesParse;
import edu.it.utiles.UtilesStream;
import edu.it.utiles.UtilesValidacion;

public class FrontController  extends HttpServlet {
	
	private static HashMap<String, String> mapaUrlController;
	private Logger logger = Logger.getLogger(getClass());
	
	static {
		mapaUrlController = new HashMap<>();
		mapaUrlController.put("ejemplo", "edu.it.controllers.customControllers.EjemploController");
		mapaUrlController.put("inventar", "edu.it.controllers.customControllers.InventarAlumnoController");
		
		/*	
		mapaUrlController.put("alumno", "edu.it.controllers.customControllers.AlumnoController");
		mapaUrlController.put("usuario", "edu.it.controllers.customControllers.UsuarioController");
		mapaUrlController.put("login", "edu.it.controllers.customControllers.LoginController");
		*/
	}
	private String obtenerNombreControllerSegunUrl(String url) {
		url = url.replace("/", "");
		logger.debug("Url: " + url);
		return mapaUrlController.get(url); // Tener en cuenta un posible exception
	}
	private RestApiController obtenerRestApiControllerSegunNombre(String nombre) {
		try {
			String nombreCompuesto = obtenerNombreControllerSegunUrl(nombre);
			
			logger.debug("url a controller ");
			logger.debug("> " + nombre);
			logger.debug("> " + nombreCompuesto);
			
			RestApiController customController = 
	    			(RestApiController)Class.forName(nombreCompuesto)
	    			.getConstructor()
	    			.newInstance();
			
			return customController;
		}
		catch (Exception ex) {
			throw new NotFoundException("");
		}
	}
	private HashMap<String, String> obtenerParametros(HttpServletRequest request) {
		HashMap<String, String> mapa = new HashMap<>();
		
		System.out.println(request.getParameterMap().size());
        for (String s : request.getParameterMap().keySet()) {
        	mapa.put(s, request.getParameter(s));
        	System.out.println(request.getParameter(s));
        }
        return mapa;
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {
	            
				PrintWriter out = response.getWriter();
		
				UtilesHTTP.controlarRespuesta(response, () -> {
					logger.debug("Voy a obtener el tipo de GET");
		            var tipoGet = UtilesParse.obtenerTipoDeGet(request.getPathInfo());
		            logger.debug("Tipo de Get: " + tipoGet.name());
				
					var queryStringParams = obtenerParametros(request);
	            	
					logger.debug(request.getPathInfo());
					
	            	UriID uriId = UtilesParse.separarUriDeId(request.getPathInfo());
	            	
	            	logger.debug(new Gson().toJson(uriId));
	            	
	            	/*
	            	String nombreCompuesto = obtenerNombreControllerSegunUrl(request.getPathInfo());
		            logger.debug("Instanciando: " + nombreCompuesto);
	            	*/
	            	
	            	RestApiController customController = 
	            			obtenerRestApiControllerSegunNombre(uriId.uri);
	            	
	            	Object returnValue = null;
	            	
	            	if (tipoGet == TipoDeGet.QUERY_STRING) {
	            		for (var key : queryStringParams.keySet()) {
	            			
	            		}
	            		returnValue = customController
		    	            	.onDoGetParams(queryStringParams);
	            	}
	            	else {
	            		returnValue = customController
	            				.onDoGetPorId(uriId.id);
	            	}
	            
	            	returnValue = new ResultadoOK(returnValue);
	            	
	            	String strResp = new Gson().toJson(returnValue);
	            	
	            	out.println(strResp);
	            	response.setStatus(200);
	            });
	    }
	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
	    		
		    	response.setContentType("application/json");
	            PrintWriter out = response.getWriter();
		    	
		    	UtilesHTTP.controlarRespuesta(response, () -> {
		    		String nombreCompuesto = obtenerNombreControllerSegunUrl(request.getPathInfo());
		            System.out.println("Instanciando: " + nombreCompuesto);
	            	
	            	RestApiController customController = 
	            			obtenerRestApiControllerSegunNombre(request.getPathInfo());
	            
	            	String strInput = null;
	            	
	            	try {
	            		strInput = UtilesStream.leerInputStream(request.getInputStream());
	            	}
	            	catch (Exception e) {
	            		throw new edu.it.errores.InternalServerError("");
	            	}
                	
	            	Object o = customController.onDoPost(strInput);
                	var strResp = new Gson().toJson(o);
                	response.setStatus(201);
                	out.println(strResp);
		    	});		    	
	    }
	    public void doPut(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
	    		
	    	UtilesHTTP.controlarRespuesta(response, () -> {
	    		String nombreCompuesto = obtenerNombreControllerSegunUrl(request.getPathInfo());
	            System.out.println("Instanciando: " + nombreCompuesto);
            	
	            UriID uriId = UtilesParse.separarUriDeId(request.getPathInfo());
	            
            	RestApiController customController = 
            			obtenerRestApiControllerSegunNombre(uriId.uri);
            
            	String strInput = null;
            	
            	try {
            		strInput = UtilesStream.leerInputStream(request.getInputStream());
            	}
            	catch (Exception e) {
            		throw new edu.it.errores.InternalServerError("");
            	}
            	
            	customController.onDoPut(uriId.id, strInput);
            	response.setStatus(201);
            	// out.println("");
	    	});
	    }
	    public void doDelete(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
	    	
	    	response.setContentType("application/json");
            PrintWriter out = response.getWriter();
	    	
	    	UtilesHTTP.controlarRespuesta(response, () -> {
	    		UriID uriId = UtilesParse.separarUriDeId(request.getPathInfo());
	    		System.out.println("0: " + uriId.uri);
	    		System.out.println("1: " + uriId.id);
	    		RestApiController customController = 
            			obtenerRestApiControllerSegunNombre(uriId.uri);
	    		
	    		UtilesValidacion.validarUUID(uriId.id);
	    		
	    		customController.onDelete(uriId.id);
	    		
	    		response.setStatus(200);
	    		Object z = new ResultadoOK("DELETED");
	    		String strResp = new Gson().toJson(z);
	    		out.println(strResp);
	    	});
	    }
}
