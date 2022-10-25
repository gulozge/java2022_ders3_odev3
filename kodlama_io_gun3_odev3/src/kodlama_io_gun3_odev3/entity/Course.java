package kodlama_io_gun3_odev3.entity;

public class Course {
	private int id;
	private String name;
	private double price;
	private Teacher teacher;

	public Course(int id, String name, double price, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.teacher = teacher;
	}

	public Course() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
