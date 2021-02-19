package ws;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(serviceName = "Relevebanque")
public class BankReleveWs {
	List<Operation> Operations = new ArrayList<Operation>();
	
	@WebMethod(operationName = "BankStatement")
	public Releve getReleve(@WebParam(name = "RIB")int RIB) {
		return new Releve(RIB, 564.363 ,new Date(), Operations); 
	}
	
	@WebMethod
	public List<Operation> Listoperations() {
	  	List<Operation> Operations = new ArrayList<Operation>();
		Operations.add(new Operation("CREDIT", 1525.23,"My operation" ,new Date()));
		Operations.add(new Operation("CREDIT", 1525.23,"lorem" ,new Date()));
		Operations.add(new Operation("DEBIT", 1525.23,"hello" ,new Date()));
		Operations.add(new Operation("CREDIT", 1525.23,"hello" ,new Date()));
		Operations.add(new Operation("DEBIT", 1525.23,new Date()));
		return Operations;
	};
}
