package pojos;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="bank_accts")
public class BankAccount extends BaseEntity {
	@Enumerated(EnumType.STRING)
	@Column(length=30)
	private AccType type;
    private double balence;
    @Temporal(TemporalType.DATE)//bydefault,it chooses timestamp
    private Date transactionDate;
    //many to one ,bidirectional association
    //manyside,child,owning side
    @ManyToOne
    @JoinColumn(name="vendor_id")
   private Vendor accOwner;
	public BankAccount() {
		System.out.println("In bankacct ctor");
	}
	public BankAccount(AccType type, double balence, Date transactionDate) {
		super();
		this.type = type;
		this.balence = balence;
		this.transactionDate = transactionDate;
	}
	public AccType getType() {
		return type;
	}
	public void setType(AccType type) {
		this.type = type;
	}
	public double getBalence() {
		return balence;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public Vendor getAccOwner() {
		return accOwner;
	}
	public void setAccOwner(Vendor accOwner) {
		this.accOwner = accOwner;
	}
	@Override
	public String toString() {
		return "BankAccount [type=" + type + ", balence=" + balence + "]";
	}
    
}
