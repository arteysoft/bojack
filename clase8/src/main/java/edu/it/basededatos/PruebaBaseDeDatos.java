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
	public void run() {
		try {
			logger.debug("Intentando con la parte static del Driver");
			Class.forName ("org.mariadb.jdbc.Driver");
			logger.debug("Abriendo base de datos");
			var connStr = "jdbc:mariadb://localhost:3306/bojack";
			var conn = java.sql.DriverManager.getConnection(connStr, "root", "");
			
			for (Integer x = 1; x <= 2000; x++) {
				var alumno = UtilesAlumno.generarAlumnoRandom();
				insertar(conn, alumno);
			}
			
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
