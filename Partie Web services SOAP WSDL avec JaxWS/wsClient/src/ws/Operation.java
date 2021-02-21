
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateOp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mytype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", propOrder = {
    "dateOp",
    "description",
    "montant",
    "mytype"
})
public class Operation {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOp;
    protected String description;
    protected double montant;
    protected String mytype;

    /**
     * Gets the value of the dateOp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOp() {
        return dateOp;
    }

    /**
     * Sets the value of the dateOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOp(XMLGregorianCalendar value) {
        this.dateOp = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the montant property.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Sets the value of the montant property.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

    /**
     * Gets the value of the mytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMytype() {
        return mytype;
    }

    /**
     * Sets the value of the mytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMytype(String value) {
        this.mytype = value;
    }

}
