
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _OperationListResponse_QNAME = new QName("http://ws/", "operationListResponse");
    private final static QName _OperationList_QNAME = new QName("http://ws/", "operationList");
    private final static QName _BankStatement_QNAME = new QName("http://ws/", "BankStatement");
    private final static QName _BankStatementResponse_QNAME = new QName("http://ws/", "BankStatementResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperationListResponse }
     * 
     */
    public OperationListResponse createOperationListResponse() {
        return new OperationListResponse();
    }

    /**
     * Create an instance of {@link OperationList }
     * 
     */
    public OperationList createOperationList() {
        return new OperationList();
    }

    /**
     * Create an instance of {@link BankStatement }
     * 
     */
    public BankStatement createBankStatement() {
        return new BankStatement();
    }

    /**
     * Create an instance of {@link BankStatementResponse }
     * 
     */
    public BankStatementResponse createBankStatementResponse() {
        return new BankStatementResponse();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operationListResponse")
    public JAXBElement<OperationListResponse> createOperationListResponse(OperationListResponse value) {
        return new JAXBElement<OperationListResponse>(_OperationListResponse_QNAME, OperationListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operationList")
    public JAXBElement<OperationList> createOperationList(OperationList value) {
        return new JAXBElement<OperationList>(_OperationList_QNAME, OperationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "BankStatement")
    public JAXBElement<BankStatement> createBankStatement(BankStatement value) {
        return new JAXBElement<BankStatement>(_BankStatement_QNAME, BankStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankStatementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "BankStatementResponse")
    public JAXBElement<BankStatementResponse> createBankStatementResponse(BankStatementResponse value) {
        return new JAXBElement<BankStatementResponse>(_BankStatementResponse_QNAME, BankStatementResponse.class, null, value);
    }

}
