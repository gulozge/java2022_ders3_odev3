package kodlama_io_gun3_odev3.dataAccess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.entity.Teacher;

public interface BaseTeacherDao {
	public void add(Teacher teacher);

	public void delete(Teacher teacher);

	public ArrayList<Teacher> getAll();

}
