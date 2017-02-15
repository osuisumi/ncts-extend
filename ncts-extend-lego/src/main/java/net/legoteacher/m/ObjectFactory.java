
package net.legoteacher.m;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.legoteacher.m package. 
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

    private final static QName _EditUserInfo_QNAME = new QName("http://m.legoteacher.net", "editUserInfo");
    private final static QName _ReadUserInfo_QNAME = new QName("http://m.legoteacher.net", "readUserInfo");
    private final static QName _ReadUserInfoResponse_QNAME = new QName("http://m.legoteacher.net", "readUserInfoResponse");
    private final static QName _EditUserInfoResponse_QNAME = new QName("http://m.legoteacher.net", "editUserInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.legoteacher.m
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadUserInfo }
     * 
     */
    public ReadUserInfo createReadUserInfo() {
        return new ReadUserInfo();
    }

    /**
     * Create an instance of {@link ReadUserInfoResponse }
     * 
     */
    public ReadUserInfoResponse createReadUserInfoResponse() {
        return new ReadUserInfoResponse();
    }

    /**
     * Create an instance of {@link EditUserInfo }
     * 
     */
    public EditUserInfo createEditUserInfo() {
        return new EditUserInfo();
    }

    /**
     * Create an instance of {@link EditUserInfoResponse }
     * 
     */
    public EditUserInfoResponse createEditUserInfoResponse() {
        return new EditUserInfoResponse();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://m.legoteacher.net", name = "editUserInfo")
    public JAXBElement<EditUserInfo> createEditUserInfo(EditUserInfo value) {
        return new JAXBElement<EditUserInfo>(_EditUserInfo_QNAME, EditUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://m.legoteacher.net", name = "readUserInfo")
    public JAXBElement<ReadUserInfo> createReadUserInfo(ReadUserInfo value) {
        return new JAXBElement<ReadUserInfo>(_ReadUserInfo_QNAME, ReadUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://m.legoteacher.net", name = "readUserInfoResponse")
    public JAXBElement<ReadUserInfoResponse> createReadUserInfoResponse(ReadUserInfoResponse value) {
        return new JAXBElement<ReadUserInfoResponse>(_ReadUserInfoResponse_QNAME, ReadUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://m.legoteacher.net", name = "editUserInfoResponse")
    public JAXBElement<EditUserInfoResponse> createEditUserInfoResponse(EditUserInfoResponse value) {
        return new JAXBElement<EditUserInfoResponse>(_EditUserInfoResponse_QNAME, EditUserInfoResponse.class, null, value);
    }

}
