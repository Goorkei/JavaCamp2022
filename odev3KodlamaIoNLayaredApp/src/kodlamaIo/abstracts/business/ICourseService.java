package kodlamaIo.abstracts.business;

import kodlamaIo.entities.Course;

public interface ICourseService {
	void add(Course[] course);

	void delete(Course course);

	void update(Course course);

	void list(Course course);
}
