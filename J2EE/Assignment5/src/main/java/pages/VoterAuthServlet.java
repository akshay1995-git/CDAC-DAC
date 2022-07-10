package pages;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import pojos.Voter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.CandidateDaoReg;
import dao.VoterDaoImp;

import utils.DBUtils;
/**
 * Servlet implementation class VoterAuthServlet
 */
@WebServlet(urlPatterns ="/voter_validate",loadOnStartup = 1)
public class VoterAuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private VoterDaoImp voterDao;
    private CandidateDaoReg candidateDao;
	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {

		try {
			System.out.println("in init of "+getClass().getName());
			//instantiate dao ---getConn ---establish db conn
			voterDao=new VoterDaoImp();
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
			voterDao.cleanUp();
			candidateDao.cleanUp();
			DBUtils.closeConnection();
			} catch (Exception e) {
			//	System.out.println("err in destroy "+e);
				throw new RuntimeException("err in destory", e);//understanding purpose!!!!
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter())
		{
			//read request params
			String email=request.getParameter("em");
			String password=request.getParameter("pass");
			//invoke dao's method for customer auth.
			List<Voter> voter = voterDao.fetchVoterDetails(email, password);
			if(voter == null) {
				pw.print("<h5>Invalid Login </h5>");
				pw.print("<h5>Please <a href='login.html'>Click Here</a></h5>");
			}
			else {
				// get HttpSession object from WC
				HttpSession session = request.getSession();
				System.out.println("Imple class name " + session.getClass().getName());// imple cls name
				System.out.println("from 1st page HS is new " + session.isNew());// true
				System.out.println("session id " + session.getId());
				// add auth voter details under session
				session.setAttribute("voter_details", voter);
				//add voter dao instance under session scope
				session.setAttribute("voter_dao", voterDao);
				//add candidate  instance under session scope
				session.setAttribute("candidate_dao", candidateDao);
				//create an empty cart n add it under session scope
//				session.setAttribute("shopping_cart",new ArrayList<Integer>());
				// redirect the clnt to the next page (CategoryServlet) in the NEXT request
				// API of HttpServletResponse :
				// public void sendRedirect(String urlPatternOfNextPage)
				response.sendRedirect("voterData");
				
		}
			
		}catch (Exception e) {
			throw new ServletException("err in do-post of "+getClass().getName(),e);
		}
	}

}
