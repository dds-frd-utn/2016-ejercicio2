package org.frd.view;

import java.util.Scanner;

import org.frd.control.Abm;
import org.frd.domain.Persona;

public class Programa {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		Abm abm = new Abm();
		
		//Inicializacion
		abm.crearNuevo(args[0], Integer.parseInt(args[1]) , args[2]);
		
		//Funcionamiento
		while(continua){
			String comando = s.nextLine();
			
			if( "l".equals(comando) ){
				System.err.println("Lista de Personas");
				for(Persona p : abm.getAll()){
					System.out.println(p);
				}
			}
			
			if( "b".equals(comando) ){
				System.err.println("Eliminar Personas (nombre)");
				// TODO llamar al metodo borrar de la instancia abm enviando como paramtero
				// lo que ingresa el usuario en la consola
			}

			if( "a".equals(comando) ){
				System.err.println("Alta de Personas (nombre, edad, ciudad)");
				// TODO tomar los los valores que ingreso el usuario: nombre edad y ciudad
				// enviarlos al metodo crearNuevo de la instancia abm
			}

			if( "m".equals(comando) ){
				System.err.println("Alta de Personas (nombre, edad, ciudad)");
				// TODO tomar los los valores que ingreso el usuario: nombre edad y ciudad
				// con el nombre, obtener el objeto Persona a traves del método del abm
				// enviar ese objeto Persona como parametro al metodo modificar
			}

			if( "x".equalsIgnoreCase(comando) ){
				break;
			}
		}
	}

}
