package p1;

import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		System.out.println("Length of str1: " + str1.length());
		System.out.println("Length of str2: " + str2.length());
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		
	}

}
