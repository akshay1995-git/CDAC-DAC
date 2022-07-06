package Tester;

import java.util.Scanner;
import Employ.Emp;
import Employ.Manager;
import Employ.Worker;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a count of employs....");
		Emp emp[] = new Emp[sc.nextInt()];
		boolean flag = true;
		int counter = 0;
		while (flag) {
			System.out.println("Options...\n 1. Hire Manager\n 2. Hire Worker"
					+ "\n 3. Display Information of Employs including net salary"
					+ "\n 4. Update Some info.");
			System.out.println("Enter a choice as per display..");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter a Manager Detail : Id Name Dept Salary PerformanceBonus");
				if (counter < emp.length) {
					emp[counter++] =  new Manager(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
				} else {
					System.out.println("Hiring of Manager Completed....");
				}
				break;
			case 2:
				System.out.println("Enter a Worker Detail : Id Name Dept Salary Hour Hourly-Rate ");
				if (counter < emp.length) {
					emp[counter++] = new Worker(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(),sc.nextInt());
				} else {
					System.out.println("Hiring of Worker Completed....");
				}
				break;
			case 3:
				System.out.println("Information of Hired employ is Given Below...!!!");
				for (Emp x : emp) {
					if (x != null) {
						System.out.println(x);
						if(x instanceof Manager) {
							System.out.println(((Manager)x).netSalary());
						}
						else if(x instanceof Worker) {
							System.out.println(((Worker)x).netSalary());
						}
						else {
							System.out.println("Invalid Type...!!!");
						}
					}
					else {
						System.out.println("There is no Manager and Employ in this Position... ");
					}
				}
				break;
			case 4:
			    System.out.println("Enter a Employ ID to update information...!!!");
			    int id=sc.nextInt();
			    boolean fg=false;
			    for(Emp y : emp) {
			    	if(y.getId()==id) {
			    		if(y instanceof Manager) {
			    			fg=true;
			    			System.out.println("update a bonus..?" );
			    			((Manager)y).setPerbonus(sc.nextDouble());
			    		}
			    		else if(y instanceof Worker) {
			    			fg=true;
			    			System.out.println("update Rate..?");
			    			((Worker)y).setRate(sc.nextDouble());
			    		}
			    	}
			    
			    }
			    if(fg==false) {
			    	System.out.println("Result not updated");
			    }
			   
				
				break;
			case 5:
			 flag=false;
			 System.out.println("You are exit from TestEmp ...");
				
			}

		}
       sc.close();
	}

	

}
