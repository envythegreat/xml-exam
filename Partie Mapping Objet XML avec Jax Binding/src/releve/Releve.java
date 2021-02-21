package releve;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Releve {
	private int RIB;
	private double sold;
	private Date dateReleve; 
	List<Operation> Operations = new ArrayList<Operation>();
	
	
	public List<Operation> Listoperations() {
		Operations.add(new Operation("CREDIT", 1234.23,"My operation 1" ,new Date()));
		Operations.add(new Operation("CREDIT", 7412.23,"My operation 2" ,new Date()));
		Operations.add(new Operation("DEBIT", 23659.23,"My operation 3" ,new Date()));
		Operations.add(new Operation("CREDIT", 6398.23,"My operation 5",new Date()));
		Operations.add(new Operation("DEBIT", 3297.23,"My operation 4",new Date()));
		return Operations;
	};
	
	public Releve() {
		super();
	}
	
	public Releve(int rIB, double sold, Date datereleve, List<Operation> oprations) {
		super();
		this.RIB = rIB;
		this.sold = sold;
		this.dateReleve = datereleve;
		this.Operations = oprations;
	}

	public int getRIB() {
		return RIB;
	}

	public void setRIB(int rIB) {
		RIB = rIB;
	}

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}

	public Date getDateReleve() {
		return dateReleve;
	}

	public void setDateReleve(Date dateReleve) {
		this.dateReleve = dateReleve;
	}

	public List<Operation> getOperations() {
		return Operations;
	}

	public void setOperations(Operation operation) {
		Operations.add(operation);
	}
	
	
	
}
