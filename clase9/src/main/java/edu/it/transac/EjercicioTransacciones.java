package edu.it.transac;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import edu.it.basededatos.ConnectionCreator;

public class EjercicioTransacciones {
	private Logger logger = Logger.getLogger(getClass());
	
	private void actualizarSaldo(Connection conn, Integer importe) throws SQLException {
		var stm = conn.prepareStatement("UPDATE saldos set saldo = saldo + ?");
		stm.setInt(1, importe.intValue());
		stm.execute();
	}
	private void realizarMovimiento(Connection conn, Integer importe) throws SQLException {
		var stm = conn.prepareStatement("INSERT INTO movimientos VALUES (?)");
		stm.setInt(1, importe.intValue());
		stm.execute();
	}
	public void run(ConnectionCreator connectionCreator) {
		try {
			var conn = connectionCreator.crearConexion();
			var importe = 100;
			realizarMovimiento(conn, importe);
			actualizarSaldo(conn, importe);
			conn.close();
		}
		catch (Exception ex) {
			logger.error(ex);
		}
	}
}
