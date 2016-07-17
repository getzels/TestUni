package unisigma_ClienteWS;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import unisigma.ws.Persona;
import unisigma.ws.PersonaService;
import unisigma.ws.PersonaServiceImpService;

public class TestPersonaWS {

	private Persona persona;
	
	
	public static void main(String[] args) throws DatatypeConfigurationException {
		
		PersonaService personaWS = new PersonaServiceImpService().getPersonaServiceImpPort();
		
		
		
		System.out.println("Ejecutando el Servicio Web");
		
		GregorianCalendar calendar = new  GregorianCalendar();
		calendar.setTime(new Date());
		XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		
		
		Persona persona = new Persona("Cabrera Batista","keyzels@gmail.com","Francisco del rosario sachez ",date,"Getzels Nicolas","s");
		
		System.out.println("Insertando la persona " + persona);
		personaWS.addPersona(persona);
		
		List<Persona> personas = personaWS.findAllPersona();
		
		for (Persona persona1 : personas){
			System.out.println(persona1);
		}
		
		System.out.println("Fin de ejecucion del programa.");
		
		
		//buscaPersona();
		
		//personaWS.

	}
	


}
