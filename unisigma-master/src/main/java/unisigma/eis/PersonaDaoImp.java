package unisigma.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import unisigma.domain.Persona;

@Stateless
public class PersonaDaoImp implements PersonaDao {

    @PersistenceContext(unitName = "unisigmaPU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> findAllPersona() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Persona.findAll").getResultList();
	}

	@Override
	public Persona findPersonaById(Persona persona) {
		Query query = em.createQuery("select p from Persona p where p.idpersona = :id");
		query.setParameter("id", persona.getIdpersona());
		return (Persona) query.getSingleResult();
	}

	@Override
	public void addPersona(Persona persona) {
		em.persist(persona);

	}

	@Override
	public void updatePersona(Persona persona) {
		em.merge(persona);

	}

	@Override
	public void deletePersona(Persona persona) {
		Persona persona2 = em.find(Persona.class, persona.getIdpersona());
		em.remove(persona2);
	}

}
