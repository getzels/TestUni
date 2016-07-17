
package unisigma.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the unisigma.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindPersonaById_QNAME = new QName("http://service.unisigma/", "findPersonaById");
    private final static QName _AddPersona_QNAME = new QName("http://service.unisigma/", "addPersona");
    private final static QName _FindAllPersona_QNAME = new QName("http://service.unisigma/", "findAllPersona");
    private final static QName _UpdatePersona_QNAME = new QName("http://service.unisigma/", "updatePersona");
    private final static QName _AddPersonaResponse_QNAME = new QName("http://service.unisigma/", "addPersonaResponse");
    private final static QName _FindPersonaByIdResponse_QNAME = new QName("http://service.unisigma/", "findPersonaByIdResponse");
    private final static QName _DeletePersona_QNAME = new QName("http://service.unisigma/", "deletePersona");
    private final static QName _UpdatePersonaResponse_QNAME = new QName("http://service.unisigma/", "updatePersonaResponse");
    private final static QName _DeletePersonaResponse_QNAME = new QName("http://service.unisigma/", "deletePersonaResponse");
    private final static QName _FindAllPersonaResponse_QNAME = new QName("http://service.unisigma/", "findAllPersonaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: unisigma.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindPersonaById }
     * 
     */
    public FindPersonaById createFindPersonaById() {
        return new FindPersonaById();
    }

    /**
     * Create an instance of {@link AddPersona }
     * 
     */
    public AddPersona createAddPersona() {
        return new AddPersona();
    }

    /**
     * Create an instance of {@link FindAllPersona }
     * 
     */
    public FindAllPersona createFindAllPersona() {
        return new FindAllPersona();
    }

    /**
     * Create an instance of {@link UpdatePersona }
     * 
     */
    public UpdatePersona createUpdatePersona() {
        return new UpdatePersona();
    }

    /**
     * Create an instance of {@link AddPersonaResponse }
     * 
     */
    public AddPersonaResponse createAddPersonaResponse() {
        return new AddPersonaResponse();
    }

    /**
     * Create an instance of {@link FindPersonaByIdResponse }
     * 
     */
    public FindPersonaByIdResponse createFindPersonaByIdResponse() {
        return new FindPersonaByIdResponse();
    }

    /**
     * Create an instance of {@link DeletePersona }
     * 
     */
    public DeletePersona createDeletePersona() {
        return new DeletePersona();
    }

    /**
     * Create an instance of {@link UpdatePersonaResponse }
     * 
     */
    public UpdatePersonaResponse createUpdatePersonaResponse() {
        return new UpdatePersonaResponse();
    }

    /**
     * Create an instance of {@link DeletePersonaResponse }
     * 
     */
    public DeletePersonaResponse createDeletePersonaResponse() {
        return new DeletePersonaResponse();
    }

    /**
     * Create an instance of {@link FindAllPersonaResponse }
     * 
     */
    public FindAllPersonaResponse createFindAllPersonaResponse() {
        return new FindAllPersonaResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonaById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "findPersonaById")
    public JAXBElement<FindPersonaById> createFindPersonaById(FindPersonaById value) {
        return new JAXBElement<FindPersonaById>(_FindPersonaById_QNAME, FindPersonaById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "addPersona")
    public JAXBElement<AddPersona> createAddPersona(AddPersona value) {
        return new JAXBElement<AddPersona>(_AddPersona_QNAME, AddPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "findAllPersona")
    public JAXBElement<FindAllPersona> createFindAllPersona(FindAllPersona value) {
        return new JAXBElement<FindAllPersona>(_FindAllPersona_QNAME, FindAllPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "updatePersona")
    public JAXBElement<UpdatePersona> createUpdatePersona(UpdatePersona value) {
        return new JAXBElement<UpdatePersona>(_UpdatePersona_QNAME, UpdatePersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "addPersonaResponse")
    public JAXBElement<AddPersonaResponse> createAddPersonaResponse(AddPersonaResponse value) {
        return new JAXBElement<AddPersonaResponse>(_AddPersonaResponse_QNAME, AddPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonaByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "findPersonaByIdResponse")
    public JAXBElement<FindPersonaByIdResponse> createFindPersonaByIdResponse(FindPersonaByIdResponse value) {
        return new JAXBElement<FindPersonaByIdResponse>(_FindPersonaByIdResponse_QNAME, FindPersonaByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "deletePersona")
    public JAXBElement<DeletePersona> createDeletePersona(DeletePersona value) {
        return new JAXBElement<DeletePersona>(_DeletePersona_QNAME, DeletePersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "updatePersonaResponse")
    public JAXBElement<UpdatePersonaResponse> createUpdatePersonaResponse(UpdatePersonaResponse value) {
        return new JAXBElement<UpdatePersonaResponse>(_UpdatePersonaResponse_QNAME, UpdatePersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "deletePersonaResponse")
    public JAXBElement<DeletePersonaResponse> createDeletePersonaResponse(DeletePersonaResponse value) {
        return new JAXBElement<DeletePersonaResponse>(_DeletePersonaResponse_QNAME, DeletePersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unisigma/", name = "findAllPersonaResponse")
    public JAXBElement<FindAllPersonaResponse> createFindAllPersonaResponse(FindAllPersonaResponse value) {
        return new JAXBElement<FindAllPersonaResponse>(_FindAllPersonaResponse_QNAME, FindAllPersonaResponse.class, null, value);
    }

}
