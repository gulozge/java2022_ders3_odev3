package kodlama_io_gun3_odev3.busniess;

import kodlama_io_gun3_odev3.core.logging.Logger;
import kodlama_io_gun3_odev3.dataAccess.BaseCourseDao;
import kodlama_io_gun3_odev3.entity.Course;

public class CourseManager {
	private BaseCourseDao courseBaseDao;
	private Logger[] loggers;

	public CourseManager(BaseCourseDao courseBaseDao, Logger[] loggers) {
		this.courseBaseDao = courseBaseDao;
		this.loggers = loggers;
	}

	public void add(Course course) {
		for (Course course1 : courseBaseDao.getAll()) {
			if (course.getName().equals(course1.getName())) {
				System.out.println("aynı isim verilemez");
				return;
			}
		}
		if (course.getPrice() <= 0) {
			System.out.println("kurs fiyatı 0 tl ve altı olamaz");
			return;
		}
		courseBaseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
