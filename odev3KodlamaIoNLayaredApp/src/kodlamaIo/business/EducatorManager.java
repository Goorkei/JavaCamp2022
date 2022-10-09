package kodlamaIo.business;

import kodlamaIo.abstracts.business.IEducatorService;
import kodlamaIo.abstracts.core.logging.ILogger;
import kodlamaIo.dataAccess.hibernate.EducatorDao;
import kodlamaIo.entities.Educator;

public class EducatorManager implements IEducatorService {

	private EducatorDao educatorDao;
	private ILogger[] loggers;

	public EducatorManager(EducatorDao educatorDao) {
		this.educatorDao = educatorDao;
	}

	public EducatorManager(EducatorDao educatorDao, ILogger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Educator educator) {
		educatorDao.add(educator);
		for(ILogger log:loggers) {
			log.log(educator.getEducatorName());
		}
	}

	@Override
	public void delete(Educator educator) {
	}

	@Override
	public void update(Educator educator) {
	}

	@Override
	public void list(Educator educator) {
	}

}
