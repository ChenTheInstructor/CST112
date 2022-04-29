package p6;

import p5.Student;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 3.5);
		Student s2 = new Student("Z", 4.0);
		Student s3 = new Student("B", 1.0);
		Student s4 = new Student("C", 1.0);
		
		Student[] a = {s1, s2, s3, s4};
		
		recShow(a, 0, 3);
	}
	
	public static <T> void recShow(T[] a, int start, int end) {
		if(start > end) {
			return;
		} 
		
		System.out.println(a[start]);
		recShow(a, start+1, end);
	}

}
