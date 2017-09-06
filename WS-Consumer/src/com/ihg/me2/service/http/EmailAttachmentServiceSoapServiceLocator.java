/**
 * EmailAttachmentServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ihg.me2.service.http;

public class EmailAttachmentServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.ihg.me2.service.http.EmailAttachmentServiceSoapService {

    public EmailAttachmentServiceSoapServiceLocator() {
    }


    public EmailAttachmentServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmailAttachmentServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Plugin_endeca_EmailAttachmentService
    private java.lang.String Plugin_endeca_EmailAttachmentService_address = "http://localhost:8080/endeca-mail-job-portlet/api/axis/Plugin_endeca_EmailAttachmentService";

    public java.lang.String getPlugin_endeca_EmailAttachmentServiceAddress() {
        return Plugin_endeca_EmailAttachmentService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Plugin_endeca_EmailAttachmentServiceWSDDServiceName = "Plugin_endeca_EmailAttachmentService";

    public java.lang.String getPlugin_endeca_EmailAttachmentServiceWSDDServiceName() {
        return Plugin_endeca_EmailAttachmentServiceWSDDServiceName;
    }

    public void setPlugin_endeca_EmailAttachmentServiceWSDDServiceName(java.lang.String name) {
        Plugin_endeca_EmailAttachmentServiceWSDDServiceName = name;
    }

    public com.ihg.me2.service.http.EmailAttachmentServiceSoap getPlugin_endeca_EmailAttachmentService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Plugin_endeca_EmailAttachmentService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPlugin_endeca_EmailAttachmentService(endpoint);
    }

    public com.ihg.me2.service.http.EmailAttachmentServiceSoap getPlugin_endeca_EmailAttachmentService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ihg.me2.service.http.Plugin_endeca_EmailAttachmentServiceSoapBindingStub _stub = new com.ihg.me2.service.http.Plugin_endeca_EmailAttachmentServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPlugin_endeca_EmailAttachmentServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPlugin_endeca_EmailAttachmentServiceEndpointAddress(java.lang.String address) {
        Plugin_endeca_EmailAttachmentService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ihg.me2.service.http.EmailAttachmentServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ihg.me2.service.http.Plugin_endeca_EmailAttachmentServiceSoapBindingStub _stub = new com.ihg.me2.service.http.Plugin_endeca_EmailAttachmentServiceSoapBindingStub(new java.net.URL(Plugin_endeca_EmailAttachmentService_address), this);
                _stub.setPortName(getPlugin_endeca_EmailAttachmentServiceWSDDServiceName());
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
        if ("Plugin_endeca_EmailAttachmentService".equals(inputPortName)) {
            return getPlugin_endeca_EmailAttachmentService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.me2.ihg.com", "EmailAttachmentServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.me2.ihg.com", "Plugin_endeca_EmailAttachmentService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Plugin_endeca_EmailAttachmentService".equals(portName)) {
            setPlugin_endeca_EmailAttachmentServiceEndpointAddress(address);
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
