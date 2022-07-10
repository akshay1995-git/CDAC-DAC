package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static utils.DBUtils.*;

import pojos.Candidate;

public class CandidateDaoImpl implements ICandidateDao {
	private Connection cn;
	private PreparedStatement ps1, ps2,ps3;

	public CandidateDaoImpl() throws ClassNotFoundException, SQLException {
		cn = fetchConnection();
		ps1 = cn.prepareStatement("insert into candidates values(default,?,?,0)");
		ps2 = cn.prepareStatement("select * from candidates");
		ps3=cn.prepareStatement("update candidates set votes=votes+1 where id=? ");
	}

	@Override
	public String registerCandidate(String name, String party) throws SQLException, ClassNotFoundException {
		String stm;
		ps1.setString(1, name);
		ps1.setString(2, party);
		int i = ps1.executeUpdate();
		if (i == 1) {
			stm = "successfully";
		} else {
			stm = "unsuccessfully";
		}
		return stm;
	}

	@Override
	public List<Candidate> fetchDetailsOfCandidate() throws SQLException, ClassNotFoundException {
		List<Candidate> candidates = new ArrayList<Candidate>();
		try (ResultSet rst = ps2.executeQuery()) {
			while (rst.next()) {
				candidates.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
			}

		}
		return candidates;
	}

	@Override
	public String castVotes(int id) throws SQLException, ClassNotFoundException {
		String stm;
		ps3.setInt(1, id);
		if(ps3.executeUpdate()==1) {
			stm="got vote";
		}else {
			stm="not got";
		}
		return stm;
	}
	public void cleanUp() throws SQLException {
		if (ps1 != null)
			ps1.close();
		if (ps2 != null)
			ps2.close();
		if (ps3 != null)
			ps3.close();
		System.out.println("cleaned up");
	}
}
