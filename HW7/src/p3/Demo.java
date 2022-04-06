package p3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String str = getString();
		displayReverse(str);
	}

	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		return scanner.nextLine().toUpperCase();
	}

	public static void displayReverse(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");
		}
	}

}
