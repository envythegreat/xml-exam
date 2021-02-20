import javax.xml.ws.Endpoint;

import ws.BankReleveWs;


public class ServerJaxWs {

	public static void main(String[] args) {
		String Url = "http://192.168.1.101:8080/";
		Endpoint.publish(Url, new BankReleveWs());
		System.out.println("Working at : " + Url);
	}

}
