/**
 * DemandePrestation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.demandeprestation;

public interface DemandePrestation extends javax.xml.rpc.Service {
    public java.lang.String getDemandePrestationPortAddress();

    public localhost.demandeprestation.DemandePrestationPortType getDemandePrestationPort() throws javax.xml.rpc.ServiceException;

    public localhost.demandeprestation.DemandePrestationPortType getDemandePrestationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}