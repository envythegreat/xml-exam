import javax.xml.ws.Endpoint;

import ws.BankReleveWs;


public class ServerJaxWs {

	public static void main(String[] args) {
		String Url = "http://localhost:9090/";
		Endpoint.publish(Url, new BankReleveWs());
		System.out.println(Url);
	}

}
