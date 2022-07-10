package dao;

import java.util.List;

import pojos.Vendor;

public interface IVendorDao {
public String addVendorDetail(Vendor vendor);

public Vendor findByVendorId(int vendorId);

//get all vendor detail
List<Vendor> getAllVendor();
}
