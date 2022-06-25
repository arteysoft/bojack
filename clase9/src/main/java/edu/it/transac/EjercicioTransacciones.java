package edu.it.transac;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

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
	private void generarErrorDeManeraRandom() {
		if (new Random().nextBoolean()) {
			logger.info("Voy a forzar un error");
			throw new RuntimeException("Error forzaddo");
		}
		logger.info("No se genero error alguno");
	}
	public void run(ConnectionCreator connectionCreator) {
		java.sql.Connection conn = null;
		
		try {
			conn = connectionCreator.crearConexion();
			var importe = 200;
			conn.setAutoCommit(false);
			realizarMovimiento(conn, importe);
			generarErrorDeManeraRandom();
			actualizarSaldo(conn, importe);
			conn.commit();
		}
		catch (Exception ex) {
			logger.error(ex);
			try { conn.rollback(); } catch (Exception ex2) {}
		}
		finally {
			try { conn.close(); } catch (Exception ex) {}
		}
	}
}
