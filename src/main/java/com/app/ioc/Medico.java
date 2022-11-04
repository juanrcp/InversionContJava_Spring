package com.app.ioc;

public class Medico {
	
	IUtensilios utensilio;
	
	public void setUtensilio(IUtensilios ute) {
		
		this.utensilio = ute;
		
	}
	
	//CON ESTE METODO COMPROBAMOS QUE UTELSILIO USAMOS 
	public void operar() {
		
		System.out.println("Operando!!!!");
		utensilio.usar();
		
	}

}
