package ws;

import java.util.Date;


public class Operation {
	private String mytype;
	private double montant;
	private String description;
	private Date dateOp;
	
	// constructor methods 
	public Operation() {
		super();
	}
	
	public Operation(String mytype, double montant, Date dateOp) {
		super();
		this.mytype = mytype;
		this.montant = montant;
		this.dateOp = dateOp;
	}
	
	public Operation(String mytype, double montant, String description, Date dateOp) {
		super();
		this.mytype = mytype;
		this.montant = montant;
		this.description = description;
		this.dateOp = dateOp;
	}
	
	// End constructor methods 
	
	
	public String getMytype() {
		return mytype;
	}
	
	

	public void setMytype(String mytype) {
		this.mytype = mytype;
	}
	
	public double getMontant() {
		return montant;
	}
	
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDateOp() {
		return dateOp;
	}
	
	public void setDateOp(Date dateOp) {
		this.dateOp = dateOp;
	}
}
