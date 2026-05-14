package com.krakedev.taller.excepciones;

import javax.swing.DefaultRowSorter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidarContacto {

	
	public static void validarTelefono(String telefono) throws IllegalArgumentException{
		int longitud = telefono.length();
		
		if(longitud!=10) {
			throw new  IllegalArgumentException("El telefono debe tener 10 digitos exactos");
		}
	}
}
