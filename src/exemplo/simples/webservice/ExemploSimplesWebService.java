/**
 * ExemploSimplesWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exemplo.simples.webservice;

public interface ExemploSimplesWebService extends java.rmi.Remote {
    public long soma(long valor1, long valor2) throws java.rmi.RemoteException;
    public java.lang.String pegarDataAgora() throws java.rmi.RemoteException;
    public java.lang.String concatena(java.lang.String texto1, java.lang.String texto2) throws java.rmi.RemoteException;
}
