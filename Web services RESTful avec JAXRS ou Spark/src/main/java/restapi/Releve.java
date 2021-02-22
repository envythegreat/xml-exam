package restapi;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Releve {
	private long  rib;
	private Date dateReleve;
	private float solde;
	
	
	private List<Operation> operations;
	
	public Releve(Long rib, Date dateReleve, float solde) {
		super();
		this.rib = rib;
		this.dateReleve = dateReleve;
		this.solde = solde;
		operations=new ArrayList<>();
	}
	
	public Long getRib() {
		return rib;
	}
	public void setRib(long rib) {
		this.rib = rib;
	}
	public Date getDateReleve() {
		return dateReleve;
	}
	public void setDateReleve(Date dateReleve) {
		this.dateReleve = dateReleve;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public Releve() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addOperation(Operation op) {
		if(op!=null)
		operations.add(op);
	}
	

}