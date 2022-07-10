package pojos;

import java.time.LocalDate;
import javax.persistence.*;


@Entity //mandatory
@Table(name = "vendor_tbl")
public class Vendor {

	@Id//mandatory : PK constraint
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto id generation + constraint : auto_incr
	@Column(name = "vendor_id")
	private Integer id;
	@Column(name="Name")
	private String name;
	@Column(name="email",unique=true)
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="reg_Amount")
	private Double regAmount ;
	@Column(name="reg_date")
	private LocalDate regDate;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", regAmount="
				+ regAmount + ", regDate=" + regDate + "]";
	}
	
	
	
	
}
