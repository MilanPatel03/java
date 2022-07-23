package model;

// Generated 13 Jul, 2022 2:47:01 PM by Hibernate Tools 3.4.0.CR1

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private Integer id;
	private String dname;
	private String description;

	public Department() {
	}

	public Department(String dname, String description) {
		this.dname = dname;
		this.description = description;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}