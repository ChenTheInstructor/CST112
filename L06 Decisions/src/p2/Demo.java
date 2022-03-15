package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("They are the same!");
		} else {
			System.out.println("They are different!");
		}
	}

}
