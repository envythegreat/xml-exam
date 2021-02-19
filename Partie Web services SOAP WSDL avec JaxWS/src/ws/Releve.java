package ws;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Releve {
	private int RIB;
	private double sold;
	private Date dateReleve; 
	List<Operation> Operations = new ArrayList<Operation>();
	
	public int getRIB() {
		return RIB;
	}
	
	public Releve() {
		super();
	}
	
	public Releve(int rIB, double sold, Date dateReleve, List<Operation> oprations) {
		super();
		RIB = rIB;
		this.sold = sold;
		this.dateReleve = dateReleve;
		this.Operations = oprations;
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
	
	
	
}
