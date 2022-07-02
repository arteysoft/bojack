package edu.it.manejoarchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class LeerYModificar {
	private static byte[] leerInput() {
		try {
			// Leer el mapa de bits en un array de bytes
			File archivoInput = new File("/var/tmp/bojack/pehuamar.bmp");
			System.out.println(archivoInput.exists());
			
			int largoTotalArchivo = (int)archivoInput.length();
			byte[] buffer = new byte[largoTotalArchivo];
			
			InputStream isr = new FileInputStream(archivoInput);
			isr.read(buffer, 0, largoTotalArchivo);
	
			isr.close();
			
			return buffer;
		}
		catch (Exception ex) {
			throw new RuntimeException();
		}
	}
	private static void transformarArray(byte[] transformar) {
		for (int x = 500000; x < 800000; x++) {
			byte plus = 50;
			transformar[x] += plus;
		}
	}
	private static void escribirOutput(byte[] arrOutput) {
		try {
			File archivoOutput = new File("/var/tmp/bojack/output.bmp");
			FileOutputStream out = new FileOutputStream(archivoOutput);
			out.write(arrOutput, 0, arrOutput.length);
			out.flush();
			out.close();
		}
		catch (Exception ex) {
			throw new RuntimeException();
		}	
	}
	public static void run() {
		try {
			var arr = leerInput();
			transformarArray(arr);
			escribirOutput(arr);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
