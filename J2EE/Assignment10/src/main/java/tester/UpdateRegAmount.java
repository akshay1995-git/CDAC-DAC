package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

public class UpdateRegAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory sf= getFactory();Scanner sc=new Scanner(System.in))
		{
			VendorDaoImpl vendorDao=new VendorDaoImpl();
			System.out.println("Enter a Email and NewRegistrationAmount :");
			System.out.println(vendorDao. updateRegAmt(sc.next(),sc.nextDouble()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
