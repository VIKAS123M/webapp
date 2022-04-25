package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 *S
 */
public class Thirdservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Thirdservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			User u = (User) session.getAttribute("user");
			u.setTeacher(request.getParameter("Teacher"));
			u.setTeacsub(request.getParameter("Teacsub"));
			
			PrintWriter out = response.getWriter();
			out.println(" Hello "+ u.getEmail());
			out.println("Details "+ u );
			out.println(" Session Id is "+ session.getId());
			out.println("Session created at "+ session.getCreationTime());
			session.invalidate();
		}

}
}
