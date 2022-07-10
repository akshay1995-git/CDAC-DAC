package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.CandidateDaoReg;
import pojos.Voter;

/**
 * Servlet implementation class VoterData
 */
@WebServlet("/voterData")
public class VoterData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5>Successful Login </h5>");
			// get HttpSession from WC
			HttpSession hs = request.getSession();
		//	System.out.println("from 2nd page HS is new " + hs.isNew());// false
			System.out.println("session id "+hs.getId());//SAME session id for the same clnt
			// how to get session data ?
			Voter v = (Voter) hs.getAttribute("voter_details");
			if (v != null) {
				pw.print("<h5> Hello ,  " + v.getName() + "</h5>");
				//get book dao instance from session
				CandidateDaoReg candidateDao=(CandidateDaoReg) hs.getAttribute("candidate_dao");
				//invoke dao's method : to get all categories
				List<String> candidates=candidateDao.fetchAllCandidates();
				pw.print("<h5>");
				pw.print("<form action='candidates_details'>");
				//drop down list
				pw.print("Choose a Category : <select name='chosen_category'>");
				for(String s : candidates)
					pw.print("<option value="+s+">"+s+"</option>");
				pw.print("</select>");
				//submit btn 
				pw.print("<br><input type='submit' value='Choose'>");
				pw.print("</form>");
				pw.print("</h5>");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
