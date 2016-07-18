Synopsis

Aplicacion web que nos permite realizar mantenimiento a travez de un formulario (CRUD) a la data de los ciudadanos, la misma nos permite
crear, actualizar, consultar y borrar la informacion de nuesta base de datos.

Code Example

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


Installation

Esta disponible el archivo Persona.sql que contiene el script para la base de datos MySql y adjunto carpeta con servidor wildfly 8.1.

API Reference

Las APIs que se utilizaron estan EJB en la capa de servicio, JPA en la capa de datos, SOAP Web service para exponer los metodos de la capa de 
servicio, JSF en en cliente para consumir el servicio web.

Tests

El proyecto cuenta nos las puebas unitarios tanto de las capa de servicio/datos como en el proyecto del cliente test del servicio web.

Preguntas y observaciones get.delossantos@gmail.com
