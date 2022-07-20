package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Appointment;

/**
 * Servlet implementation class SaveAppointment
 */
@WebServlet("/SaveAppointment")
public class SaveAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveAppointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String email = request.getParameter("email");
		Long contact= Long.parseLong(request.getParameter("phonenumber"));
		String message = request.getParameter("message");
		
		
		Appointment a = new Appointment();
		
		a.setFname(fname);
		a.setLname(lname);
		a.setDate(date);
		a.setTime(time);
		a.setEmail(email);
		a.setPhone(contact);
		a.setMessage(message);
		
		Dao d = new Dao();
		
		d.addAppointment(a);
		
		response.sendRedirect("addAppointment.jsp");
	}

}
