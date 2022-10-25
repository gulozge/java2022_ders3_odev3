package kodlama_io_gun3_odev3.dataAccess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.entity.Category;

public interface BaseCategoryDao {
	public void add(Category category);

	public void delete(Category category);

	public ArrayList<Category> getAll();

}
