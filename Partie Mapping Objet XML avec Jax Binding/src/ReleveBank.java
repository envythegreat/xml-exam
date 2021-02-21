import java.io.File;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import releve.AccountType;
import releve.Operation;
import releve.Releve;

public class ReleveBank {

	public static void main(String[] args) throws Exception {
		
		Releve releve=new Releve(Long.valueOf(467443643),new Date(), 46848);
		
		Operation op1=new Operation(AccountType.CREDIT, new Date(), 2006, "Lorem Epsum");
		Operation op2=new Operation(AccountType.DEBIT, new Date(), 1949, "Helloopl");
		Operation op3=new Operation(AccountType.CREDIT, new Date(), 2013, "Lorem epo");
		Operation op4=new Operation(AccountType.CREDIT, new Date(), 2013, "Hello");
		
	    releve.addOperation(op3);
	    releve.addOperation(op1);
	    releve.addOperation(op2);
	    releve.addOperation(op4);
    
    JAXBContext context=JAXBContext.newInstance(Releve.class);
    	Marshaller marshaller=context.createMarshaller();   
    	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    	marshaller.marshal(releve, new File("releve.xml"));
    	
	}

}