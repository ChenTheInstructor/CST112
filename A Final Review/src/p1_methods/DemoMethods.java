package p1_methods;

public class DemoMethods {

	public static void main(String[] args) {
		int lines = getNumberOfLines("Hey", "What's up?", 2);
		System.out.println("The total number of lines is " + lines);
	}
	
	public static int getNumberOfLines(String m, String n, int repeats) {
		for(int i = 0; i < repeats; i++) {
			System.out.println(n);
			System.out.println(m);
			
		}
		return repeats * 2;
	}

	public static void showMessage() {
		System.out.println("Hi");
		System.out.println("Bye");
	}

	public static void showMessage(String m, String n) {
		System.out.println(m);
		System.out.println(n);
	}

	public static void showMessage(String m, String n, int repeats) {
		for (int i = 0; i < repeats; i++) {
			System.out.println(m);
			System.out.println(n);
		}
	}
	
	

}
