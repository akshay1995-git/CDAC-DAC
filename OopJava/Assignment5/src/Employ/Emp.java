package Employ;
public abstract class Emp {
      int id;
      String name;
      String deptId;
      double basic;
	public Emp(int id,String name,String deptId,double basic) {
		// TODO Auto-generated constructor stub
		this.id=id;
	    this.name=name;
	    this. deptId=deptId;
	    this.basic=basic;
	}
	public String toString() {
		return "id : "+this.id+" Name : "+this.name+" Dept : "+this.deptId+"Basic : "+this.basic;
	}
	public abstract double netSalary();
	public int getId() {
		return id;
	}
	
	
     
}
