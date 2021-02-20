/**
 * Operation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Operation  implements java.io.Serializable {
    private java.util.Calendar dateOp;

    private java.lang.String description;

    private double montant;

    private java.lang.String mytype;

    public Operation() {
    }

    public Operation(
           java.util.Calendar dateOp,
           java.lang.String description,
           double montant,
           java.lang.String mytype) {
           this.dateOp = dateOp;
           this.description = description;
           this.montant = montant;
           this.mytype = mytype;
    }


    /**
     * Gets the dateOp value for this Operation.
     * 
     * @return dateOp
     */
    public java.util.Calendar getDateOp() {
        return dateOp;
    }


    /**
     * Sets the dateOp value for this Operation.
     * 
     * @param dateOp
     */
    public void setDateOp(java.util.Calendar dateOp) {
        this.dateOp = dateOp;
    }


    /**
     * Gets the description value for this Operation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Operation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the montant value for this Operation.
     * 
     * @return montant
     */
    public double getMontant() {
        return montant;
    }


    /**
     * Sets the montant value for this Operation.
     * 
     * @param montant
     */
    public void setMontant(double montant) {
        this.montant = montant;
    }


    /**
     * Gets the mytype value for this Operation.
     * 
     * @return mytype
     */
    public java.lang.String getMytype() {
        return mytype;
    }


    /**
     * Sets the mytype value for this Operation.
     * 
     * @param mytype
     */
    public void setMytype(java.lang.String mytype) {
        this.mytype = mytype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Operation)) return false;
        Operation other = (Operation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateOp==null && other.getDateOp()==null) || 
             (this.dateOp!=null &&
              this.dateOp.equals(other.getDateOp()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.montant == other.getMontant() &&
            ((this.mytype==null && other.getMytype()==null) || 
             (this.mytype!=null &&
              this.mytype.equals(other.getMytype())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDateOp() != null) {
            _hashCode += getDateOp().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Double(getMontant()).hashCode();
        if (getMytype() != null) {
            _hashCode += getMytype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws/", "operation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "montant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
