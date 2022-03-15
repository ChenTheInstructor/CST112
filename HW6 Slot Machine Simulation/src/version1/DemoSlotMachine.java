package version1;

import java.util.Random;
import java.util.Scanner;

public class DemoSlotMachine {

	public static void main(String[] args) {
		// Initialize variables
		double totalAmountEntered = 0.0;
		double totalAmountWon = 0.0;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		while (true) {
			// ask the user to enter the amount to play
			System.out.println("Enter the amount to play: ");
			double amountEntered = scanner.nextDouble();
			totalAmountEntered += amountEntered;
			// Generate three random integers between 0 and 5
			int n1 = random.nextInt(6);
			int n2 = random.nextInt(6);
			int n3 = random.nextInt(6);
			// determine win or lose
			String w1 = "";
			String w2 = "";
			String w3 = "";
			if (n1 != n2 && n1 != n3 && n2 != n3) { // three numbers different
				w1 = getWord(n1);
				w2 = getWord(n2);
				w3 = getWord(n3);
			} else if (n1 == n2 && n1 == n3) { // three numbers same
				w1 = getWord(n1);
				w2 = w1;
				w3 = w1;
				totalAmountWon += (amountEntered * 3);
			} else {  // two numbers same
				totalAmountWon += (amountEntered * 2);
				w1 = getWord(n1);
				w2 = getWord(n2);
				w3 = getWord(n3);
			}

			System.out.printf("%n%-15S%-15S%-15S%n%n", w1, w2, w3);
			System.out.println("Play again? ");
			scanner.nextLine();
			if (scanner.nextLine().toLowerCase().charAt(0) != 'y') {
				break;
			}
		}
		System.out.printf("%13s%5.2f%13s%5.2f%n", "Amount Entered: ", totalAmountEntered, "Amount Won: ",
				totalAmountWon);

	}

	public static String getWord(int n) {
		String w = null;
		if (n == 0) {
			w = "Cherries";
		} else if (n == 1) {
			w = "Oranges";
		} else if (n == 2) {
			w = "Plums";
		} else if (n == 3) {
			w = "Bells";
		} else if (n == 4) {
			w = "Melons";
		} else {
			w = "Bars";
		}

		return w;
	}

}
