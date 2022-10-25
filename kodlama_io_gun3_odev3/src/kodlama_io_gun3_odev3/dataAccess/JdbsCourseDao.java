package kodlama_io_gun3_odev3.dataAccess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.entity.Course;

public class JdbsCourseDao implements BaseCourseDao {
	private ArrayList<Course> courseList = new ArrayList<>();

	@Override
	public void add(Course course) {
		courseList.add(course);
		System.out.println("jdbs ile eklendi :" + course.getName());

	}

	@Override
	public void delete(Course course) {
		courseList.remove(course);
	}

	@Override
	public ArrayList<Course> getAll() {

		return courseList;
	}

}
