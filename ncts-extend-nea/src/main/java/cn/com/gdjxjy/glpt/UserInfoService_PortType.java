/**
 * UserInfoService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.gdjxjy.glpt;

public interface UserInfoService_PortType extends java.rmi.Remote {
    public cn.com.gdjxjy.glpt.UserInfo readUserInfo(java.lang.String clientId, java.lang.String clientPassword, java.lang.String userId) throws java.rmi.RemoteException;
    public java.lang.String editUserInfo(java.lang.String clientId, java.lang.String clientPassword, cn.com.gdjxjy.glpt.UserInfo userInfo) throws java.rmi.RemoteException;
    public cn.com.gdjxjy.glpt.UserInfo editUserAvatar(java.lang.String clientId, java.lang.String clientPassword, java.lang.String userId, java.lang.String uploadFileName, byte[] fileBytes) throws java.rmi.RemoteException;
}
