package com.krakedev.taller.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {

	private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);

	public void lee() {
		FileReader lector = null;
		BufferedReader leerlinea = null;

		try {
			lector = new FileReader("contactos.txt");

			leerlinea = new BufferedReader(lector);
			String linea = "";
			for (linea = leerlinea.readLine(); linea != null; linea = leerlinea.readLine()) {
				log.info(linea);
			}

		} catch (FileNotFoundException e) {
			log.error("Archivo contactos no ecnontrado: " + e);
		} catch (IOException e) {
			log.error("Error al realizar lectura de linea por linea " + e);
		} finally {
			try {
				leerlinea.close();
			} catch (IOException e) {
				log.error("Error al cerrar leerLinea BufferedReader " + e);
			}
		}

	}

}
