package dao;

import java.sql.SQLException;


public interface ICandidate {

	void registerCandidate(String name,String part_name) throws SQLException;
	
}
