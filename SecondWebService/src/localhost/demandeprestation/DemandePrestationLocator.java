/**
 * DemandePrestationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.demandeprestation;

public class DemandePrestationLocator extends org.apache.axis.client.Service implements localhost.demandeprestation.DemandePrestation {

    public DemandePrestationLocator() {
    }


    public DemandePrestationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemandePrestationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DemandePrestationPort
    private java.lang.String DemandePrestationPort_address = "http://localhost:8080/ode/processes/DemandePrestation.DemandePrestationPort/";

    public java.lang.String getDemandePrestationPortAddress() {
        return DemandePrestationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DemandePrestationPortWSDDServiceName = "DemandePrestationPort";

    public java.lang.String getDemandePrestationPortWSDDServiceName() {
        return DemandePrestationPortWSDDServiceName;
    }

    public void setDemandePrestationPortWSDDServiceName(java.lang.String name) {
        DemandePrestationPortWSDDServiceName = name;
    }

    public localhost.demandeprestation.DemandePrestationPortType getDemandePrestationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DemandePrestationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemandePrestationPort(endpoint);
    }

    public localhost.demandeprestation.DemandePrestationPortType getDemandePrestationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.demandeprestation.DemandePrestationBindingStub _stub = new localhost.demandeprestation.DemandePrestationBindingStub(portAddress, this);
            _stub.setPortName(getDemandePrestationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemandePrestationPortEndpointAddress(java.lang.String address) {
        DemandePrestationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.demandeprestation.DemandePrestationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.demandeprestation.DemandePrestationBindingStub _stub = new localhost.demandeprestation.DemandePrestationBindingStub(new java.net.URL(DemandePrestationPort_address), this);
                _stub.setPortName(getDemandePrestationPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DemandePrestationPort".equals(inputPortName)) {
            return getDemandePrestationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://demandeprestation.localhost", "DemandePrestation");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://demandeprestation.localhost", "DemandePrestationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DemandePrestationPort".equals(portName)) {
            setDemandePrestationPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
