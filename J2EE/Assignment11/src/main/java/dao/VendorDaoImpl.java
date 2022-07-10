package dao;

import static utils.HibernateUtils.getFactory;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import pojos.Vendor;

public class VendorDaoImpl implements IVendorDao {

	@Override
	public String addVendorDetail(Vendor vendor) {
		// get session from SF
		String mesg = "adding Vendor details failed";
		Session session = getFactory().openSession();// opens new session
		// begin transaction tx
		Transaction tx = session.beginTransaction();
		try {
			// CRUD API
			Serializable id = session.save(vendor);
			System.out.println("ID : " + id);
			tx.commit();// insertion of the rec;
			mesg = "adding vendor details successfully added with id : " + id;
		} catch (RuntimeException e) {
			// fail transaction
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		} finally {
			// close session
			if (session != null) {
				session.close();// release DB connection
			}
		}
		return mesg;
	}

/*	@Override
	public Vendor findByVendorId(int vendorId) {
		Vendor vendor = null;

		Session session = getFactory().openSession();// opens new session
		// begin transaction tx
		Transaction tx = session.beginTransaction();

		try {
			// CRUD API
			session.get(Vendor.class, vendorId);// int--->>Integer
			tx.commit();

		} catch (RuntimeException e) {
			// fail transaction
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		} finally {
			// close session
			if (session != null) {
				session.close();// release DB connection
			}
		}
		return vendor;
	}

	@Override
	public List<Vendor> getAllVendor() {
		List<Vendor> users = null;
		String jpql = "select v from Vendor v";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, Vendor.class).getResultList();// users:list of persistent pojos

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return users;

	}

	@Override
	public String updateRegAmt(String mail, Double newRegAmt) {
		Vendor vendor = null;
		String msg = "Registration Amount Updated SuccessFully...!!!";
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			List<Vendor> vendors = session.createQuery("select v from Vendor v", Vendor.class).getResultList();
			for (Vendor v : vendors) {
				if (v.getEmail().equals(mail)) {
					vendor = session.get(Vendor.class,v.getId());
					if (vendor != null) {
						vendor.setRegAmount(newRegAmt);// modifying the state of persistent pojo/entity
						msg = "Registration amount  updated successfully...!!!";
					}
				}
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return msg;
	}

	@Override
	public String deleteAll(Double regAmount,LocalDate date) {
		String msg="Data  Not Removed from table Plz Enter suitable Amount and Date..!!!";
		//Vendor vendor=null;
		String jpql="select v from Vendor v ";
		// get session from SF
				Session session = getFactory().getCurrentSession();
				// begin tx
				Transaction tx = session.beginTransaction();
				try {
					List<Vendor> vendors = session.createQuery(jpql, Vendor.class).getResultList();
					for (Vendor v : vendors) {
						Vendor vendor=v;
						if(vendor!=null) {
						if((v.getRegAmount()<regAmount) && v.getRegDate().isBefore(date)) {
							
							session.delete(vendor);
							msg="Vendor data Removed From table SuccesssFully of Id "+v.getId();
						}
						}
					}
					tx.commit();
				} catch (RuntimeException e) {
					if (tx != null)
						tx.rollback();
					throw e;
				}
				
		return msg;
	}
	

	@Override
	public String loginVendor(String mail, String password) {
		String msg="Login Failed Plz chech mail and password";
		Vendor vendor=null;
		String jpql="select v from Vendor v";
		// get session from SF
				Session session = getFactory().getCurrentSession();
				// begin tx
				Transaction tx = session.beginTransaction();
				try {
					List<Vendor> vendors = session.createQuery(jpql, Vendor.class).getResultList();
					for (Vendor v : vendors) {
						if (v.getEmail().equals(mail) && v.getPassword().equals(password)) {
							vendor = session.get(Vendor.class,v.getId());
							if (vendor != null) {
								msg="Login Successful...welcome to Homepage !!!";
							}
						}
					}
					tx.commit();	
				} catch (RuntimeException e) {
					if (tx != null)
						tx.rollback();
					throw e;
				}
		return msg;
	}
*/
}
