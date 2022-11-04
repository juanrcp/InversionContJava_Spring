package com.app.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//CREAMOS UN OBJETO TIPO ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		//CREAMOS UN OBJETO TIPO BeanFactory
		BeanFactory factory = context;
		
		//CREAMOS UN OBJETO TIPO Medico Y LE REFERENCIAMOS EL factory ANTERIOR Y CONVOCAMOS AL METODO .getBean CON EL ATRIBUTO OPERA
		//DARA UN ERROR YA QUE NO ES TIPO MEDICO POR LO QUE CASTEAMOS
		Medico med = (Medico) factory.getBean("opera");
		
		//FINALMENTE APLICAMOS AL OBJETO MEDICO ANTERIOR EL METODO OPERA.
		med.operar();
		

	}

}
