package kodlamaIo.business;

import kodlamaIo.abstracts.business.ICategoryService;
import kodlamaIo.abstracts.core.logging.ILogger;
import kodlamaIo.abstracts.dataAccess.ICategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager implements ICategoryService {

	private Category[] category;
	private ICategoryDao categoryDao;
	private ILogger[] loggers;

	public CategoryManager(ICategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	@Override
	public void add(Category[] category) {
		for (int i = 0; i < category.length; i++) {
			for (int j = 0; j < category.length; j++) {
				if(category[i].getCategoryName().equals(category[j].getCategoryName())&& i!=j) {
					System.out.println("Kategoriler aynı isimle olamaz");
					System.out.println("Kayıt gerçekleşmedi.");
					
					if(loggers != null) {
						for(ILogger log : loggers) {
							log.log("Kategori");
						}
					}
					
					return;
				}
			}
		}
		for(Category item : category) {
			categoryDao.add(item);
		}
		
		if(loggers != null) {
			for(ILogger log : loggers) {
				log.log("Kategori");
			}
		}
		
	}

	@Override
	public void delete(Category category) {
	}

	@Override
	public void update(Category category) {
	}

	@Override
	public void list(Category category) {
	}

}
