package p2_rock_paper_scissors;

import java.util.Random;
import java.util.Scanner;

public class DemoRockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int win = 0;
		int loss = 0;
		int tie = 0;

		while (true) {
			int n = 1 + random.nextInt(3);
			System.out.println("Rock: 1; \nPaper: 2; \nScissors: 3");
			System.out.println("Enter your choice: ");
			int reply = scanner.nextInt();
			if (n == reply) {
				System.out.println("Tie");
				tie++;
			} else if (n == 1 & reply == 2 || n == 3 && reply == 1 || n == 2 && reply == 3) {
				System.out.println("You won!");
				win++;
			} else {
				if (random.nextInt(2) == 0) {
					continue;
				}
				System.out.println("You lost!");
				loss++;
			}

			System.out.println("Play again?");
			scanner.nextLine();
			char answer = scanner.nextLine().toLowerCase().charAt(0);
			if (answer != 'y') {
				System.out.println();
				break;
			}
		}

		System.out.println("Your score: \nWin: " + win + "\nLoss: " + loss + "\nTie: " + tie);
	}

}
