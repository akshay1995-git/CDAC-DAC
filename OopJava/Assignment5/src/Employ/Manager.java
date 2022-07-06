package Employ;
public class Manager extends Emp {
         double perbonus;
	public Manager(int id,String name,String deptId,double basic,double perbonus) {
		// TODO Auto-generated constructor stub
		super(id,name,deptId,basic);
		this.perbonus=perbonus;
	}
	public String toString() {
		return " "+super.toString()+" Performance Bonus : "+this.perbonus;
	}
    public double netSalary() {
    	return basic+perbonus;
    }
	public void setPerbonus(double perbonus) {
		this.perbonus = perbonus;
	}
	public double getPerbonus() {
		return perbonus;
	}

    
}
