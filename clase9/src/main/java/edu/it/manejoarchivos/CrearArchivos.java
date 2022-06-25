package edu.it.manejoarchivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;


public class CrearArchivos {
	private Logger logger = Logger.getLogger(getClass());
	private void crearCarpeta() {
		// TERMINAR EN CLASE
	}
	private void crearArchivo() {
		// TERMINAR EN CLASE
	}
	private String obtenerPathCompletoDirectorio(Integer subFolder) {
		final String pattern = "%03d" + "__%s";
		final String pathInicial = "/var/bojack/fs/";
		
		var directoryName = String.format(pattern, subFolder, "info");
		var pathCompleto = String.join("", pathInicial, directoryName);
		
		return pathCompleto;
	}
	private String obtenerPathCompletoArchivo(String dir, String nomArch) {
		String pathCompleto = String.join("/", dir, nomArch);
		return pathCompleto;
	}
	public void run() {
		try {
			for (int x = 0; x < 1000; x++) {
				var pathCompleto = obtenerPathCompletoDirectorio(x);
				Path path = Paths.get(pathCompleto);
				Files.createDirectory(path);
				
				var pathCompletoArch = obtenerPathCompletoArchivo(pathCompleto, "texto.txt");
				Path textFilePath = Paths.get(pathCompletoArch);
				Files.createFile(textFilePath);
			}
		}
		catch (Exception ex) {
			logger.error(ex.getMessage());
		}
	}
}
