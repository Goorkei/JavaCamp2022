package kodlamaIo.entities;

import kodlamaIo.abstracts.entities.IEntity;

public class Category implements IEntity {

	private String id;
	private String categoryName;

	public Category() {
		super();
	}

	public Category(String id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
