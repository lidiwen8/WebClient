/**
 * ImgServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.imgservice;

public class ImgServiceImplServiceLocator extends org.apache.axis.client.Service implements com.webservice.imgservice.ImgServiceImplService {

    public ImgServiceImplServiceLocator() {
    }


    public ImgServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImgServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImgServiceImpl
    private java.lang.String ImgServiceImpl_address = "http://10.20.71.30:8081//services/service/Impl/ImgServiceImpl";

    public java.lang.String getImgServiceImplAddress() {
        return ImgServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImgServiceImplWSDDServiceName = "ImgServiceImpl";

    public java.lang.String getImgServiceImplWSDDServiceName() {
        return ImgServiceImplWSDDServiceName;
    }

    public void setImgServiceImplWSDDServiceName(java.lang.String name) {
        ImgServiceImplWSDDServiceName = name;
    }

    public com.webservice.imgservice.ImgServiceImpl_PortType getImgServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImgServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImgServiceImpl(endpoint);
    }

    public com.webservice.imgservice.ImgServiceImpl_PortType getImgServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webservice.imgservice.ImgServiceImplSoapBindingStub _stub = new com.webservice.imgservice.ImgServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getImgServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImgServiceImplEndpointAddress(java.lang.String address) {
        ImgServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webservice.imgservice.ImgServiceImpl_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webservice.imgservice.ImgServiceImplSoapBindingStub _stub = new com.webservice.imgservice.ImgServiceImplSoapBindingStub(new java.net.URL(ImgServiceImpl_address), this);
                _stub.setPortName(getImgServiceImplWSDDServiceName());
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
        if ("ImgServiceImpl".equals(inputPortName)) {
            return getImgServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Impl.service", "ImgServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Impl.service", "ImgServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImgServiceImpl".equals(portName)) {
            setImgServiceImplEndpointAddress(address);
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
