package dao;

import java.sql.SQLException;

import pojos.Voters;

public interface IVoterDao {
Voters authenticateVoter(String email,String password) throws ClassNotFoundException,SQLException;
String voteCasted(int id)throws ClassNotFoundException,SQLException;
}
