package dao;

import java.sql.SQLException;
//import java.sql.Date;

import java.util.List;


import pojos.Voter;




public interface IVoter {
	List<Voter> fetchVoterDetails(String email,String password) throws SQLException;
	
	
	
}
