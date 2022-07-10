package dao;

import static utils.DBUtils.fetchConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pojos.Candidate;

//import pojos.Candidate;
public class CandidateDaoReg implements ICandidate {

	private Connection cn;
	private PreparedStatement pst1, pst2,pst3;

	public CandidateDaoReg() throws ClassNotFoundException, SQLException {

		cn = fetchConnection();

		pst1 = cn.prepareStatement("insert into candidates(name,party,votes) values(?,?,?) ");
		pst2 = cn.prepareStatement("select * from candidates");
		pst3=cn.prepareStatement("update candidates set votes=? where id=?");

	}

	public void registerCandidate(String name, String party_name) throws SQLException {
		System.out.println("Enter a candidate name and party_name");
		pst1.setString(1, name);
		pst1.setString(2, party_name);
		pst1.setInt(3, 0);
		int execute = pst1.executeUpdate();
		boolean exit = true;
		while (exit) {
			if (execute == 1) {
				System.out.println("Registration SuccessFul");
				exit = false;
			} else {
				System.out.println("Registration is Not SuccessFul");
			}
		}
	}

	List<Candidate> list = new ArrayList<>();

	public void candidateData() throws SQLException {
		ResultSet rst = pst2.executeQuery();

		while (rst.next()) {
			// System.out.printf("id Id %d name %s part %s vote %d %n",
			int a = rst.getInt("id");
			String b = rst.getString("name");
			String c = rst.getString("party");
			int d = rst.getInt("votes");
			System.out.println(a + " " + b + " " + c + " " + d);
		}
	}
	public String updateVotes(int id,int votes) throws SQLException{
		String mesg="Updating votes of candidate  failed!!!!!";
		pst3.setInt(1, votes);
		pst3.setInt(2, id);
		int updateStatus=pst3.executeUpdate();
		if(updateStatus==1) 
			 mesg= "Votes of candidate updated successfully ";
				return mesg;
		
	}
	public void cleanUp() throws SQLException {
		if (pst2 != null)
			pst2.close();
		System.out.println("emp dao cleaned up...");
	}
}
