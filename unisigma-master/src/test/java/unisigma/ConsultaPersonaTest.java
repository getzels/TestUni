package unisigma;

import java.util.List;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import unisigma.domain.Persona;
import unisigma.eis.PersonaDao;
import unisigma.eis.PersonaDaoImp;
import unisigma.service.PersonaService;
import unisigma.service.PersonaServiceImp;

//@RunWith(Arquillian.class)
public class ConsultaPersonaTest {

	//@Deployment
	public static WebArchive  createTestArchive() {
		WebArchive arch = ShrinkWrap.create(WebArchive.class, "test2.war");
		arch.addClasses(PersonaService.class, PersonaServiceImp.class, PersonaDao.class, PersonaDaoImp.class,
				Persona.class);
		arch.addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml");
		///arch.addAsManifestResource(new FileAsset(new File("src/main/java/META-INF/persistence.xml")), "persistence.xml");

		return arch;

	}
	
	@EJB(mappedName = "java:global/classes/PersonaServiceImp!unisigma.service.PersonaService")
	PersonaService personaService;
	
	//@Test
	public void testPersona(){
		
		List<Persona> personas = personaService.findAllPersona();
		
		for(Persona persona : personas){
			System.out.println("Lista de personas");
			System.out.println(persona);
			System.out.println("Fin lista de personas");
		}
		
		Persona persona = personaService.findPersonaById(new Persona(1));
		System.out.println("Busqueda de persona por id");
		   System.out.println(persona);
	}
	
}
