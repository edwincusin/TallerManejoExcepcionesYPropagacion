package com.krakedev.taller.excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	
	//instanciamos el objeto de logger de logBack
	private static final Logger log=LoggerFactory.getLogger(GuardarContacto.class);
	
	public static void guardar(String telefono) {
		FileWriter escritor=null;
			
		try {
			escritor=new FileWriter("contactos.txt",true);
			escritor.write("Nombre: Edwin  \n");
			escritor.write("Apellido: Cusin \n");
			escritor.write("Telefono: "+telefono+"  \n");
			
			log.info("Se guardo con exito. ");
		} catch (IOException e) {
			log.error("Error al tratar de escribir y guardar el contacto : "+e.getMessage());
		} catch (Exception e) {
		log.error("Error: exepcion general " + e.getMessage()); //BUENAS PRACTICAS UN CATCH UNIVERSAL
	}
		finally {
			try {
				if(escritor!=null) {
					escritor.close();
				}				
			} catch (IOException e) {
				log.error("Error al cerrar el archivo " + e.getMessage());
			}
		}	
	}
	
	
}
