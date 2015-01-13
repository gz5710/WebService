/**
 * DemandePrestationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.demandeprestation;

public class DemandePrestationResponse  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String compteRendu;

    private java.lang.String facture;

    public DemandePrestationResponse() {
    }

    public DemandePrestationResponse(
           java.lang.String result,
           java.lang.String compteRendu,
           java.lang.String facture) {
           this.result = result;
           this.compteRendu = compteRendu;
           this.facture = facture;
    }


    /**
     * Gets the result value for this DemandePrestationResponse.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this DemandePrestationResponse.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the compteRendu value for this DemandePrestationResponse.
     * 
     * @return compteRendu
     */
    public java.lang.String getCompteRendu() {
        return compteRendu;
    }


    /**
     * Sets the compteRendu value for this DemandePrestationResponse.
     * 
     * @param compteRendu
     */
    public void setCompteRendu(java.lang.String compteRendu) {
        this.compteRendu = compteRendu;
    }


    /**
     * Gets the facture value for this DemandePrestationResponse.
     * 
     * @return facture
     */
    public java.lang.String getFacture() {
        return facture;
    }


    /**
     * Sets the facture value for this DemandePrestationResponse.
     * 
     * @param facture
     */
    public void setFacture(java.lang.String facture) {
        this.facture = facture;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DemandePrestationResponse)) return false;
        DemandePrestationResponse other = (DemandePrestationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.compteRendu==null && other.getCompteRendu()==null) || 
             (this.compteRendu!=null &&
              this.compteRendu.equals(other.getCompteRendu()))) &&
            ((this.facture==null && other.getFacture()==null) || 
             (this.facture!=null &&
              this.facture.equals(other.getFacture())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getCompteRendu() != null) {
            _hashCode += getCompteRendu().hashCode();
        }
        if (getFacture() != null) {
            _hashCode += getFacture().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DemandePrestationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://demandeprestation.localhost", ">DemandePrestationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://demandeprestation.localhost", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compteRendu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://demandeprestation.localhost", "compteRendu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://demandeprestation.localhost", "facture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
