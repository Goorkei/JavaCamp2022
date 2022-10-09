package kodlamaIo.dataAccess.jdbc;

import kodlamaIo.abstracts.dataAccess.ICategoryDao;
import kodlamaIo.entities.Category;

public class CategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " JDBC ile veri tabanına eklendi.");
	}

}
