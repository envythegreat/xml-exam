/**
 * Releve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Releve  implements java.io.Serializable {
    private java.util.Calendar dateReleve;

    private ws.Operation[] operations;

    private int RIB;

    private double sold;

    public Releve() {
    }

    public Releve(
           java.util.Calendar dateReleve,
           ws.Operation[] operations,
           int RIB,
           double sold) {
           this.dateReleve = dateReleve;
           this.operations = operations;
           this.RIB = RIB;
           this.sold = sold;
    }


    /**
     * Gets the dateReleve value for this Releve.
     * 
     * @return dateReleve
     */
    public java.util.Calendar getDateReleve() {
        return dateReleve;
    }


    /**
     * Sets the dateReleve value for this Releve.
     * 
     * @param dateReleve
     */
    public void setDateReleve(java.util.Calendar dateReleve) {
        this.dateReleve = dateReleve;
    }


    /**
     * Gets the operations value for this Releve.
     * 
     * @return operations
     */
    public ws.Operation[] getOperations() {
        return operations;
    }


    /**
     * Sets the operations value for this Releve.
     * 
     * @param operations
     */
    public void setOperations(ws.Operation[] operations) {
        this.operations = operations;
    }

    public ws.Operation getOperations(int i) {
        return this.operations[i];
    }

    public void setOperations(int i, ws.Operation _value) {
        this.operations[i] = _value;
    }


    /**
     * Gets the RIB value for this Releve.
     * 
     * @return RIB
     */
    public int getRIB() {
        return RIB;
    }


    /**
     * Sets the RIB value for this Releve.
     * 
     * @param RIB
     */
    public void setRIB(int RIB) {
        this.RIB = RIB;
    }


    /**
     * Gets the sold value for this Releve.
     * 
     * @return sold
     */
    public double getSold() {
        return sold;
    }


    /**
     * Sets the sold value for this Releve.
     * 
     * @param sold
     */
    public void setSold(double sold) {
        this.sold = sold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Releve)) return false;
        Releve other = (Releve) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateReleve==null && other.getDateReleve()==null) || 
             (this.dateReleve!=null &&
              this.dateReleve.equals(other.getDateReleve()))) &&
            ((this.operations==null && other.getOperations()==null) || 
             (this.operations!=null &&
              java.util.Arrays.equals(this.operations, other.getOperations()))) &&
            this.RIB == other.getRIB() &&
            this.sold == other.getSold();
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
        if (getDateReleve() != null) {
            _hashCode += getDateReleve().hashCode();
        }
        if (getOperations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRIB();
        _hashCode += new Double(getSold()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Releve.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws/", "releve"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateReleve");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateReleve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws/", "operation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RIB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RIB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
