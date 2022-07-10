package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;
import pojos.Vendor;



public class findVendorDetail {

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in))
		{
			VendorDaoImpl dao=new VendorDaoImpl();
			System.out.println("Enter Vendor id : ");
			Vendor ref=dao.findByVendorId(sc.nextInt());
			System.out.println(ref);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
