package utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class HibernateUtils {
private static SessionFactory factory;
static {
	try {
	System.out.println("In static init block");
	//build singltone instance of SF
	factory=new Configuration().configure().buildSessionFactory();
	//configuration cfg=new Configuration()//activates hib. framework it read .cfg abd map file
	//cfg.configure();//check whether cfg file is correct or not
	//factory=cfg.buildSessionFactory();//creat jdbc connection
	System.out.println("SF Created.....");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
public static SessionFactory getFactory() {
	return factory;
}
}
