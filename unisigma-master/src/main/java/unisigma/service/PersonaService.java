/**
 * PersonaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unisigma.service;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebService;

import unisigma.domain.Persona;

@Remote
@WebService
public interface PersonaService {
 
	List<Persona> findAllPersona();
	
	Persona findPersonaById(Persona persona);
	
	void addPersona(Persona persona);
	
	void updatePersona(Persona persona);
	
	void deletePersona(Persona persona);
	
	
	
}