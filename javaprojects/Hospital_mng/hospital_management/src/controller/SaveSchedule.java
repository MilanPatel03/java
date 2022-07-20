package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Doctor;
import model.DoctorSchedule;

/**
 * Servlet implementation class SaveSchedule
 */
@WebServlet("/SaveSchedule")
public class SaveSchedule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveSchedule() {
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
		String did = request.getParameter("did");
		String days = request.getParameter("days");
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		String message = request.getParameter("message");
		String status = request.getParameter("status");
		
		DoctorSchedule s = new DoctorSchedule();
		Dao dao = new Dao();
		
		
		Doctor d=dao.getDoctorByName(did);
		
		s.setDid(d);
		s.setStartTime(starttime);
		s.setEndTime(endtime);
		s.setMessage(message);
		s.setStatus(status);
	}

}
