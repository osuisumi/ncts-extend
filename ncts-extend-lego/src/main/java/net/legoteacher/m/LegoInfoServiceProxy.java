package net.legoteacher.m;

public class LegoInfoServiceProxy implements net.legoteacher.m.LegoInfoService_PortType {
  private String _endpoint = null;
  private net.legoteacher.m.LegoInfoService_PortType legoInfoService_PortType = null;
  
  public LegoInfoServiceProxy() {
    _initLegoInfoServiceProxy();
  }
  
  public LegoInfoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initLegoInfoServiceProxy();
  }
  
  private void _initLegoInfoServiceProxy() {
    try {
      legoInfoService_PortType = (new net.legoteacher.m.LegoInfoService_ServiceLocator()).getlegoInfoServicePort();
      if (legoInfoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)legoInfoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)legoInfoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (legoInfoService_PortType != null)
      ((javax.xml.rpc.Stub)legoInfoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.legoteacher.m.LegoInfoService_PortType getLegoInfoService_PortType() {
    if (legoInfoService_PortType == null)
      _initLegoInfoServiceProxy();
    return legoInfoService_PortType;
  }
  
  public net.legoteacher.m.TermInfo[] readTermInfo(java.lang.String clientId, java.lang.String clientPassword, java.lang.String[] termIds) throws java.rmi.RemoteException{
    if (legoInfoService_PortType == null)
      _initLegoInfoServiceProxy();
    return legoInfoService_PortType.readTermInfo(clientId, clientPassword, termIds);
  }
  
  public java.lang.String listTermInfo(java.lang.String clientId, java.lang.String clientPassword, int pageNo, int pageSize) throws java.rmi.RemoteException{
    if (legoInfoService_PortType == null)
      _initLegoInfoServiceProxy();
    return legoInfoService_PortType.listTermInfo(clientId, clientPassword, pageNo, pageSize);
  }
  
  
}