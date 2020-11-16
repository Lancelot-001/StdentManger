
public class Student {
	private String name;
	private String address;
	private String age;
	private String number;

	public void student() {
	}

	public void student(String number, String name, String age, String address) {
		this.number = number;
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

}
