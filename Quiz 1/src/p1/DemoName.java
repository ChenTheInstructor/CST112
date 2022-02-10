package p1;

import java.util.Scanner;

public class DemoName {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your full name with middle name: ");
		String name = scanner.nextLine();
		
		// process
		int index = name.indexOf(" ");
		String firstName = name.substring(0, index);
		String lastName = name.substring(index+1);
		
		// output 
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("First Initial: " + firstName.charAt(0));
		System.out.println("Last Initial: " + lastName.charAt(0));
	}

}
