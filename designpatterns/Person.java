package designpatterns;

public class Person {
	
	public int id;
	public String gender;
	
	public Person(int id, String gender) {
		super();
		this.id = id;
		this.gender = gender;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", gender=" + gender + "]";
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
