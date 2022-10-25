package kodlama_io_gun3_odev3.dataAccess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.entity.Course;

public class HibernateCourseDao implements BaseCourseDao {
	private ArrayList<Course> courseList = new ArrayList<>();

	@Override
	public void add(Course course) {
		courseList .add(course);
		System.out.println("hibernate ile ekleme yapıldı "+ course.getName());
		
	}

	@Override
	public void delete(Course course) {
		courseList .remove(course);
		
	}

	@Override
	public ArrayList<Course> getAll() {
		// TODO Auto-generated method stub
		return courseList ;
	}

}
