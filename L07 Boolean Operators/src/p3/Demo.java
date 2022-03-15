package p3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("\nEnter three whole numbers: ");
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int n3 = scanner.nextInt();
			if ((n1 <= n2 && n1 >= n3) || (n1 >= n2 && n1 <= n3)) {
				System.out.println(n1 + " is the medium number.");
			} else if ((n2 <= n1 && n2 >= n3) || (n2 >= n1 && n2 <= n3)) {
				System.out.println(n2 + " is the medium number.");
			} else {
				System.out.println(n3 + " is the medium number.");
			} 
		}
	}

}
