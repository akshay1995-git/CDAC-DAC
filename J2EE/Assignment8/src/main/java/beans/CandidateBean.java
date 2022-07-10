package beans;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import dao.CandidateDaoImpl;


public class CandidateBean {
	private String name;
	private String party;
	private String dateOfBirth;
	private String message;
	private CandidateDaoImpl candidateDao;
	public CandidateBean() throws Exception {
		candidateDao = new CandidateDaoImpl();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public CandidateDaoImpl getCandidateDao() {
		return candidateDao;
	}
	public void setCandidateDao(CandidateDaoImpl candidateDao) {
		this.candidateDao = candidateDao;
	}
	public String checkAge() throws ClassNotFoundException, SQLException {
		LocalDate date=LocalDate.parse(dateOfBirth);
		Period period=Period.between(date, LocalDate.now());
		int age=period.getYears();
		if(age>25) {
			message=candidateDao.registerCandidate(name,party);
			return "admin_page";
		}
		else {
			message = "registration failed";
			return "admin_page";
		}
	}
	
	
}
