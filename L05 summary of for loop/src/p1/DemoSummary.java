package p1;

public class DemoSummary {

	public static void main(String[] args) {
		for (int j = 1; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%5d", (i + j));
			}
			System.out.println();
		}
	}

}
