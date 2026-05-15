package com.krakedev.taller.excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);
	public static void main(String[] args) {
		
		//Corre con teléfono "123" — debe entrar al catch y no guardar nada
		String telefono="123";
		try {
			//valida el telefono si tiene 10 digitos
			ValidarContacto.validarTelefono(telefono);
			log.info("Telefono validado correctamente");
			
			//guarda contacto
			GuardarContacto.guardar(telefono);
			log.info("se guardo contacto  correctamente");
			
			//lee contacto
			LeerContacto.lee();
			log.info("se leyeron todas las lineas correctamente");
			
		} catch (IllegalArgumentException e) {//captura la exepcion propagada
			//imprime el error reelanzado o propagada
			log.error(e.getMessage());
		}catch (Exception e) {
			log.error("ERROR GENERAL "+e.getMessage()); // BUENAS PRACTICAS AGREGAR UNCATCH UNIVERSAL
		}
		
		System.out.println("\n\n");
		
		//Corre con teléfono "0981234567" — debe guardar y leer correctamente
		 telefono="0981234567";
		try {
			//valida el telefono si tiene 10 digitos
			ValidarContacto.validarTelefono(telefono);
			log.info("Telefono validado correctamente");
			
			//guarda contacto
			GuardarContacto.guardar(telefono);
			log.info("se guardo contacto  correctamente");
			
			//lee contacto
			LeerContacto.lee();
			log.info("se leyeron todas las lineas correctamente");
			
		} catch (IllegalArgumentException e) {//captura la exepcion propagada
			//imprime el error reelanzado o propagada de validar telefono
			log.error(e.getMessage());
		}catch (Exception e) {
			log.error("ERROR GENERAL "+e.getMessage()); // BUENAS PRACTICAS AGREGAR UNCATCH UNIVERSAL
		}
		

	}

}
