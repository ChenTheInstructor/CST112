package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String word = getWord();
		int numberVowels = getNumberVowels(word);
		int numberConsonants = word.length() - numberVowels;
		display(numberVowels, numberConsonants);
	}

	public static int getNumberVowels(String word) {
		int numberVowels = 0;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (isVowel(c)) {
				numberVowels++;
			}
		}
		return numberVowels;
	}

	public static boolean isVowel(char c) {
		return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y';
	}

	public static void display(int x, int y) {
		System.out.println("Vowels: " + x + "\t" + "Consonants: " + y);
	}

	public static String getWord() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		return scanner.nextLine().toUpperCase();
	}

}
