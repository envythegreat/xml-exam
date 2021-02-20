/**
 * BankReleveWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface BankReleveWs extends java.rmi.Remote {
    public ws.Operation[] listoperations() throws java.rmi.RemoteException;
    public ws.Releve bankStatement(int RIB) throws java.rmi.RemoteException;
}
