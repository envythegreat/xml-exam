
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for releve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="releve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateReleve" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operations" type="{http://ws/}operation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RIB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "dateReleve",
    "operations",
    "rib",
    "sold"
})
public class Releve {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReleve;
    @XmlElement(nillable = true)
    protected List<Operation> operations;
    @XmlElement(name = "RIB")
    protected int rib;
    protected double sold;

    /**
     * Gets the value of the dateReleve property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReleve() {
        return dateReleve;
    }

    /**
     * Sets the value of the dateReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReleve(XMLGregorianCalendar value) {
        this.dateReleve = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operation }
     * 
     * 
     */
    public List<Operation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<Operation>();
        }
        return this.operations;
    }

    /**
     * Gets the value of the rib property.
     * 
     */
    public int getRIB() {
        return rib;
    }

    /**
     * Sets the value of the rib property.
     * 
     */
    public void setRIB(int value) {
        this.rib = value;
    }

    /**
     * Gets the value of the sold property.
     * 
     */
    public double getSold() {
        return sold;
    }

    /**
     * Sets the value of the sold property.
     * 
     */
    public void setSold(double value) {
        this.sold = value;
    }

}
