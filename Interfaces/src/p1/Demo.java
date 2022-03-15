package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Person s1 = new Student("A", "AA", 3.6);
		Person s2 = new Student("B", "BB", 4.0);
		Person i1 = new Instructor("C", "CC", "Professor");
		Person i2 = new Instructor("D", "DD", "Lecturer");

		PersonBag theBag = new PersonBag(10);
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(i1);
		theBag.insert(i2);

		Person[] arr1 = theBag.search(new GpaAnalyzable() {

			@Override
			public Student analyzeGpa(Student student) {
				Student temp = null;
				if (student.getGpa() >= 3.5) {
					temp = student;
				} 
				return temp;
			}
		});
		
		Person[] arr2 = theBag.search((Instructor instructor) -> {
			Instructor temp = null;
			if (instructor.getRank().equals("Professor")) {
				temp = instructor;
			} 
			return temp;
		});
		
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		System.out.println(theBag.getHighestID());
	}

}
