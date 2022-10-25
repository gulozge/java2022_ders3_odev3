package kodlama_io_gun3_odev3.dataAccess;

import java.util.ArrayList;

import kodlama_io_gun3_odev3.entity.Teacher;

public class HibernateTeacherDao implements BaseTeacherDao{
	 	private ArrayList<Teacher> teacherList = new ArrayList<>();

	@Override
	public void add(Teacher teacher) {
		teacherList.add(teacher);
		System.out.println("hibernat ile eklendi     " + teacher.getFirstName() +"   " + teacher.getLastName());
		
	}

	@Override
	public void delete(Teacher teacher) {
		teacherList.remove(teacher);
		
	}

	@Override
	public ArrayList<Teacher> getAll() {
		// TODO Auto-generated method stub
		return teacherList;
	}

}
