package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity //mandatory
@Table(name = "vendors_tbl")
public class Vendor extends BaseEntity {

	
	//@GeneratedValue(strategy = GenerationType.IDENTITY) //auto id generation + constraint : auto_incr

	@Column(length=30)
	private String name;
	@Column(length=30,unique=true)
	private String email;
	@Column(length=30,nullable=true)//not null
	private String password;
	@Column(name="reg_Amount")
	private Double regAmount ;
	@Column(name="reg_date")
	private LocalDate regDate;
	//one to many
	//vendor:one,parent,inverse
	@OneToMany(mappedBy = "accOwner",cascade = CascadeType.ALL,orphanRemoval=true)
	private List<BankAccount> accounts=new ArrayList<>();
	
	
	public Vendor(String name, String email, String password, Double regAmount, LocalDate regDate) {
		super();
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}
	public Vendor() {
		System.out.println("in vendor ctor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getRegAmount() {
		return regAmount;
	}
	public void setRegAmount(Double regAmount) {
		this.regAmount = regAmount;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	//helper method
	public void addAccount(BankAccount acct) {
		//vendor--->>bankacct
		accounts.add(acct);
		//bankaccct-->vendor
		acct.setAccOwner(this);
	}
	public void removeAccount(BankAccount acct) {
		//vendor--->>bankacct
				accounts.remove(acct);
				//bankaccct-->vendor
				acct.setAccOwner(null);
	}
	@Override
	public String toString() {
		return "Vendor [,name=" + name + ", email=" + email + ", password=" + password + ", regAmount="
				+ regAmount + ", regDate=" + regDate + "]";
	}
	
	
	
	
}
