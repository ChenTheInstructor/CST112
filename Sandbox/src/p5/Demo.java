package p5;

import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 3.5);
		Student s3 = new Student("B", 1.0);
		Student s2 = new Student("Z", 4.0);
		Student s4 = new Student("C", 1.0);
		
		PQueue pq = new PQueue(10);
		pq.insert(s1);
		pq.insert(s2);
		pq.insert(s3);
		pq.insert(s4);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
		
//		PriorityQueue<Student> pq = new PriorityQueue<>();
	}

}
