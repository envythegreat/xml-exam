

import ws.BankReleveWsProxy;
import ws.Operation;
import ws.Releve;

public class ClientService {

	public static void main(String[] args) throws Exception {
		BankReleveWsProxy SourceData = new BankReleveWsProxy();
		
		Releve myReleve = SourceData.bankStatement(85963659);
		Operation[] Opration  = myReleve.getOperations();
		
		// myReleve main Data
		System.out.println("Releve Data");
		System.out.println(myReleve.getRIB());
		System.out.println(myReleve.getDateReleve().getTime());
		System.out.println(myReleve.getSold());
		
		System.out.println("List des Operations");
		for(Operation op:Opration) {
			System.out.println("Operation Type : " + op.getMytype());
			System.out.println("Operation Description : " + op.getDescription());
			System.out.println("Operation montant : " + op.getMontant());
			System.out.println("Operation Date : " + op.getDateOp().getTime());
			System.out.println("---------------------------");
		}
		
	}

}
