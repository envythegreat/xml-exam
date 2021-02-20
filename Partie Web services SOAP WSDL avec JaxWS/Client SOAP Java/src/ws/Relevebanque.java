/**
 * Relevebanque.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface Relevebanque extends javax.xml.rpc.Service {
    public java.lang.String getBankReleveWsPortAddress();

    public ws.BankReleveWs getBankReleveWsPort() throws javax.xml.rpc.ServiceException;

    public ws.BankReleveWs getBankReleveWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
