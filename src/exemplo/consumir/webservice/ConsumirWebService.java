package exemplo.consumir.webservice;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import exemplo.simples.webservice.ExemploSimplesWebService;
import exemplo.simples.webservice.ExemploSimplesWebServiceServiceLocator;

public class ConsumirWebService {

	public static void main(String[] args) throws ServiceException, RemoteException {

		ExemploSimplesWebService exemplows = new ExemploSimplesWebServiceServiceLocator().getExemploSimplesWebService();
		System.out.println(exemplows.concatena("Leonardo", "Terrão"));
		System.out.println(exemplows.soma(20L, 20L));
		System.out.println(exemplows.pegarDataAgora());
	}
}