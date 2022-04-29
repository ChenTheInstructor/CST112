package p1;

public class Student {
	String name;
	double gpa;
	int age;
	String major;
	String phone;

	// constructor: used to create Student objects. It can bring
	// initial data to the Student object
	public Student(String name, double gpa, int age, String major, String phone) {
		this.name = name;
		this.gpa = gpa;
		this.age = age;
		this.major = major;
		this.phone = phone;
	}
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// getter
	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String toString() {
		return name + ": " + gpa + ", " + age + ", " + major + ", " + phone;
	}
	
}
