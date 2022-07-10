package tester;

import org.hibernate.SessionFactory;
import static utils.HibernateUtils.getFactory;
import dao.VendorDaoImpl;

public class GetAllVendorDetail {
	public static void main(String[] args) {
		
	
	try (SessionFactory sf = getFactory();) {
		// create dao instance
		VendorDaoImpl dao = new VendorDaoImpl();
		dao.getAllVendor().forEach(System.out::println);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}