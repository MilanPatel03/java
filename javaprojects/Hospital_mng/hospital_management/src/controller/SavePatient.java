package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Patient;

/**
 * Servlet implementation class SavePatient
 */
@WebServlet("/SavePatient")
public class SavePatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SavePatient() {
        super();
        // TODO Auto-generated constructor stub
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
		
		Patient p = new Patient();
		
		p.setFname(fname);
		p.setLname(lname);
		p.setEmail(email);
		p.setPassword(password);
		p.setGender(gender);
		p.setAddress(address);
		p.setDob(birthdate);
		p.setPhone(contact);
		
		Dao d = new Dao();
		
		d.addPatient(p);
		
		response.sendRedirect("addPatient.jsp");
		
	}

}
