package model;

// Generated 13 Jul, 2022 2:47:01 PM by Hibernate Tools 3.4.0.CR1

/**
 * Facility generated by hbm2java
 */
public class Facility implements java.io.Serializable {

	private Integer id;
	private String imgName;
	private Integer image;

	public Facility() {
	}

	public Facility(String imgName, Integer image) {
		this.imgName = imgName;
		this.image = image;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImgName() {
		return this.imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public Integer getImage() {
		return this.image;
	}

	public void setImage(Integer image) {
		this.image = image;
	}

}
