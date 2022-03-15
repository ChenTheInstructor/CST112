package p3;

import java.util.Scanner;

public class DemoWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scanner.nextLine();
		
		for (int j = 0; j < word.length(); j++) {
			System.out.print(word.charAt(j) + ", ");
		}
		
	}

}
