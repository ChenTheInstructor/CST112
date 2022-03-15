package p5;

import java.util.Scanner;

public class DemoSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter two whole numbers: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		int total = 0;
		for(int i = n1; i <= n2; i++) {
			total = total + i;
		}
		System.out.println("The total is " + total);
	}

}
