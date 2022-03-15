package p4;

import java.util.Scanner;

public class DemoWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scanner.nextLine();
		
		for (int j = word.length()-1; j >= 0; j--) {
			System.out.print(word.charAt(j) + ", ");
		}
		
	}

}
