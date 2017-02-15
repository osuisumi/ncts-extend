/**
 * PinfoTerm_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.gdjsw.m;

public interface PinfoTerm_PortType extends java.rmi.Remote {
    public java.lang.String uploadPinfoTermUserScore(java.lang.String systemId, java.lang.String systemPassword, cn.gdjsw.m.TermUserScore[] termUserScoreList) throws java.rmi.RemoteException;
    public java.lang.String listPinfoTermUserSchool(java.lang.String systemId, java.lang.String systemPassword, java.lang.String termId, java.lang.String userId, int pageNo, int pageSize) throws java.rmi.RemoteException;
    public java.lang.String listPinfoTermUser(java.lang.String systemId, java.lang.String systemPassword, java.lang.String termId, java.lang.String userId, int pageNo, int pageSize) throws java.rmi.RemoteException;
    public java.lang.String uploadPinfoTermUserSchoolScore(java.lang.String systemId, java.lang.String systemPassword, cn.gdjsw.m.TermUserScore[] termUserScoreList) throws java.rmi.RemoteException;
    public java.lang.String listPinfoTerm(java.lang.String systemId, java.lang.String systemPassword, int pageNo, int pageSize) throws java.rmi.RemoteException;
    public java.lang.String listPinfoCourse(java.lang.String systemId, java.lang.String systemPassword, int pageNo, int pageSize) throws java.rmi.RemoteException;
    public java.lang.String checkUserLogin(java.lang.String systemId, java.lang.String systemPassword, java.lang.String userId, java.lang.String sessionId) throws java.rmi.RemoteException;
    public java.lang.String readPinfoTerm(java.lang.String systemId, java.lang.String systemPassword, java.lang.String[] termId) throws java.rmi.RemoteException;
}
