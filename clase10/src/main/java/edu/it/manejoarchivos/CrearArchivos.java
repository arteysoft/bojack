package edu.it.manejoarchivos;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class CrearArchivos {
	private Logger logger = Logger.getLogger(getClass());
	private void crearCarpeta(String pathCompleto) {
		try {
			Path path = Paths.get(pathCompleto);
			Files.createDirectory(path);
		}
		catch (Exception ex) {
			throw new RuntimeException();
		}
	}
	private void crearArchivo(String pathCompletoArch) {
		try {
			Path textFilePath = Paths.get(pathCompletoArch);
			Files.createFile(textFilePath);
		}
		catch (Exception ex) {
			throw new RuntimeException();
		}
	}
	private String formatearEn3ConCeros(Integer n) {
		final String pattern = "%03d";
		return String.format(pattern, n);
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
	private List<String> obtenerTitulo(Integer nroEjercicio) {
		var ls = new ArrayList<String>();
		ls.add("--------------");
		ls.add("Ejercicio #" + formatearEn3ConCeros(nroEjercicio));
		ls.add("--------------");
		ls.add("");
		ls.add("");
		
		return ls;
	}
	public void run() {
		try {
			for (int x = 0; x < 1000; x++) {
				var pathCarpeta = obtenerPathCompletoDirectorio(x);
				crearCarpeta(pathCarpeta);
				
				var pathCompletoArch = obtenerPathCompletoArchivo(pathCarpeta, "texto.txt");
				crearArchivo(pathCompletoArch);
				
				File file = new File(pathCompletoArch);
				org.apache.commons.io.FileUtils.writeLines(file, "utf-8", obtenerTitulo(x));
			}
		}
		catch (Exception ex) {
			logger.error(ex.getMessage());
		}
	}
}
