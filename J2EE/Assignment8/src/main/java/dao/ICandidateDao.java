package dao;

import java.sql.SQLException;
import java.util.*;
import pojos.Candidate;

public interface ICandidateDao {
	String registerCandidate(String name,String party) throws SQLException,ClassNotFoundException;
	List<Candidate> fetchDetailsOfCandidate()throws SQLException,ClassNotFoundException;
	String castVotes(int id)throws SQLException,ClassNotFoundException;
}
