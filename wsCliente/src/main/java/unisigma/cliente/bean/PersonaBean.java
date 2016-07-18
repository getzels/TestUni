package unisigma.cliente.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import unisigma.util.MessageUtil;
import unisigma.ws.Persona;
import unisigma.ws.PersonaService;
import unisigma.ws.PersonaServiceImpService;

@ManagedBean
@SessionScoped
public class PersonaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Persona persona;
	private PersonaService personaWS = new PersonaServiceImpService().getPersonaServiceImpPort();
	private List<Persona> personas;

	public PersonaBean() {
	}

	@PostConstruct
	public void init() {
		System.out.println("Inicio del metodo init");
		persona = new Persona();
        personas = personaWS.findAllPersona();
		System.out.println("Persona inicializada " + persona);
	}

	public void buscaPersona() {
		try {
			System.out.println("Inicio del metodo " + this.persona);
			if (persona.getIdpersona() > 0) {
				this.persona = personaWS.findPersonaById(persona);
				System.out.println("Persona consultada " + persona);
			} else {
				MessageUtil.mensajeError("Error consultado la persona " + persona.getIdpersona());
			}
		} catch (Exception e) {
			MessageUtil.mensajeError("Error consultado la persona " + persona.getIdpersona());
		}
	}

	public void insertaPersona() {
		try {
			System.out.println("Inicio del metodo insertaPersona " + this.persona);
			if (persona != null) {
				personaWS.addPersona(persona);
			} else {
				MessageUtil.mensajeError("Error insertando la persona " + persona.getIdpersona());
			}
		} catch (Exception e) {
			MessageUtil.mensajeError("Error insertando la persona " + persona.getIdpersona());
		}finally{
			this.init();	
		}
	}

	public void actualizaPersona() {
		try {
			System.out.println("Inicio del metodo actualizaPersona" + this.persona);
			if (persona.getIdpersona() > 0 && persona.getNombre() != null) {
				personaWS.updatePersona(persona);
			} else {
				MessageUtil.mensajeError("Error actualizando la persona " + persona.getIdpersona());
			}
		} catch (Exception e) {
			MessageUtil.mensajeError("Error actualizando la persona " + persona.getIdpersona());
		}finally{
			this.init();	
		}
	}

	public void borrarPersona() {
		try {
			System.out.println("Inicio del metodo borrarPersona" + this.persona);
			if (persona != null) {
				personaWS.deletePersona(persona);
			} else {
				MessageUtil.mensajeError("Error borrando la persona " + persona.getIdpersona());
			}
			
		} catch (Exception e) {
			MessageUtil.mensajeError("Error borrando la persona " + persona.getIdpersona());
		}finally{
			this.init();	
		}
	}

	public void limpiaPersona() {
		this.init();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

}
