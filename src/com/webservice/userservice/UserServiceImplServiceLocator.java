/**
 * UserServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.userservice;

public class UserServiceImplServiceLocator extends org.apache.axis.client.Service implements com.webservice.userservice.UserServiceImplService {

    public UserServiceImplServiceLocator() {
    }


    public UserServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserServiceImpl
    private java.lang.String UserServiceImpl_address = "http://10.20.71.30:8081//services/service/Impl/UserServiceImpl";

    public java.lang.String getUserServiceImplAddress() {
        return UserServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserServiceImplWSDDServiceName = "UserServiceImpl";

    public java.lang.String getUserServiceImplWSDDServiceName() {
        return UserServiceImplWSDDServiceName;
    }

    public void setUserServiceImplWSDDServiceName(java.lang.String name) {
        UserServiceImplWSDDServiceName = name;
    }

    public com.webservice.userservice.UserServiceImpl_PortType getUserServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserServiceImpl(endpoint);
    }

    public com.webservice.userservice.UserServiceImpl_PortType getUserServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webservice.userservice.UserServiceImplSoapBindingStub _stub = new com.webservice.userservice.UserServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserServiceImplEndpointAddress(java.lang.String address) {
        UserServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webservice.userservice.UserServiceImpl_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webservice.userservice.UserServiceImplSoapBindingStub _stub = new com.webservice.userservice.UserServiceImplSoapBindingStub(new java.net.URL(UserServiceImpl_address), this);
                _stub.setPortName(getUserServiceImplWSDDServiceName());
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
        if ("UserServiceImpl".equals(inputPortName)) {
            return getUserServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Impl.service", "UserServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Impl.service", "UserServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserServiceImpl".equals(portName)) {
            setUserServiceImplEndpointAddress(address);
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
