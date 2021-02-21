import java.util.List;

import ws.BankReleveWs;
import ws.Operation;
import ws.Releve;
import ws.Relevebanque;

public class ClientService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankReleveWs myData = new Relevebanque().getBankReleveWsPort();
		Releve myReleve = myData.bankStatement(748596);
		List<Operation> Operation = myReleve.getOperations();
		
		System.out.println("Releve information");
		System.out.println(myReleve.getRIB());
		System.out.println(myReleve.getDateReleve());
		System.out.println(myReleve.getSold());
		
		System.out.println("List des Operations");
		for(Operation op:Operation) {
			System.out.println("Operation Type : " + op.getMytype());
			System.out.println("Operation Description : " + op.getDescription());
			System.out.println("Operation montant : " + op.getMontant());
			System.out.println("Operation Date : " + op.getDateOp());
			System.out.println("---------------------------");
		}
		
	}

}
