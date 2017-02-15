package cn.gdjsw.m;

public class PinfoTermProxy implements cn.gdjsw.m.PinfoTerm_PortType {
  private String _endpoint = null;
  private cn.gdjsw.m.PinfoTerm_PortType pinfoTerm_PortType = null;
  
  public PinfoTermProxy() {
    _initPinfoTermProxy();
  }
  
  public PinfoTermProxy(String endpoint) {
    _endpoint = endpoint;
    _initPinfoTermProxy();
  }
  
  private void _initPinfoTermProxy() {
    try {
      pinfoTerm_PortType = (new cn.gdjsw.m.PinfoTerm_ServiceLocator()).getpnfoTermServicePort();
      if (pinfoTerm_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pinfoTerm_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pinfoTerm_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pinfoTerm_PortType != null)
      ((javax.xml.rpc.Stub)pinfoTerm_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.gdjsw.m.PinfoTerm_PortType getPinfoTerm_PortType() {
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType;
  }
  
  public java.lang.String uploadPinfoTermUserScore(java.lang.String systemId, java.lang.String systemPassword, cn.gdjsw.m.TermUserScore[] termUserScoreList) throws java.rmi.RemoteException{
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType.uploadPinfoTermUserScore(systemId, systemPassword, termUserScoreList);
  }
  
  public java.lang.String listPinfoTermUserSchool(java.lang.String systemId, java.lang.String systemPassword, java.lang.String termId, java.lang.String userId, int pageNo, int pageSize) throws java.rmi.RemoteException{
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType.listPinfoTermUserSchool(systemId, systemPassword, termId, userId, pageNo, pageSize);
  }
  
  public java.lang.String listPinfoTermUser(java.lang.String systemId, java.lang.String systemPassword, java.lang.String termId, java.lang.String userId, int pageNo, int pageSize) throws java.rmi.RemoteException{
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType.listPinfoTermUser(systemId, systemPassword, termId, userId, pageNo, pageSize);
  }
  
  public java.lang.String uploadPinfoTermUserSchoolScore(java.lang.String systemId, java.lang.String systemPassword, cn.gdjsw.m.TermUserScore[] termUserScoreList) throws java.rmi.RemoteException{
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType.uploadPinfoTermUserSchoolScore(systemId, systemPassword, termUserScoreList);
  }
  
  public java.lang.String listPinfoTerm(java.lang.String systemId, java.lang.String systemPassword, int pageNo, int pageSize) throws java.rmi.RemoteException{
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType.listPinfoTerm(systemId, systemPassword, pageNo, pageSize);
  }
  
  public java.lang.String listPinfoCourse(java.lang.String systemId, java.lang.String systemPassword, int pageNo, int pageSize) throws java.rmi.RemoteException{
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType.listPinfoCourse(systemId, systemPassword, pageNo, pageSize);
  }
  
  public java.lang.String checkUserLogin(java.lang.String systemId, java.lang.String systemPassword, java.lang.String userId, java.lang.String sessionId) throws java.rmi.RemoteException{
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType.checkUserLogin(systemId, systemPassword, userId, sessionId);
  }
  
  public java.lang.String readPinfoTerm(java.lang.String systemId, java.lang.String systemPassword, java.lang.String[] termId) throws java.rmi.RemoteException{
    if (pinfoTerm_PortType == null)
      _initPinfoTermProxy();
    return pinfoTerm_PortType.readPinfoTerm(systemId, systemPassword, termId);
  }
  
  
}