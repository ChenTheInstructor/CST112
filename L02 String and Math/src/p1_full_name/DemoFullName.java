package p1_full_name;

import java.util.Scanner;

public class DemoFullName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a full name with a middle name: ");
		String fullName = scanner.nextLine();
		int firstSpace = fullName.indexOf(" ");
		String firstName = fullName.substring(0, firstSpace);
		String middleLastNames = fullName.substring(firstSpace+1);
		
		int secondSpace = middleLastNames.indexOf(" ");
		String middleName = middleLastNames.substring(0, secondSpace);
		String lastName = middleLastNames.substring(secondSpace+1);
		
//		System.out.println(firstName +" " + middleName.charAt(0) + ". " + lastName);
//		
		
		firstName = firstName.toUpperCase().charAt(0) + firstName.toLowerCase().substring(1);
		char midInitial = middleName.toUpperCase().charAt(0);
		lastName = lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1);
		
		System.out.println(firstName + " " + midInitial + ". " + lastName);
	}

}
