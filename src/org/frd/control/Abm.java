package org.frd.control;

import java.util.ArrayList;
import java.util.List;

import org.frd.domain.Persona;

public class Abm {
	
	private List<Persona> personas = new ArrayList<Persona>();

	public Persona crearNuevo(String nombre, int edad, String ciudad){
		Persona p = new Persona();
		p.setNombre(nombre);
		p.setEdad(edad);
		p.setCiudad(ciudad);
		
		personas.add(p);
		return p;
	}
	
	public void borrar(String nombre){
		Persona p = get(nombre);
		personas.remove(p);
	}
	
	public void modificar(Persona persona){
		Persona p = get(persona.getNombre());
		
		p.setCiudad(persona.getCiudad());
		p.setEdad(persona.getEdad());
	}
	
	private Persona get(String nombre){
		Persona result = null;
		for(Persona p : personas){
			if( nombre.equals( p.getNombre() ) ){
				result = p;
				break;
			}
		}
		return result;
	}
	
	public List<Persona> getAll(){
		return personas;
	}
	
}
