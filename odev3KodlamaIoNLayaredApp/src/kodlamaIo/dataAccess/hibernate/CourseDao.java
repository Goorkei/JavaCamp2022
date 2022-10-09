package kodlamaIo.dataAccess.hibernate;

import kodlamaIo.abstracts.dataAccess.ICourseDao;
import kodlamaIo.entities.Course;

public class CourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() + " Hibernate ile veri tabanına eklendi.");
	}

}
