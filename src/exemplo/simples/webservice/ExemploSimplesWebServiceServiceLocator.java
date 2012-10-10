/**
 * ExemploSimplesWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exemplo.simples.webservice;

public class ExemploSimplesWebServiceServiceLocator extends org.apache.axis.client.Service implements exemplo.simples.webservice.ExemploSimplesWebServiceService {

    public ExemploSimplesWebServiceServiceLocator() {
    }


    public ExemploSimplesWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExemploSimplesWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExemploSimplesWebService
    private java.lang.String ExemploSimplesWebService_address = "http://localhost:8080/webservice/services/ExemploSimplesWebService";

    public java.lang.String getExemploSimplesWebServiceAddress() {
        return ExemploSimplesWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExemploSimplesWebServiceWSDDServiceName = "ExemploSimplesWebService";

    public java.lang.String getExemploSimplesWebServiceWSDDServiceName() {
        return ExemploSimplesWebServiceWSDDServiceName;
    }

    public void setExemploSimplesWebServiceWSDDServiceName(java.lang.String name) {
        ExemploSimplesWebServiceWSDDServiceName = name;
    }

    public exemplo.simples.webservice.ExemploSimplesWebService getExemploSimplesWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExemploSimplesWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExemploSimplesWebService(endpoint);
    }

    public exemplo.simples.webservice.ExemploSimplesWebService getExemploSimplesWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            exemplo.simples.webservice.ExemploSimplesWebServiceSoapBindingStub _stub = new exemplo.simples.webservice.ExemploSimplesWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getExemploSimplesWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExemploSimplesWebServiceEndpointAddress(java.lang.String address) {
        ExemploSimplesWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (exemplo.simples.webservice.ExemploSimplesWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                exemplo.simples.webservice.ExemploSimplesWebServiceSoapBindingStub _stub = new exemplo.simples.webservice.ExemploSimplesWebServiceSoapBindingStub(new java.net.URL(ExemploSimplesWebService_address), this);
                _stub.setPortName(getExemploSimplesWebServiceWSDDServiceName());
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
        if ("ExemploSimplesWebService".equals(inputPortName)) {
            return getExemploSimplesWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.simples.exemplo", "ExemploSimplesWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.simples.exemplo", "ExemploSimplesWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExemploSimplesWebService".equals(portName)) {
            setExemploSimplesWebServiceEndpointAddress(address);
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
