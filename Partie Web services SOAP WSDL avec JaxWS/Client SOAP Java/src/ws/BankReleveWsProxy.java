package ws;

public class BankReleveWsProxy implements ws.BankReleveWs {
  private String _endpoint = null;
  private ws.BankReleveWs bankReleveWs = null;
  
  public BankReleveWsProxy() {
    _initBankReleveWsProxy();
  }
  
  public BankReleveWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankReleveWsProxy();
  }
  
  private void _initBankReleveWsProxy() {
    try {
      bankReleveWs = (new ws.RelevebanqueLocator()).getBankReleveWsPort();
      if (bankReleveWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bankReleveWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bankReleveWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bankReleveWs != null)
      ((javax.xml.rpc.Stub)bankReleveWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.BankReleveWs getBankReleveWs() {
    if (bankReleveWs == null)
      _initBankReleveWsProxy();
    return bankReleveWs;
  }
  
  public ws.Operation[] listoperations() throws java.rmi.RemoteException{
    if (bankReleveWs == null)
      _initBankReleveWsProxy();
    return bankReleveWs.listoperations();
  }
  
  public ws.Releve bankStatement(int RIB) throws java.rmi.RemoteException{
    if (bankReleveWs == null)
      _initBankReleveWsProxy();
    return bankReleveWs.bankStatement(RIB);
  }
  
  
}