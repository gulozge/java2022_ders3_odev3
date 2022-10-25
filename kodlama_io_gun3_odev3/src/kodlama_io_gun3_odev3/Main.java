package kodlama_io_gun3_odev3;

import kodlama_io_gun3_odev3.busniess.CategoryManager;
import kodlama_io_gun3_odev3.busniess.CourseManager;
import kodlama_io_gun3_odev3.busniess.TeacherManager;
import kodlama_io_gun3_odev3.core.logging.DatabaseLogger;
import kodlama_io_gun3_odev3.core.logging.FileLogger;
import kodlama_io_gun3_odev3.core.logging.Logger;
import kodlama_io_gun3_odev3.core.logging.MailLogger;
import kodlama_io_gun3_odev3.dataAccess.BaseTeacherDao;
import kodlama_io_gun3_odev3.dataAccess.HibernateCategoryDao;
import kodlama_io_gun3_odev3.dataAccess.HibernateCourseDao;
import kodlama_io_gun3_odev3.dataAccess.HibernateTeacherDao;
import kodlama_io_gun3_odev3.dataAccess.JdbsCategoryDao;
import kodlama_io_gun3_odev3.dataAccess.JdbsCourseDao;
import kodlama_io_gun3_odev3.dataAccess.JdbsTeacherDao;
import kodlama_io_gun3_odev3.entity.Category;
import kodlama_io_gun3_odev3.entity.Course;
import kodlama_io_gun3_odev3.entity.Teacher;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};
		
		Course course = new Course();
		course.setId(0);
		course.setName("deneme");
		course.setTeacher(new Teacher(0, "engin", "hoca", "java"));
		course.setPrice(100);
		
		Course course2 = new Course();
		course2.setId(0);
		course2.setName("deneme");
		course2.setTeacher(new Teacher(0, "engin", "hoca", "java"));
		course2.setPrice(1000);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course);
		courseManager.add(course2);
		CourseManager courseManager2 = new CourseManager(new JdbsCourseDao(),loggers);
		courseManager2.add(course);
		
		
		
		Teacher teacher = new Teacher(0, "engin", "hoca", "java");
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(),loggers);
		teacherManager.add(teacher);
		TeacherManager teacherManager2 = new TeacherManager(new JdbsTeacherDao(),loggers);
		teacherManager2.add(teacher);
		
		Category category=new Category(1,"yazilim");
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);
		
		CategoryManager categoryManager2=new CategoryManager(new JdbsCategoryDao(),loggers);
		categoryManager2.add(category);
		
	}

}
