package com.krakedev.taller.excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	
	//instanciamos el objeto de logger de logBack
	private static final Logger log=LoggerFactory.getLogger(GuardarContacto.class);
	
	public  void guarda() {
		FileWriter escritor=null;
			
		try {
			escritor=new FileWriter("contactos.txt",true);
			escritor.write("Nombre: Edwin  \n");
			escritor.write("Apellido: Cusin \n");
			escritor.write("Telefono: 0981234567 \n");
			
			log.info("Se guardo con exito. ");
		} catch (IOException e) {
			log.error("Error al guardar contacto : "+e.getMessage());
		}
		finally {
			try {
				escritor.close();
			} catch (IOException e) {
				log.error("Error al cerrar lector FileWriter " + e);
			}
		}	
	}
	
	
}
