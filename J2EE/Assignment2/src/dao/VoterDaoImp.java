package dao;

import static utils.DBUtils.fetchConnection;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import pojos.Voter;

public class VoterDaoImp implements IVoter {

	private Connection cn;
	private PreparedStatement pst1;//,pst2;
	public VoterDaoImp()throws ClassNotFoundException, SQLException {
		
		cn = fetchConnection();
		// create pre-parsed n pre compiled stmt : for dynamic n repetative queries
		pst1 = cn.prepareStatement("select * from voters where email=? and password= ?");
		//pst2=cn.prepareStatement("insert into voters values(default,?,?,?,?,?)");
		//pst3=cn.prepareStatement("update my_emp set salary=salary+? where empid=?");
		System.out.println("Voters Dao created...");
	}
	
	
	public List<Voter> fetchVoterDetails(String email,String password) throws SQLException {
		// create empty AL
		List<Voter> voters = new ArrayList<>();
		pst1.setString(1, email);
		pst1.setString(2, password);
		try (ResultSet rst = pst1.executeQuery()) {
			
			while (rst.next())
				voters.add(new Voter(rst.getInt(1), rst.getString(2), rst.getString(3),
						rst.getString(4),rst.getBoolean(5),
						rst.getString(6)));
		}
		return voters;
	}

	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		System.out.println("emp dao cleaned up...");
	}
}
