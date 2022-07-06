package Tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a First Vehicle Detail : ");
			Vehicle v1 = new Vehicle(sc.next(), sc.next(), sc.nextDouble());
			System.out.println("Enter a Second Vehicle Detail : ");
			Vehicle v2 = new Vehicle(sc.next(), sc.next(), sc.nextDouble());
			if (v1.equals(v2)) {
				System.out.println("SAME");
			} else {
				System.out.println("DIFFRENT");
			}
		}
	}

}
