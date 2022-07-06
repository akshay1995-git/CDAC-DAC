package tester;

import java.util.Scanner;

import com.app.core.EvenPrinterTask;
import com.app.core.OddPrinterTask;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Main Started");
			System.out.println("Enter starting and ending range for Even Printer: ");
			
			//Creating instance of class which implements Runnable 
			EvenPrinterTask e1 = new EvenPrinterTask(sc.nextInt(), sc.nextInt());
			
			System.out.println("Enter starting and ending range for Odd Printer: ");
			OddPrinterTask o1 = new OddPrinterTask(sc.nextInt(),sc.nextInt());
			// e1 /o1 not yet started - only one-(main) thread is running 
			
			//Thread for EvenPrinter
			Thread t1 = new Thread(e1,"Even Printer1");
			Thread t2 = new Thread(e1,"Even Printer2");
			Thread t3 = new Thread(e1,"Even Printer3");
			

			//Thread for OddPrinter				
			Thread t4 = new Thread(o1,"Odd Printer1");
			Thread t5 = new Thread(o1,"Odd Printer2");
			Thread t6 = new Thread(o1,"Odd Printer3");
			
			//Thread t7 = new Thread(new EvenPrinterTask(sc.nextInt(),sc.nextInt()),"even");
			
			//starting the thread--i.e, creating new thread
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			
			//Main thread is waiting for child thread to execute
			System.out.println("Main is waiting for child...");
			
			//join method - to get rid of orphan child
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			System.out.println("Main Over....");
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("In catch-block");
		}

	}

}
