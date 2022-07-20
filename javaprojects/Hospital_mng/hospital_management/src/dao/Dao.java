package dao;

import java.util.List;

import model.Appointment;
import model.Department;
import model.Doctor;
import model.DoctorSchedule;
import model.Patient;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Dao {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	
	public void addPatient(Patient p){
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		
	}
	
	
public void addAppointment(Appointment a){
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(a);
		tx.commit();
		session.close();
		
	}

public void addSchedule(DoctorSchedule s){
	
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	session.save(s);
	tx.commit();
	session.close();
	
}

public void addDepartment(Department de){
	
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	session.save(de);
	tx.commit();
	session.close();
	
}
public void addDoctor(Doctor doc){
	
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	session.save(doc);
	tx.commit();
	session.close();
	
}


// method for get doctor by name
public Doctor getDoctorByName(String doctor) {

	Session session = factory.openSession();
	Criteria cr = session.createCriteria(Doctor.class);
	cr.add(Restrictions.eq("fname", doctor));
	Doctor c = (Doctor) cr.uniqueResult();

	return c;
}

// get all doctor

public List<Doctor> viewDoctor() {

	Session session = factory.openSession();
	Criteria cr = session.createCriteria(Doctor.class);
	List<Doctor> list = cr.list();
	return list;
}


public List<Patient> viewPatient() {

	Session session = factory.openSession();
	Criteria cr = session.createCriteria(Patient.class);
	List<Patient> list = cr.list();
	return list;
}

public List<Appointment> viewAppointment() {

	Session session = factory.openSession();
	Criteria cr = session.createCriteria(Appointment.class);
	List<Appointment> list = cr.list();
	return list;
}

public List<Department> viewDepartment() {

	Session session = factory.openSession();
	Criteria cr = session.createCriteria(Department.class);
	List<Department> list = cr.list();
	return list;
}

}
