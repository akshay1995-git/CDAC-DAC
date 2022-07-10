package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
//@WebServlet("/test_input")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter()){
			pw.print("<h5>Hello :"+request.getParameter("f1")+"</h5>");
			pw.print("<h5>Hello : "+request.getParameterValues("clr")+"</h5>");
			pw.print("<h5>Browser :"+request.getParameter("browser")+"</h5>");
			pw.print("<h5>City : "+request.getParameter("myselect")+"</h5>");
			pw.print("<h5>Description "+request.getParameter("info")+"</h5>");
			
		}
	}

}
