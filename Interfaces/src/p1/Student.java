package p1;

public class Student extends Person {
	private double gpa;

	public Student(String firstName, String lastName, double gpa) {
		super(firstName, lastName);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", gpa=" + gpa + "]";
	}

}
