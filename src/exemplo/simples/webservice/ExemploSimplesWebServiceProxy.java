package exemplo.simples.webservice;

public class ExemploSimplesWebServiceProxy implements exemplo.simples.webservice.ExemploSimplesWebService {
  private String _endpoint = null;
  private exemplo.simples.webservice.ExemploSimplesWebService exemploSimplesWebService = null;
  
  public ExemploSimplesWebServiceProxy() {
    _initExemploSimplesWebServiceProxy();
  }
  
  public ExemploSimplesWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initExemploSimplesWebServiceProxy();
  }
  
  private void _initExemploSimplesWebServiceProxy() {
    try {
      exemploSimplesWebService = (new exemplo.simples.webservice.ExemploSimplesWebServiceServiceLocator()).getExemploSimplesWebService();
      if (exemploSimplesWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)exemploSimplesWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)exemploSimplesWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (exemploSimplesWebService != null)
      ((javax.xml.rpc.Stub)exemploSimplesWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public exemplo.simples.webservice.ExemploSimplesWebService getExemploSimplesWebService() {
    if (exemploSimplesWebService == null)
      _initExemploSimplesWebServiceProxy();
    return exemploSimplesWebService;
  }
  
  public long soma(long valor1, long valor2) throws java.rmi.RemoteException{
    if (exemploSimplesWebService == null)
      _initExemploSimplesWebServiceProxy();
    return exemploSimplesWebService.soma(valor1, valor2);
  }
  
  public java.lang.String pegarDataAgora() throws java.rmi.RemoteException{
    if (exemploSimplesWebService == null)
      _initExemploSimplesWebServiceProxy();
    return exemploSimplesWebService.pegarDataAgora();
  }
  
  public java.lang.String concatena(java.lang.String texto1, java.lang.String texto2) throws java.rmi.RemoteException{
    if (exemploSimplesWebService == null)
      _initExemploSimplesWebServiceProxy();
    return exemploSimplesWebService.concatena(texto1, texto2);
  }
  
  
}