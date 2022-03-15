package p2;

import java.util.Scanner;

public class DemoOddCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String word1 = scanner.next();
		String word2 = scanner.next();
		String newWord = word1 + " " + word2;
		
		for(int i = 1; i < newWord.length(); i = i + 2) {
			System.out.print(newWord.charAt(i) + ", ");
		}
	}

}
