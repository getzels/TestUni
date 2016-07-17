package unisigma.eis;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebService;

import unisigma.domain.Persona;

@Remote
@WebService
public interface PersonaDao {
 
	List<Persona> findAllPersona();
	
	Persona findPersonaById(Persona persona);
	
	void addPersona(Persona persona);
	
	void updatePersona(Persona persona);
	
	void deletePersona(Persona persona);
	
	
	
}
