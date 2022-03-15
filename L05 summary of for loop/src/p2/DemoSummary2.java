package p2;

public class DemoSummary2 {

	public static void main(String[] args) {
		String sentence = "Hi, hOw ARe yOu?";
		int n = sentence.length();
		System.out.println(n);
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.toUpperCase());
		int commaLocation = sentence.indexOf(",");
		System.out.println(commaLocation);
		System.out.println(sentence.substring(0, commaLocation));
		String secondPart = sentence.substring(commaLocation +2);
		String result = secondPart.substring(0,1).toUpperCase() 
				+ secondPart.substring(1).toLowerCase();
		System.out.println(result);
	}

}
