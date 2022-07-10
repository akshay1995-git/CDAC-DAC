package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CandidateDaoReg;

import pojos.Candidate;
import utils.DBUtils;

/**
 * Servlet implementation class CandidateServlet
 */
//@WebServlet("/candidates")
public class CandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 private CandidateDaoReg candidateDao;
	
	public void init() throws ServletException {

		try {
			System.out.println("in init of "+getClass().getName());
			//instantiate dao ---getConn ---establish db conn
			candidateDao=new CandidateDaoReg();
			} catch (Exception e) {
				throw new ServletException("err in init of "+getClass().getName(),e);
			}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			candidateDao.cleanUp();
			DBUtils.closeConnection();
			} catch (Exception e) {
			//	System.out.println("err in destroy "+e);
				throw new RuntimeException("err in destory", e);//understanding purpose!!!!
			}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter pw=response.getWriter()){
		List<Candidate> list=candidateDao.getCandidateList();
		if(list==null) {
			pw.print("<h5> No Data in Candidate table</h5>");
		}
		else {
			pw.print("<h5>"+list+"<h5>");
		}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
