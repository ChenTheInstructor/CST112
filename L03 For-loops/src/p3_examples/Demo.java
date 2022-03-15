package p3_examples;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		int len = str.length();
		for (int i = len - 1; i >= 0; i = i - 1) {
			System.out.print(str.charAt(i) + ", ");
		}

	}

}
