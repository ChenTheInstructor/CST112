package p4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String correctUsername = "user1";
		String correctPassword = "pass";

		while (true) {
			System.out.println("\nEnter your username and password:");
			String str1 = scanner.next();
			String str2 = scanner.next();
			
			if(str1.equalsIgnoreCase(correctUsername) && str2.equals(correctPassword)) {
				break;
			} else if (!str1.equalsIgnoreCase(correctUsername) && !str2.equals(correctPassword)) {
				System.out.println("Both are incorrect.");
			} else if (!str1.equalsIgnoreCase(correctUsername)) {
				System.out.println("Username is incorrect.");
			} else {
				System.out.println("Password is incorrect.");
			}
		}
		System.out.println("Have a nice day!");
	}

}
