package kodlamaIo;

import kodlamaIo.abstracts.core.logging.ILogger;
import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.EducatorManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.dataAccess.hibernate.CategoryDao;
import kodlamaIo.dataAccess.hibernate.CourseDao;
import kodlamaIo.dataAccess.hibernate.EducatorDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Educator;

public class Main {

	public static void main(String[] args) {

		ILogger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		/*
		  Category category1 = new Category(); category1.setId("1");
		  category1.setCategoryName("Siparişlerim");
		  
		  Category category2 = new Category(); category2.setId("2");
		  category2.setCategoryName("Siparişleri");
		  
		  Category[] category = { category1, category2 };
		  
		  CategoryManager categoryManager = new CategoryManager(new
		  CategoryDao(),loggers); categoryManager.add(category);
		  */
		  //-------------------------------------------------------------
		  
		  Course course1 = new Course(); course1.setId("1");
		  course1.setCourseName("Java Kursu");
		  course1.setUnitPrice(-10);
		  
		  Course course2 = new Course(); course2.setId("1");
		  course2.setCourseName("C# Kursu");
		  course2.setUnitPrice(10);
		  
		  Course[] course = { course1, course2 }; CourseManager courseManager = new
		  CourseManager(new CourseDao(),loggers); courseManager.add(course);
		  
			/*
			 * 
			 * Educator educator1 = new Educator(); educator1.setId("1");
			 * educator1.setEducatorName("Görkem"); educator1.setEducatorSurname("Arslan");
			 * 
			 * EducatorManager educatorManager = new EducatorManager(new EducatorDao(),
			 * loggers); educatorManager.add(educator1);
			 */
	}

}
