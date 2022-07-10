package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Vendor;

public interface IVendorDao {
	//Add vendor 
 String addVendorDetail(Vendor vendor);
//find vendor by Id
 Vendor findByVendorId(int vendorId);
//get all vendor detail
List<Vendor> getAllVendor();
//Update Vendor registration amount
String updateRegAmt(String mail,Double newRegAmt);
//Vendor Login
String loginVendor(String mail,String password);
//Delete all Details in vendor table
String deleteAll(Double regAmount,LocalDate date);

}
