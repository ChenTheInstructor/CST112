package p3_nested_loops;

public class Demo_Nested_Loops {

	public static void main(String[] args) {
		for (int j = 10; j > 0; j--) {
			
			for (int i = 1; i <= j; i++) {
				System.out.printf("%1s", ("*"));
			}
			System.out.println();
		}
	}

}
