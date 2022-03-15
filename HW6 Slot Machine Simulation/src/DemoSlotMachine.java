import java.util.Random;

public class DemoSlotMachine {

	public static void main(String[] args) {
		// generate three random numbers in the range of 0 to 6, inclusive

		// display their corresponding words in a row with a blank line above and blow.
		/*
		 * 0: cherries 1: oranges 2: plums 3: bells 4: melons 5: bars
		 */

		Random random = new Random();
		int n1 = random.nextInt(6);

		String word1;
		if (n1 == 0) {
			word1 = "cherries";
		} else if (n1 == 1) {
			word1 = "oranges";
		} else if (n1 == 2) {
			word1 = "plums";
		} else if (n1 == 3) {
			word1 = "bells";
		} else if (n1 == 4) {
			word1 = "melons";
		} else {
			word1 = "bars";
		}

		int n2 = random.nextInt(6);
		String word2;
		if (n2 == 0) {
			word2 = "cherries";
		} else if (n2 == 1) {
			word2 = "oranges";
		} else if (n2 == 2) {
			word2 = "plums";
		} else if (n2 == 3) {
			word2 = "bells";
		} else if (n2 == 4) {
			word2 = "melons";
		} else {
			word2 = "bars";
		}

		int n3 = random.nextInt(6);
		String word3;
		if (n3 == 0) {
			word3 = "cherries";
		} else if (n3 == 1) {
			word3 = "oranges";
		} else if (n3 == 2) {
			word3 = "plums";
		} else if (n3 == 3) {
			word3 = "bells";
		} else if (n3 == 4) {
			word3 = "melons";
		} else {
			word3 = "bars";
		}
		System.out.printf("%-10S%-10S%-10S%n", word1, word2, word3);
		
		if(word1.equals(word2) && word1.equals(word3) && word2.equals(word3)) {
			System.out.println("Jackpot!");
		}
	}

}
