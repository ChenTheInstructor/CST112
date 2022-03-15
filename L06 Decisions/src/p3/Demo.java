package p3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String firstName = scanner.next();
		String lastName = scanner.next();
		
		String fi = firstName.substring(0,1);
		String li = lastName.substring(0,1);
		
		
		if(fi.compareToIgnoreCase(li) < 0 ) {
			System.out.println("First initial is smaller");
		} else if(fi.compareToIgnoreCase(li) == 0) {
			System.out.println("The two initials are the same");
		} else {
			System.out.println("First initial is bigger!");
		}
	}

}
