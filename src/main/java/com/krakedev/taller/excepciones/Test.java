package com.krakedev.taller.excepciones;

public class Test {
	
	public static void main(String[] args) {


		
		try {
			//valida el telefono si tiene 10 digitos
			ValidarContacto.validarTelefono("1234567890");
			//guarda contacto
			GuardarContacto guardarC= new GuardarContacto();
			guardarC.guarda();
			
			//lee contacto
			LeerContacto leerC=new LeerContacto();
			leerC.lee();
			
		} catch (IllegalArgumentException e) {//captura la exepcion propagada
			//imprime el error reelanzado o propagada
			System.out.println(e.getMessage());
		}
		
		

	}

}
