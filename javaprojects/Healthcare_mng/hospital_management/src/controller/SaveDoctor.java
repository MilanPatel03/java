package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Doctor;

/**
 * Servlet implementation class SaveDoctor
 */
@WebServlet("/SaveDoctor")
public class SaveDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveDoctor() {
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
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		Long contact= Long.parseLong(request.getParameter("phonenumber"));
		String birthdate = request.getParameter("birthdate");
		String address = request.getParameter("address");
		
		Doctor doc = new Doctor();
		
		doc.setFname(fname);
		doc.setLname(lname);
		doc.setEmail(email);
		doc.setPassword(password);
		doc.setGender(gender);
		doc.setPhone(contact);
		doc.setDob(birthdate);
		doc.setAddress(address);
		
		Dao d = new Dao();
		
		d.addDoctor(doc);
		
		response.sendRedirect("addDoctor.jsp");
	}

}
