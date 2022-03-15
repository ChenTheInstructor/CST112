package p1_if;

import java.util.Random;
import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		Random random = new Random();
		char flag;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to play? ");
		flag = scanner.nextLine().toLowerCase().charAt(0);

		while (flag == 'y') {
			int n1 = random.nextInt(11);
			int n2 = random.nextInt(11);
			System.out.println(n1 + " + " + n2 + " = ?");
			int answer = scanner.nextInt();
			if (answer == (n1 + n2)) {
				System.out.println("Correct!");
				System.out.println("Play again?");
				scanner.nextLine();
				char reply = scanner.nextLine().toLowerCase().charAt(0);
				if (reply != 'y') {
					break;
				}
			} else {
				while (true) {
					System.out.println("Incorrect!");
					System.out.println(n1 + " + " + n2 + " = ?");
					answer = scanner.nextInt();
					if (answer == (n1 + n2)) {
						System.out.println("Correct this time!");
						System.out.println("Play again?");
						scanner.nextLine();
						char reply = scanner.nextLine().toLowerCase().charAt(0);
						if (reply == 'y') {
							break;
						}
					}
				}
			}
//			break;
		}
		System.out.println("Good game!");
	}

}
