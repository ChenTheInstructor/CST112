package p1;

public class Demo1 {

	public static void main(String[] args) {
//		show();
//		int sum = add(5, 10);
//		System.out.println("The sum is " + sum);
//		System.out.println("The difference is: " + subtract(10, 20));
//		greetings("Daniel", 10);
		String greetings = simpleGreetings("Daniel");
		System.out.println(greetings);
		
	}
	
	public static void show() {
		System.out.println("Hi");
		System.out.println("Bye");
		System.out.println("Hi again!");
	}
	
	public static int add(int n1, int n2) {
		return (n1 + n2);
	}
	
	public static int subtract(int n1, int n2) {
		return n1 - n2;
	}
	
	public static void greetings(String name, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("Hi " + name + "!");
		}
	}
	
	public static String simpleGreetings(String name) {
		return "Hi " + name + "!";
	}

}
