package ws;

import java.util.Date;


public class Operation {
	private String typeOp;
	private double montantOp;
	private String description;
	private Date dateOp;
	
	// constructor methods 
	public Operation() {
		super();
	}
	
	public Operation(String mytype, double montant, Date dateOp) {
		super();
		this.typeOp = mytype;
		this.montantOp = montant;
		this.dateOp = dateOp;
	}

	public Operation(String mytype, double montant, String description, Date dateOp) {
		super();
		this.typeOp = mytype;
		this.montantOp = montant;
		this.description = description;
		this.dateOp = dateOp;
	}
	
	// End constructor methods
	public String getMytype() {
		return typeOp;
	}

	public void setMytype(String mytype) {
		this.typeOp = mytype;
	}

	public double getMontant() {
		return montantOp;
	}

	public void setMontant(double montant) {
		this.montantOp = montant;
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
