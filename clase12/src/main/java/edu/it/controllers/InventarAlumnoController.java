package edu.it.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import edu.it.basededatos.UtilesAlumno;

public class InventarAlumnoController extends HttpServlet {
	Logger logger = Logger.getLogger(getClass());
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {
	            response.setContentType("application/json");
	            PrintWriter out = response.getWriter();
	            
	            try {
	            	var alu = UtilesAlumno.generarAlumnoRandom();
	            	String json = new Gson().toJson(alu);
	                
	                out.println(json);
	                response.setStatus(200);
	            }
	            catch (Exception ex) {
	            	throw new IOException(ex.getMessage());
	            }
	}
}
