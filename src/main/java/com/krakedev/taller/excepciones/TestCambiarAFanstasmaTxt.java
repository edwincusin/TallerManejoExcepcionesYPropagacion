package com.krakedev.taller.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCambiarAFanstasmaTxt {
	private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);
	public static void main(String[] args) {

			FileReader lectorArchivo = null;
			BufferedReader leerlinea = null;

			try {
				//aqui modifico el nombre del archivo el cual no existe o no feu creado el unico que existe es de nombre contactos.txt, 
				//o puedo modificar en si el nombre del archivo txt
				//pero desde el codigo le veo mas practico con el mismo resultado en la solucion.
				lectorArchivo = new FileReader("fantasma.txt");
				
				leerlinea = new BufferedReader(lectorArchivo);
				String linea = "";
				for (linea = leerlinea.readLine(); linea != null; linea = leerlinea.readLine()) {
					log.info(linea);
				}

			} catch (FileNotFoundException e) {
				log.error("Archivo contactos no ecnontrado: " + e.getMessage());
			} catch (IOException e) {
				log.error("Error al realizar lectura de linea por linea " + e.getMessage());
			} catch (Exception e) {
				log.error("Error: exepcion general " + e.getMessage()); //BUENAS PRACTICAS UN CATCH UNIVERSAL
			} finally {				

					try {
						if(lectorArchivo!=null) {
							lectorArchivo.close();
						}
						if(leerlinea!=null) {
							leerlinea.close();
						}
						
					} catch (IOException e) {
						log.error("Error al cerrar el archivo " +e.getMessage());
					}

			}

		}
	

}
