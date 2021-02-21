package ws;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Releve {
	private int RIB;
	private double sold;
	private Date dateReleve; 
	List<Operation> Operations = new ArrayList<Operation>();
	
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
