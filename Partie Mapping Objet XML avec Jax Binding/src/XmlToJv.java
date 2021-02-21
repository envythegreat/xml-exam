import javax.xml.bind.*;

import releve.Operation;
import releve.Releve;

import java.io.*;
import java.util.List;
public class XmlToJv {

	public static void main(String[] args) throws Exception {
		JAXBContext jc=JAXBContext.newInstance(Releve.class);
		Unmarshaller unmarshaller=jc.createUnmarshaller();
		Releve releve=(Releve) unmarshaller.unmarshal(new File("releve.xml"));
		List<Operation> operation = releve.getOperations();
		System.out.println("Releve data");
		System.out.println(releve.getRib());
		System.out.println(releve.getDateReleve());
		System.out.println(releve.getSolde());
		System.out.println("Operation List");
		for(Operation op:operation) {
			System.out.println("----------------------------");
			System.out.println("Operation Type : " + op.getType());
			System.out.println("Operation Date : " +  op.getDate());
			System.out.println("Operation Montant : " + op.getMontant());
			System.out.println("Operation Desc : "  + op.getDescription());
		}

	}

}
