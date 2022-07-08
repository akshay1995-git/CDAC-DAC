import java.util.Scanner;
public class Salary{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a basic salary ");
    float bsalary = sc.nextFloat();
    float hra = 0.40f * bsalary;
    float pf = 0.12f * bsalary;
    int med_all=1200;
    int trav_all=800;
    float salary = bsalary-hra-pf-trav_all;

    System.out.println("HRA is 40% of basic salary: "+hra);
	System.out.println("PF amount to be deducted is 12% of basic: "+pf);
	System.out.println("In-hand Salary: "+salary);
	
	}
}