package edu.it.basededatos;

import java.sql.SQLException;

import org.apache.log4j.Logger;

public class PruebaBaseDeDatos {
	Logger logger = Logger.getLogger(getClass());
	
	public void run() {
		try {
			logger.debug("Intentando con la parte static del Driver");
			Class.forName ("org.mariadb.jdbc.Driver");
			logger.debug("Abriendo base de datos");
			var connStr = "jdbc:mariadb://localhost:3306/bojack";
			var conn = java.sql.DriverManager.getConnection(connStr, "root", "");
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
