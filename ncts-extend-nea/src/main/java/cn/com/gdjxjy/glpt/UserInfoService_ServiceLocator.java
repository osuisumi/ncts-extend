/**
 * UserInfoService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.gdjxjy.glpt;

public class UserInfoService_ServiceLocator extends org.apache.axis.client.Service implements cn.com.gdjxjy.glpt.UserInfoService_Service {

    public UserInfoService_ServiceLocator() {
    }


    public UserInfoService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserInfoService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserInfoServicePort
    private java.lang.String UserInfoServicePort_address = "http://glpt.gdjsgl.com.cn/services/userInfo";

    public java.lang.String getUserInfoServicePortAddress() {
        return UserInfoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserInfoServicePortWSDDServiceName = "UserInfoServicePort";

    public java.lang.String getUserInfoServicePortWSDDServiceName() {
        return UserInfoServicePortWSDDServiceName;
    }

    public void setUserInfoServicePortWSDDServiceName(java.lang.String name) {
        UserInfoServicePortWSDDServiceName = name;
    }

    public cn.com.gdjxjy.glpt.UserInfoService_PortType getUserInfoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserInfoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserInfoServicePort(endpoint);
    }

    public cn.com.gdjxjy.glpt.UserInfoService_PortType getUserInfoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.gdjxjy.glpt.UserInfoServiceSoapBindingStub _stub = new cn.com.gdjxjy.glpt.UserInfoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserInfoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserInfoServicePortEndpointAddress(java.lang.String address) {
        UserInfoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.gdjxjy.glpt.UserInfoService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.gdjxjy.glpt.UserInfoServiceSoapBindingStub _stub = new cn.com.gdjxjy.glpt.UserInfoServiceSoapBindingStub(new java.net.URL(UserInfoServicePort_address), this);
                _stub.setPortName(getUserInfoServicePortWSDDServiceName());
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
        if ("UserInfoServicePort".equals(inputPortName)) {
            return getUserInfoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "UserInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://glpt.gdjxjy.com.cn", "UserInfoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserInfoServicePort".equals(portName)) {
            setUserInfoServicePortEndpointAddress(address);
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
