package kodlama_io_gun3_odev3.busniess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.core.logging.Logger;
import kodlama_io_gun3_odev3.dataAccess.BaseCategoryDao;
import kodlama_io_gun3_odev3.entity.Category;

public class CategoryManager {
	private BaseCategoryDao baseCategoryDao;
	private Logger[] loggers;

	public CategoryManager(BaseCategoryDao baseCategoryDao, Logger[] loggers) {
		super();
		this.baseCategoryDao = baseCategoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) {

		for (Category category1 : baseCategoryDao.getAll()) {
			if (category1.getName().equals(category.getName())) {
				System.out.println("kategöri issmi tekrar edemez");
				return;
			}
		}
		baseCategoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	public void delete(Category category) {
		baseCategoryDao.delete(category);
	}

	public ArrayList<Category> getAll() {
		return baseCategoryDao.getAll();

	}
}
