package dao;

import java.sql.SQLException;
import java.util.List;


public interface ICandidate {

	void registerCandidate(String name,String part_name) throws SQLException;
	
	
	List<String> fetchAllCandidates() throws SQLException;
	
	
	//public int cadidateVoteCount(int id);
}
