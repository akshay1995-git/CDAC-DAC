package dao;

import static utils.HibernateUtils.getFactory;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import pojos.Vendor;

public class VendorDaoImpl implements IVendorDao {

	@Override
	public String addVendorDetail(Vendor vendor) {
		//get session from SF
		String mesg="adding Vendor details failed";
		Session session =getFactory().openSession();//opens new session
	//begin transaction tx
		Transaction tx=session.beginTransaction();
		try {
			//CRUD API
			Serializable id=session.save(vendor);
			System.out.println("ID : " +id);
			tx.commit();//insertion of the rec;
			mesg="adding vendor details successfully added with id : "+id;
		}catch(RuntimeException e) {
			//fail transaction
			if(tx!=null) {
				tx.rollback();
			}
			throw e;
		}finally {
			//close session
			if(session!=null) {
				session.close();//release DB connection
			}
		}
		return mesg;
	}

	@Override
	public Vendor findByVendorId(int vendorId) {
		Vendor vendor=null;
		
		Session session =getFactory().openSession();//opens new session
		//begin transaction tx
			Transaction tx=session.beginTransaction();
			
			try {
				//CRUD API
			session.get(Vendor.class,vendorId);//int--->>Integer
		tx.commit();
			
			}catch(RuntimeException e) {
				//fail transaction
				if(tx!=null) {
					tx.rollback();
				}
				throw e;
			}finally {
				//close session
				if(session!=null) {
					session.close();//release DB connection
				}
			}
			return vendor;
	}

	@Override
	public List<Vendor> getAllVendor() {
		List<Vendor> users=null;
		String jpql="select v from Vendor v";
		// get session from SF
				Session session=getFactory().getCurrentSession();
				//begin tx
				Transaction tx=session.beginTransaction();
				try {
					users=session.createQuery(jpql,Vendor.class).getResultList();//users:list of persistent pojos
				    
					tx.commit();
				}catch (RuntimeException e) {
					if(tx != null)
						tx.rollback();
					throw e;
				}
		return users;
		
	}

}
