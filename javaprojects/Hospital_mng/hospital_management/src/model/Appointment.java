package model;

// Generated 13 Jul, 2022 2:47:01 PM by Hibernate Tools 3.4.0.CR1

/**
 * Appointment generated by hbm2java
 */
public class Appointment implements java.io.Serializable {

	private Integer id;
	private String fname;
	private String lname;
	private String date;
	private String time;
	private String email;
	private Long phone;
	private String message;

	public Appointment() {
	}

	public Appointment(String fname, String lname, String date, String time, String email, Long phone, String message) {
		this.fname = fname;
		this.lname = lname;
		this.date = date;
		this.time = time;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return this.phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}