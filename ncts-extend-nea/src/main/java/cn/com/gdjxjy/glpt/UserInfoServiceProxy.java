package cn.com.gdjxjy.glpt;

public class UserInfoServiceProxy implements cn.com.gdjxjy.glpt.UserInfoService_PortType {
  private String _endpoint = null;
  private cn.com.gdjxjy.glpt.UserInfoService_PortType userInfoService_PortType = null;
  
  public UserInfoServiceProxy() {
    _initUserInfoServiceProxy();
  }
  
  public UserInfoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserInfoServiceProxy();
  }
  
  private void _initUserInfoServiceProxy() {
    try {
      userInfoService_PortType = (new cn.com.gdjxjy.glpt.UserInfoService_ServiceLocator()).getUserInfoServicePort();
      if (userInfoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userInfoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userInfoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userInfoService_PortType != null)
      ((javax.xml.rpc.Stub)userInfoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.gdjxjy.glpt.UserInfoService_PortType getUserInfoService_PortType() {
    if (userInfoService_PortType == null)
      _initUserInfoServiceProxy();
    return userInfoService_PortType;
  }
  
  public cn.com.gdjxjy.glpt.UserInfo readUserInfo(java.lang.String clientId, java.lang.String clientPassword, java.lang.String userId) throws java.rmi.RemoteException{
    if (userInfoService_PortType == null)
      _initUserInfoServiceProxy();
    return userInfoService_PortType.readUserInfo(clientId, clientPassword, userId);
  }
  
  public java.lang.String editUserInfo(java.lang.String clientId, java.lang.String clientPassword, cn.com.gdjxjy.glpt.UserInfo userInfo) throws java.rmi.RemoteException{
    if (userInfoService_PortType == null)
      _initUserInfoServiceProxy();
    return userInfoService_PortType.editUserInfo(clientId, clientPassword, userInfo);
  }
  
  public cn.com.gdjxjy.glpt.UserInfo editUserAvatar(java.lang.String clientId, java.lang.String clientPassword, java.lang.String userId, java.lang.String uploadFileName, byte[] fileBytes) throws java.rmi.RemoteException{
    if (userInfoService_PortType == null)
      _initUserInfoServiceProxy();
    return userInfoService_PortType.editUserAvatar(clientId, clientPassword, userId, uploadFileName, fileBytes);
  }
  
  
}