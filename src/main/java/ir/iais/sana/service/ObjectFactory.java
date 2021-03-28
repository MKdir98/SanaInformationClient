
package ir.iais.sana.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ir.iais.sana.service package. 
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

    private final static QName _DataTypeNotSupportedException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v4/", "DataTypeNotSupportedException");
    private final static QName _DomainException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v4/", "DomainException");
    private final static QName _InternalServerException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v4/", "InternalServerException");
    private final static QName _MisMatchIndexException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v4/", "MisMatchIndexException");
    private final static QName _Send_QNAME = new QName("http://servicebus.sana.ir/PushSana/v4/", "send");
    private final static QName _SendResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v4/", "sendResponse");
    private final static QName _Verify_QNAME = new QName("http://servicebus.sana.ir/PushSana/v4/", "verify");
    private final static QName _VerifyResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v4/", "verifyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ir.iais.sana.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataTypeNotSupportedException }
     * 
     */
    public DataTypeNotSupportedException createDataTypeNotSupportedException() {
        return new DataTypeNotSupportedException();
    }

    /**
     * Create an instance of {@link DomainException }
     * 
     */
    public DomainException createDomainException() {
        return new DomainException();
    }

    /**
     * Create an instance of {@link InternalServerException }
     * 
     */
    public InternalServerException createInternalServerException() {
        return new InternalServerException();
    }

    /**
     * Create an instance of {@link MisMatchIndexException }
     * 
     */
    public MisMatchIndexException createMisMatchIndexException() {
        return new MisMatchIndexException();
    }

    /**
     * Create an instance of {@link Send }
     * 
     */
    public Send createSend() {
        return new Send();
    }

    /**
     * Create an instance of {@link SendResponse }
     * 
     */
    public SendResponse createSendResponse() {
        return new SendResponse();
    }

    /**
     * Create an instance of {@link Verify }
     * 
     */
    public Verify createVerify() {
        return new Verify();
    }

    /**
     * Create an instance of {@link VerifyResponse }
     * 
     */
    public VerifyResponse createVerifyResponse() {
        return new VerifyResponse();
    }

    /**
     * Create an instance of {@link DataPart }
     * 
     */
    public DataPart createDataPart() {
        return new DataPart();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTypeNotSupportedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataTypeNotSupportedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v4/", name = "DataTypeNotSupportedException")
    public JAXBElement<DataTypeNotSupportedException> createDataTypeNotSupportedException(DataTypeNotSupportedException value) {
        return new JAXBElement<DataTypeNotSupportedException>(_DataTypeNotSupportedException_QNAME, DataTypeNotSupportedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DomainException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v4/", name = "DomainException")
    public JAXBElement<DomainException> createDomainException(DomainException value) {
        return new JAXBElement<DomainException>(_DomainException_QNAME, DomainException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServerException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InternalServerException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v4/", name = "InternalServerException")
    public JAXBElement<InternalServerException> createInternalServerException(InternalServerException value) {
        return new JAXBElement<InternalServerException>(_InternalServerException_QNAME, InternalServerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MisMatchIndexException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MisMatchIndexException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v4/", name = "MisMatchIndexException")
    public JAXBElement<MisMatchIndexException> createMisMatchIndexException(MisMatchIndexException value) {
        return new JAXBElement<MisMatchIndexException>(_MisMatchIndexException_QNAME, MisMatchIndexException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Send }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Send }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v4/", name = "send")
    public JAXBElement<Send> createSend(Send value) {
        return new JAXBElement<Send>(_Send_QNAME, Send.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v4/", name = "sendResponse")
    public JAXBElement<SendResponse> createSendResponse(SendResponse value) {
        return new JAXBElement<SendResponse>(_SendResponse_QNAME, SendResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verify }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Verify }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v4/", name = "verify")
    public JAXBElement<Verify> createVerify(Verify value) {
        return new JAXBElement<Verify>(_Verify_QNAME, Verify.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v4/", name = "verifyResponse")
    public JAXBElement<VerifyResponse> createVerifyResponse(VerifyResponse value) {
        return new JAXBElement<VerifyResponse>(_VerifyResponse_QNAME, VerifyResponse.class, null, value);
    }

}
