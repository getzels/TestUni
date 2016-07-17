package unisigma.cliente.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import unisigma.util.MessageUtil;
import unisigma.ws.Persona;
import unisigma.ws.PersonaService;
import unisigma.ws.PersonaServiceImpService;

@ManagedBean
@RequestScoped
public class PersonaBean {

	private Persona persona;
	PersonaService personaWS = new PersonaServiceImpService().getPersonaServiceImpPort();

	public PersonaBean() {
	}

	public void buscaPersona() {

		if (persona.getIdpersona() > 0) {
			this.persona = personaWS.findPersonaById(new Persona(persona.getIdpersona()));
		} else {
        MessageUtil.mensajeError("Error consultado la persona " + persona.getIdpersona());
		}
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
