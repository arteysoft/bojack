package edu.it.qrextendido;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LeerArchivo {
	public static String leerArchivo() {
		try {
			File f = new File("/var/bojack/texto.txt");
			List<String> lstString = FileUtils.readLines(f, "utf-8");
			
			return String.join(System.lineSeparator(), lstString);
		}
		catch (Exception ex) {
			throw new RuntimeException("");
		}
	}
}
