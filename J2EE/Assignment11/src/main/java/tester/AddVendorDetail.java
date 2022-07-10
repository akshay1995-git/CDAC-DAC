package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

//import org.hibernate.SessionFactory;
import org.hibernate.*;
import dao.VendorDaoImpl;
import pojos.Vendor;



public class AddVendorDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in))
		{
			//create Dao instance
			VendorDaoImpl vendorDao=new VendorDaoImpl();
			
			System.out.println("Enter user details name, email, password, regAmount, regDate(yyyy-MM-dd)");
			Vendor vendor=new Vendor(sc.next(),sc.next(),sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()));
		System.out.println("Status "+vendorDao.addVendorDetail(vendor));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
