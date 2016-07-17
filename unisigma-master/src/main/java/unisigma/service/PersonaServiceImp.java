package unisigma.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import unisigma.domain.Persona;
import unisigma.eis.PersonaDao;

@Stateless
@WebService//(endpointInterface = "unisigma.service.PersonaService")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonaServiceImp implements PersonaService {

	@EJB
	PersonaDao personaDao;

	@Override
	public List<Persona> findAllPersona() {
		return personaDao.findAllPersona();
	}

	@Override
	public Persona findPersonaById(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.findPersonaById(persona);
	}

	@Override
	public void addPersona(Persona persona) {
		personaDao.addPersona(persona);
	}

	@Override
	public void updatePersona(Persona persona) {
		personaDao.updatePersona(persona);

	}

	@Override
	public void deletePersona(Persona persona) {
		personaDao.deletePersona(persona);

	}

}
