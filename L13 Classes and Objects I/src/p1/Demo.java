package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Jose", 3.5, 20, "IT", "516-987-1234");
		Student s2 = new Student("Hernandez", 4.0, 21, "HIS", "631-123-4567");
		s2.setName("Damien");
		s1.setGpa(3.6);
		s1.setAge(21);
		s2.setMajor("ENG");
		s2.setGpa(3.0);
		
		Student[] arr = {s1, s2};
		for(int i  = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		String format = "%-10S%5.2f%5d%7S%15s%n";
//		System.out.printf("%-10S%5S%5S%7S%15S%n", "NAME", "gpa", "Age", "major", "Phone");
//		System.out.printf(format, s1.getName(), s1.getGpa(), s1.getAge(), s1.getMajor(), s1.getPhone());
//		System.out.printf(format, s2.getName(), s2.getGpa(), s2.getAge(), s2.getMajor(), s2.getPhone());
//		System.out.println(s1);
//		System.out.println(s2);
	}

}
