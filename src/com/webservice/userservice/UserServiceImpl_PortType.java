/**
 * UserServiceImpl_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.userservice;

public interface UserServiceImpl_PortType extends java.rmi.Remote {
    public int add(com.webservice.userservice.User user) throws java.rmi.RemoteException;
    public com.webservice.userservice.User queryUser(java.lang.String name) throws java.rmi.RemoteException;
    public com.webservice.userservice.User login(java.lang.String name, java.lang.String password) throws java.rmi.RemoteException;
}
