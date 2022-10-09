package kodlamaIo.entities;

import kodlamaIo.abstracts.entities.IEntity;

public class Educator implements IEntity {
	private String id;
	private String EducatorName;
	private String EducatorSurname;

	public Educator() {
		super();
	}

	public Educator(String id, String educatorName, String educatorSurname) {
		super();
		this.id = id;
		EducatorName = educatorName;
		EducatorSurname = educatorSurname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEducatorName() {
		return EducatorName;
	}

	public void setEducatorName(String educatorName) {
		EducatorName = educatorName;
	}

	public String getEducatorSurname() {
		return EducatorSurname;
	}

	public void setEducatorSurname(String educatorSurname) {
		EducatorSurname = educatorSurname;
	}

}
