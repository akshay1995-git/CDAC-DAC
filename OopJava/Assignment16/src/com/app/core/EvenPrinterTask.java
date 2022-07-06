package com.app.core;
import static java.lang.Thread.currentThread;

import java.util.Random;
public class EvenPrinterTask implements Runnable{
	
	private int start;
	private int end;
	private Random r1; //null
	
	public EvenPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		r1 = new Random(); //creating instance of random generator
		System.out.println("Const invoked by "+currentThread().getName());
	}

	@Override
	public void run() 
	//cannot throws bcz ovverriding form of method cannot throw new or broader exception
	{
		System.out.println("Execution started " + currentThread().getName());
		try {
			for (int i = start; i < end; i++) {
				if(i%2==0) {
					
					System.out.println("Thread " + currentThread().getName() +"exec # " + i);
					System.out.println("Even Printing...." +i);
					Thread.sleep(r1.nextInt(401)+100);
					
					//After execution thread will dead 
					//If we access dead thread, Illegal Thread State Exception would occur
				}
				
			}
		} catch (Exception e) {
			System.out.println("Error in thread " + currentThread().getName() + " err " + e);
		}
		System.out.println(" Execution Over  " + currentThread().getName());

	}

}
