package releve;
import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable{
  private AccountType type;
  private Date date;
  private float montant;
  private String description;
public AccountType getType() {
	return type;
}
public void setType(AccountType type) {
	this.type = type;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public float getMontant() {
	return montant;
}
public void setMontant(float montant) {
	this.montant = montant;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Operation(AccountType type, Date date, float montant, String description) {
	super();
	this.type = type;
	this.date = date;
	this.montant = montant;
	this.description = description;
}
public Operation() {
	super();
	// TODO Auto-generated constructor stub
}
  
}