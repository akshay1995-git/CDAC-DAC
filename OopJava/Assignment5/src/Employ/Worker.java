package Employ;
public class Worker extends Emp{
 private static
int hour;
 double rate;
	public Worker(int id,String name,String deptId,double basic,int hr,double rate) {
		// TODO Auto-generated constructor stub
		super(id,name,deptId,basic);
		hour=hr;
		this.rate=rate;
	}
 public String toString() {
	//	String hr;
		return " "+super.toString()+" Hour :  "+hour+" HourlyRate : "+this.rate;
	}
 public double netSalary() {
 	return (basic+hour*rate/100);
 }
public double getRate() {
	return rate;
}

public void setRate(double rate) {
	this.rate = rate;
}

 
}
