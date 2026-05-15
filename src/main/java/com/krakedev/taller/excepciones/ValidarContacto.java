package com.krakedev.taller.excepciones;

public class ValidarContacto {

	

	public static void validarTelefono(String telefono) throws IllegalArgumentException{
		int longitud = telefono.length();
		
		if(longitud!=10) {
			throw new  IllegalArgumentException("ERROR: El telefono debe tener 10 digitos exactos");
		}
	}
}
