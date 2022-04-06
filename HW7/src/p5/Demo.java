package p5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int largest = -2100000;
		int smallest = 2100000;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter an integer or 0 to end: ");
			int n = scanner.nextInt();
			if(n == 0) {
				break;
			} else {
				if(n > largest) {
					largest = n;
				} 
				
				if(n < smallest) {
					smallest = n;
				}
			}
		}
		System.out.println("The largest number entered is: " + largest);
		System.out.println("The smallest number entered is: " + smallest);
	}

}
