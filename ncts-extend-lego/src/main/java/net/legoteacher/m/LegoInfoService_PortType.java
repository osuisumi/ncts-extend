/**
 * LegoInfoService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.legoteacher.m;

public interface LegoInfoService_PortType extends java.rmi.Remote {
    public net.legoteacher.m.TermInfo[] readTermInfo(java.lang.String clientId, java.lang.String clientPassword, java.lang.String[] termIds) throws java.rmi.RemoteException;
    public java.lang.String listTermInfo(java.lang.String clientId, java.lang.String clientPassword, int pageNo, int pageSize) throws java.rmi.RemoteException;
}
