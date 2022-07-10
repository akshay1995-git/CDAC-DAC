package tester;

import static utils.HibernateUtils.getFactory;
import static java.time.LocalDate.parse;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

public class DeleteRecords {
	public static void main(String[] args) {
		//bootstrapping hib frmwork
		try(SessionFactory sf= getFactory();Scanner sc=new Scanner(System.in))
		{
			VendorDaoImpl userDao=new VendorDaoImpl();
			System.out.println("Enter a Reg_Amount and Specific Date:");
			System.out.println(userDao.deleteAll(sc.nextDouble(),parse(sc.next())));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
