package p1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
//		System.out.printf("%-20s%10d%10.2f%n", "Hello World!", 100, 150.5555);
//		System.out.printf("%-20s%10d%10.2f%n", "Bye World!", 50, 10.1234555);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		System.out.println("Hi " + name + ", you're " + age + " years old.");
		
	}

}
