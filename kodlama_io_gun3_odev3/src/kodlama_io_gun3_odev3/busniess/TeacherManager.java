package kodlama_io_gun3_odev3.busniess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.core.logging.Logger;
import kodlama_io_gun3_odev3.dataAccess.BaseTeacherDao;
import kodlama_io_gun3_odev3.entity.Teacher;

public class TeacherManager {
	BaseTeacherDao baseTeacherDao;
	Logger[] loggers;

	public TeacherManager(BaseTeacherDao baseTeacherDao, Logger[] loggers) {
		this.baseTeacherDao = baseTeacherDao;
		this.loggers = loggers;
	}

	public void add(Teacher teacher) {
		baseTeacherDao.add(teacher);
		for (Logger logger : loggers) {
			logger.log(teacher.getFirstName());
		}
	}

	public void delete(Teacher teacher) {
		baseTeacherDao.delete(teacher);
	}

	public ArrayList<Teacher> getAll() {
		return baseTeacherDao.getAll();
	}
}
