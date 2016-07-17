package unisigma;

import java.io.File;
import java.util.Date;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.FileAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import unisigma.domain.Persona;
import unisigma.eis.PersonaDao;
import unisigma.eis.PersonaDaoImp;
import unisigma.service.PersonaService;
import unisigma.service.PersonaServiceImp;

//@RunWith(Arquillian.class)
public class TestPersonaDaoImp {

	//@Deployment
	public static WebArchive  createTestArchive() {
		WebArchive arch = ShrinkWrap.create(WebArchive.class, "test.");
		arch.addClasses(PersonaService.class, PersonaServiceImp.class, PersonaDao.class, PersonaDaoImp.class,
				Persona.class);
		arch.addAsManifestResource(new FileAsset(new File("src/main/java/META-INF/persistence.xml")), "persistence.xml");

		return arch;

	}

	@EJB(mappedName = "java:global/classes/PersonaServiceImp!unisigma.service.PersonaService")
	PersonaService personaService; 

	// @Test
	 public void testPersona() {
	 System.out.println("***********Inicio de la prueba*******************************");
	 // Inserta persona
	 Persona persona = new Persona("De Los Santos",
	 "get.delossantos@gmail.com", "Respaldo simon Bolivar",
	 new Date(), "Getzels Xavier", "M");
	
	 personaService.addPersona(persona);
	 }
	

	
}
	


