package kodlama_io_gun3_odev3.dataAccess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.entity.Category;

public class JdbsCategoryDao implements BaseCategoryDao {
	private ArrayList<Category> categoryList = new ArrayList<Category>();

	@Override
	public void add(Category category) {
		categoryList.add(category);
		System.out.println("jdbs ile ekleme yapıldı" + category.getName());

	}

	@Override
	public void delete(Category category) {
		categoryList.remove(category);

	}

	@Override
	public ArrayList<Category> getAll() {
		return categoryList;
	}

}
