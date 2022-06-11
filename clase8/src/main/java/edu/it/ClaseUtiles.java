package edu.it;

import org.apache.log4j.Logger;

public class ClaseUtiles {
	Logger logger = Logger.getLogger(getClass());
	public void run() {
		/*
		 * El logger tiene 5 niveles segun la importancia de aquello
		 * que voy a loggear trace, debug, info, warn, error
		 * Como hacemos para configurar en que nivel nos vamos a parar
		 * */
		for (;;) {
			logger.trace("Este es un mensaje solo para saber q esta vivo el proceso");
			logger.debug("Este mira una variable en memoria");
			logger.info("Informacion relevante del sistema");
			logger.warn("Cuidado con esto que es un warning");
			logger.error("Error, hay que corregir ? o no ?");
			
			try { Thread.sleep(20); } catch (Exception ex) {}
		}
	}
}
