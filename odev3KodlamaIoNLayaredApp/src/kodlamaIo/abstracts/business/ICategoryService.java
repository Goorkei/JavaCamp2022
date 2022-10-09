package kodlamaIo.abstracts.business;

import kodlamaIo.entities.Category;

public interface ICategoryService {
	void add(Category[] category);

	void delete(Category category);

	void update(Category category);

	void list(Category category);

}
