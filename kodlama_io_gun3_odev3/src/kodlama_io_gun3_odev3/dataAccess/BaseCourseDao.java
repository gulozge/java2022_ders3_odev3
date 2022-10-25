package kodlama_io_gun3_odev3.dataAccess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.entity.Course;

public interface BaseCourseDao {
	public void add(Course course);

	public void delete(Course course);

	public ArrayList<Course> getAll();
}
