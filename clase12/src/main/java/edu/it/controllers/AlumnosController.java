package edu.it.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import edu.it.basededatos.ConnectionCreator;
import edu.it.basededatos.ConnectionCreatorMariaDB;
import edu.it.basededatos.PruebaBaseDeDatos;
import edu.it.basededatos.UtilesAlumno;
import edu.it.entities.Alumno;

public class AlumnosController extends HttpServlet {
	Logger logger = Logger.getLogger(getClass());
	
    private void crearEinsertarEnBD(Alumno alu) throws Exception {
    	ConnectionCreator creator = new ConnectionCreatorMariaDB();
    	var conn = creator.crearConexion();
    	new PruebaBaseDeDatos().insertar(conn, alu);
    }
	private List<Alumno> traerAlumnosBaseDeDatos() throws Exception {
		ConnectionCreator creator = new ConnectionCreatorMariaDB();
    	var conn = creator.crearConexion();
		return new PruebaBaseDeDatos().obtenerAlumnos(conn);
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            
            try {
            	var listaAlu = traerAlumnosBaseDeDatos();
            	String json = new Gson().toJson(listaAlu);
                
                out.println(json);
                response.setStatus(200);
            }
            catch (Exception ex) {
            	throw new IOException(ex.getMessage());
            }
    }
	public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
		
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        try {
        	InputStream is = request.getInputStream();
        	InputStreamReader isr = new InputStreamReader(is);
        	BufferedReader br = new BufferedReader(isr);
        	
        	// Deberiamos leer lineas hasta agotar el stream
        	// luego convertir a formato objeto. Recordemos que es JSON
        	var conversor = new Gson();
        	
        	var aluBinario = conversor.fromJson(br, Alumno.class);
        	System.out.println(aluBinario);
        	crearEinsertarEnBD(aluBinario);
        }
        catch (Exception ex) {
        	logger.error(ex.getMessage());
        	throw new IOException();
        }
        
        ArrayList<Object> mapa =
        		new ArrayList<>();
        
        mapa.add("Alumno");
        mapa.add("Creado");
        
        String json = new Gson().toJson(mapa);
        
        out.println(json);
        response.setStatus(201);		
	}
}
