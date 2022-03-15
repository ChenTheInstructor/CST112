package p4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		
		for(int i = 7; i > 0; i = i - 2) {
			System.out.print(str.charAt(i) + ", ");
		}
		
	}

}
