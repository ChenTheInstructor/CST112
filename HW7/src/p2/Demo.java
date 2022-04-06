package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String str = getString();
		displayOddPositions(str);
	}

	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		return scanner.nextLine().toUpperCase();
	}

	public static void displayOddPositions(String str) {
		for (int i = 0; i < str.length(); i = i + 2) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
