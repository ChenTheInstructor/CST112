package p4;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;

		Random random = new Random();

		for (int i = 0; i < 1000000; i++) {
			int n = random.nextInt(2);
			if (n == 0) {
				heads++;
			} else {
				tails++;
			}
		}

		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + tails);

	}

}
