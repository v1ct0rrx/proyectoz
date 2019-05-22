package com.vvelazquez.servicios.persona;

import java.util.Date;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintLogAspecto {
	
	private static final Logger LOGGER = Logger.getLogger(PrintLogAspecto.class);
	
	/**
	 * Este metodo se ejecuta al ingresar a uno de los metodos definidos dentro del paquete uabc.escolar.* . 
	 * Aqui obtenemos el usuario en sesion y los datos enviados al mismo metodo.
	 * Con la anotacion Before definimos que este se ejecutara en cuanto el metodo sea invocado.
	 * 
	 * @param joinPoint (Variable que contiene las firmas del metodo { tipo de objeto y valor que reciben los metodos } )
	 */
	@Before("execution(* com.vvelazquez..*(..))")
	public void printLogMetodo(JoinPoint joinPoint){

		//Se obtienes los parametros del metodo ejecutado.
		Object[] parametros = new Object[1];
		StringBuilder id = new StringBuilder();
		id.append("{" + "Clase: " + joinPoint.getSignature() + ",Hora: " + new Date());
				
		StringBuilder mensaje = new StringBuilder("");
		
		if(joinPoint.getArgs() != null){
			parametros = joinPoint.getArgs();
			mensaje.append("Informacion adicional:");
		}
		
		for(Object parametro: parametros){
			mensaje.append(", ");
			mensaje.append(parametro);
			
			if(parametro instanceof Exception){
				LOGGER.error(parametro);
			}
		}
		
		mensaje.append(" }");
		id.append(mensaje);
		
		LOGGER.info(id);
	}

}
