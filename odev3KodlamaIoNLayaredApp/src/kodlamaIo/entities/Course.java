package kodlamaIo.entities;

import kodlamaIo.abstracts.entities.IEntity;

public class Course implements IEntity {
	private String id;
	private String courseName;
	private int unitPrice;

	public Course() {
		super();
	}

	public Course(String id, String courseName, int unitPrice) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}
