/**
 * LegoInfoService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.legoteacher.m;

public class LegoInfoService_ServiceLocator extends org.apache.axis.client.Service implements net.legoteacher.m.LegoInfoService_Service {

    public LegoInfoService_ServiceLocator() {
    }


    public LegoInfoService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LegoInfoService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for legoInfoServicePort
    private java.lang.String legoInfoServicePort_address = "http://m.legoteacher.net/services/legoInfoService";

    public java.lang.String getlegoInfoServicePortAddress() {
        return legoInfoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String legoInfoServicePortWSDDServiceName = "legoInfoServicePort";

    public java.lang.String getlegoInfoServicePortWSDDServiceName() {
        return legoInfoServicePortWSDDServiceName;
    }

    public void setlegoInfoServicePortWSDDServiceName(java.lang.String name) {
        legoInfoServicePortWSDDServiceName = name;
    }

    public net.legoteacher.m.LegoInfoService_PortType getlegoInfoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(legoInfoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getlegoInfoServicePort(endpoint);
    }

    public net.legoteacher.m.LegoInfoService_PortType getlegoInfoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.legoteacher.m.LegoInfoServiceSoapBindingStub _stub = new net.legoteacher.m.LegoInfoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getlegoInfoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setlegoInfoServicePortEndpointAddress(java.lang.String address) {
        legoInfoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.legoteacher.m.LegoInfoService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                net.legoteacher.m.LegoInfoServiceSoapBindingStub _stub = new net.legoteacher.m.LegoInfoServiceSoapBindingStub(new java.net.URL(legoInfoServicePort_address), this);
                _stub.setPortName(getlegoInfoServicePortWSDDServiceName());
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
        if ("legoInfoServicePort".equals(inputPortName)) {
            return getlegoInfoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://m.legoteacher.net", "legoInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://m.legoteacher.net", "legoInfoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("legoInfoServicePort".equals(portName)) {
            setlegoInfoServicePortEndpointAddress(address);
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
