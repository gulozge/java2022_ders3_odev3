package kodlama_io_gun3_odev3.entity;

public class Teacher {
	private int id;
	private String firstName;
	private String lastName;
	private String detail;

	public Teacher(int id, String firstName, String lastName, String detail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.detail = detail;
	}

	private Teacher() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
