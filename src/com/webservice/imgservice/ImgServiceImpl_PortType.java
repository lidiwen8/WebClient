/**
 * ImgServiceImpl_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.imgservice;

public interface ImgServiceImpl_PortType extends java.rmi.Remote {
    public com.webservice.imgservice.PageBean findAll(int pc, int pr) throws java.rmi.RemoteException;
    public com.webservice.imgservice.PageBean findUserImg(int pc, int pr, java.lang.String username) throws java.rmi.RemoteException;
    public com.webservice.imgservice.ImageBean findByid(int id) throws java.rmi.RemoteException;
    public void deleteByid(int id) throws java.rmi.RemoteException;
}
