package kodlamaIo.dataAccess.hibernate;

import kodlamaIo.abstracts.dataAccess.IEducatorDao;
import kodlamaIo.entities.Educator;

public class EducatorDao implements IEducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println(educator.getEducatorName() + " Hibernate ile veri tabanına eklendi.");
	}

}
