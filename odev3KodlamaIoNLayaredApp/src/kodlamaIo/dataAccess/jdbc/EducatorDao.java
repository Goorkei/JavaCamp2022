package kodlamaIo.dataAccess.jdbc;

import kodlamaIo.abstracts.dataAccess.IEducatorDao;
import kodlamaIo.entities.Educator;

public class EducatorDao implements IEducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println(educator.getEducatorName() + " sJDBC ile veri tabanına eklendi.");
	}

}
