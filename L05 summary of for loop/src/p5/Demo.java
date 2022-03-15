package p5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a full name: ");
		String firstName = scanner.next();
		String lastName = scanner.next();
		
		String mergedName = "";
		for(int i = 0; i < firstName.length(); i++) {
			mergedName = mergedName + firstName.charAt(i) + lastName.charAt(i);
		}
		System.out.println("The merged name: " + mergedName);
	}

}
