package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(urlPatterns="/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in init "+Thread.currentThread());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in destroy "+Thread.currentThread());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("in do-get "+Thread.currentThread());
	response.setContentType("text/html");
	try(PrintWriter pw=response.getWriter()){
		pw.print("<h4> Welcome to servelts !!! @ "+LocalDateTime.now()+"</h4>");
	}
	}

}
