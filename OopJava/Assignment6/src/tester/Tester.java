
package tester;
import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.FixedStack;
import com.app.org.GrowableStack;
import com.app.org.Stack;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = null;
		boolean flag= false;
		while(!flag) 
			{
			System.out.println("1. Fixed Stack 2. Growable Stack 3. Push Data 4. Pop Data 5. Exit");
			
			int choice = sc.nextInt(); sc.nextLine();
			switch(choice) {
			
			case 1: 
					if(stack==null) 
						{
						 	stack = new FixedStack();
						}
					else 
						{
							System.out.println("Stack is already chosen!");
						}
					break;
			
			case 2:
					if(stack==null) 
					{
						stack = new GrowableStack();
					}
					else 
					{
						System.out.println("Stack is already chosen!");
					}
					break;
			
			case 3: 
					System.out.println("Enter employee details (int id, String name, double salary)");
					Employee emps = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
					stack.push(emps);
					break;		
			
			case 4:
					Employee emp = stack.pop();
					if(emp!=null) 
					{
						System.out.println(emp.toString());
					}
					else 
					{
						System.out.println("Stack is empty!");
					}
					break;
			
			case 5: 
					flag = true ; 
					
					System.out.println("THANK YOU"); 
					
			default:
					System.out.println("Option not in the Menu"); 
					}
			}
		sc.close();
	}
}