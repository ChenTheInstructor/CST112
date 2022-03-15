package p1;

import java.util.Scanner;

public class DemoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter two whole numbers: ");
		int large = scanner.nextInt();
		int small = scanner.nextInt();
		
		int total = 0;
//		for(int i = small + 1; i < large; i++) {
//			total = total + i;
//		}
		
		for(int i = large-1; i > small; i--) {
			total += i;
//			total = total + i;
		}
		System.out.println("The total is " + total);

	}

}
