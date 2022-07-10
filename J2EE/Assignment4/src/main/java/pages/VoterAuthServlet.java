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


import dao.VoterDaoImp;

import utils.DBUtils;
/**
 * Servlet implementation class VoterAuthServlet
 */
@WebServlet(urlPatterns ="/voter_validate",loadOnStartup = 1)
public class VoterAuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private VoterDaoImp voterDao;
	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {

		try {
			System.out.println("in init of "+getClass().getName());
			//instantiate dao ---getConn ---establish db conn
			voterDao=new VoterDaoImp();
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
				response.sendRedirect("voterData");
				//pw.print("<h5> Voters Detail "+voter+"</h5>"); 
				//To show voter detail directly....
		}
			
		}catch (Exception e) {
			throw new ServletException("err in do-post of "+getClass().getName(),e);
		}
	}

}
