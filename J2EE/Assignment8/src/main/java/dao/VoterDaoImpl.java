package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.Voters;

import static utils.DBUtils.*;

public class VoterDaoImpl implements IVoterDao {
	private Connection cn;
	private PreparedStatement pst1,pst2;
	
	public VoterDaoImpl() throws SQLException, ClassNotFoundException{
		cn=fetchConnection();
		pst1=cn.prepareStatement("select * from voters where email=? and password=?");
		pst2=cn.prepareStatement("update voters set status=1 where id=?");
		System.out.println("dao created");
		
	}

	@Override
	public Voters authenticateVoter(String email, String password) throws ClassNotFoundException,SQLException {
		pst1.setString(1, email);
		pst1.setString(2, password);
		try (ResultSet rst = pst1.executeQuery()){
			if(rst.next()) {// id | name    | email             | password | status | role 
				return new Voters(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getBoolean(5),rst.getString(6));
				
			}else 
				return null;
		}
		
	}

	@Override
	public String voteCasted(int id) throws ClassNotFoundException, SQLException {
		String stm;
		pst2.setInt(1, id);
		if(pst2.executeUpdate()==1) {
			stm="vote cast";
		}else {
			stm="not casted vote";
		}
		return stm;
	}
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		System.out.println("cleaned up");
	}

	
}
