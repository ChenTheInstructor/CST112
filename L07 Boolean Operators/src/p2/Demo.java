package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		char reply = 'y';
		while (reply == 'y') {
			System.out.println("Enter a whole number: ");
			int number = scanner.nextInt();
			total += number;
			scanner.nextLine();
			System.out.println("Continue? (y or n) ");
			reply = scanner.nextLine().toLowerCase().charAt(0);
		}
		System.out.println("The total is: " + total);
	}

}
