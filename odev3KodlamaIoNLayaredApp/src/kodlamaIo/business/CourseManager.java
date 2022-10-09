package kodlamaIo.business;

import java.util.List;

import kodlamaIo.abstracts.business.ICourseService;
import kodlamaIo.abstracts.core.logging.ILogger;
import kodlamaIo.abstracts.dataAccess.ICategoryDao;
import kodlamaIo.abstracts.dataAccess.ICourseDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;

public class CourseManager implements ICourseService {

	private Course[] course;
	private ICourseDao courseDao;
	private ILogger[] loggers;

	public CourseManager(ICourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;

	}

	public void add(Course[] course) {

		for (int i = 0; i < course.length; i++) {

			if (course[i].getUnitPrice() > 0) {
				for (int j = 0; j < course.length; j++) {
					if (course[i].getCourseName().equals(course[j].getCourseName()) && i != j) {
						System.out.println("Kategoriler aynı isimle olamaz");
						System.out.println("Kayıt gerçekleşmedi.");

						if (loggers != null) {
							for (ILogger log : loggers) {
								log.log("Kategori");
							}
						}

						return;
					}
				}
			}else {
				System.out.println("Ürün fiyatı 0dan küçük olamaz");
				System.out.println("Kayıt gerçekleşmedi.");

				if (loggers != null) {
					for (ILogger log : loggers) {
						log.log("Kategori");
					}
				}

				return;
			}
		}
		
		
		
		
		for (Course item : course) {
			courseDao.add(item);
		}

		if (loggers != null) {
			for (ILogger log : loggers) {
				log.log("Kategori");
			}
		}

	}

	@Override
	public void delete(Course course) {
	}

	@Override
	public void update(Course course) {
	}

	@Override
	public void list(Course course) {
	}

}
