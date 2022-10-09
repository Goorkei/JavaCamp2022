package kodlamaIo.abstracts.business;

import kodlamaIo.entities.Educator;

public interface IEducatorService {
	void add(Educator educator);

	void delete(Educator educator);

	void update(Educator educator);

	void list(Educator educator);
}
