package localhost.demandeprestation;

public class DemandePrestationPortTypeProxy implements localhost.demandeprestation.DemandePrestationPortType {
  private String _endpoint = null;
  private localhost.demandeprestation.DemandePrestationPortType demandePrestationPortType = null;
  
  public DemandePrestationPortTypeProxy() {
    _initDemandePrestationPortTypeProxy();
  }
  
  public DemandePrestationPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDemandePrestationPortTypeProxy();
  }
  
  private void _initDemandePrestationPortTypeProxy() {
    try {
      demandePrestationPortType = (new localhost.demandeprestation.DemandePrestationLocator()).getDemandePrestationPort();
      if (demandePrestationPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demandePrestationPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demandePrestationPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demandePrestationPortType != null)
      ((javax.xml.rpc.Stub)demandePrestationPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.demandeprestation.DemandePrestationPortType getDemandePrestationPortType() {
    if (demandePrestationPortType == null)
      _initDemandePrestationPortTypeProxy();
    return demandePrestationPortType;
  }
  
  public localhost.demandeprestation.DemandePrestationResponse process(localhost.demandeprestation.DemandePrestationRequest payload) throws java.rmi.RemoteException{
    if (demandePrestationPortType == null)
      _initDemandePrestationPortTypeProxy();
    return demandePrestationPortType.process(payload);
  }
  
  
}