package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;




public class findVendorDetail {

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in))
		{
			VendorDaoImpl dao=new VendorDaoImpl();
			System.out.println("Enter Vendor id : ");
			
			System.out.println(dao.findByVendorId(sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
