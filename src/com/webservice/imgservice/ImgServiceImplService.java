/**
 * ImgServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.imgservice;

public interface ImgServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getImgServiceImplAddress();

    public com.webservice.imgservice.ImgServiceImpl_PortType getImgServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.webservice.imgservice.ImgServiceImpl_PortType getImgServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
