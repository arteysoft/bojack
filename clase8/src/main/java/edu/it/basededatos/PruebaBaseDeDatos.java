package edu.it.basededatos;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class PruebaBaseDeDatos {
	Logger logger = Logger.getLogger(getClass());
	private void insertar(Connection conn, Alumno alumno) throws SQLException {
		logger.info("Voy a insertar el alumno");
		logger.info(alumno.toString());
		
		/* java.sql.Statement */
		var strSQL = new StringBuilder()
				.append("INSERT alumnos ")
				.append("(id, nombre, apellido, calle, calleNumero, estado, pais) ")
				.append("VALUES (?,?,?,?,?,?,?)")
				.toString();
		
		var stm = conn.prepareStatement(strSQL);
		stm.setString(1, alumno.id);
		stm.setString(2, alumno.nombre);
		stm.setString(3, alumno.apellido);
		stm.setString(4, alumno.calle);
		stm.setString(5, alumno.calleNumero);
		stm.setString(6, alumno.estado);
		stm.setString(7, alumno.pais);
		
		stm.execute();
		stm.close();
	}
	private void deletePorApellido(Connection conn, String apellido) throws Exception {
		logger.info("Voy a borrar los alumnos con apellido: " + apellido);
		
		var strSQL = new StringBuilder()
				.append("DELETE FROM alumnos ")
				.append("WHERE apellido = ?")
				.toString();
	
		var stm = conn.prepareStatement(strSQL);
		stm.setString(1, apellido);
		stm.execute();
		
		var filasAfectadas = stm.getUpdateCount();
		logger.info("Total de filas afectadas: " + filasAfectadas);
		
		stm.close();
	}
	private void deletePorApellidoPrefijado(Connection conn, String apellidoIni) throws SQLException {
		logger.info("Voy a borrar los alumnos con prefijo apellido: " + apellidoIni);
		
		var strSQL = new StringBuilder()
				.append("DELETE FROM alumnos ")
				.append("WHERE apellido LIKE ?")
				.toString();
	
		var stm = conn.prepareStatement(strSQL);
		stm.setString(1, "%" + apellidoIni + "%");
		stm.execute();
		
		var filasAfectadas = stm.getUpdateCount();
		logger.info("Total de filas afectadas: " + filasAfectadas);
		
		stm.close();
	}
	public void run() {
		try {
			logger.debug("Intentando con la parte static del Driver");
			Class.forName ("org.mariadb.jdbc.Driver");
			logger.debug("Abriendo base de datos");
			var connStr = "jdbc:mariadb://localhost:3306/bojack";
			var conn = java.sql.DriverManager.getConnection(connStr, "root", "");
			
			/*
			for (Integer x = 1; x <= 2000; x++) {
				var alumno = UtilesAlumno.generarAlumnoRandom();
				insertar(conn, alumno);
			}
			*/
			
			// deletePorApellido(conn, "Glover");
			deletePorApellidoPrefijado(conn, "u");
			
			conn.close();
			logger.debug("Cerrando base de datos");
		}
		catch (SQLException ex) {
			logger.error("SQLException");
			logger.error(ex.getMessage());
		}
		catch (Exception ex) {
			logger.error("Exception");
			logger.error(ex.getMessage());
		}
	}
}