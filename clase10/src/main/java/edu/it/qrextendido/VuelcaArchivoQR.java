package edu.it.qrextendido;

public class VuelcaArchivoQR {
	public static void run() {
		var txt = LeerArchivo.leerArchivo();
		EjemploQR.run(txt);
	}
}
