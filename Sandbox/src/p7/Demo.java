package p7;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo {
	private static int count = 0;

	public static void main(String[] args) {
		TreeSet<MainLink> theSet = new TreeSet<>();
		String[] arr = getLyricsArray();
		learn(theSet, arr);
		show(theSet);
		String paragraph = make(theSet, "how", 20);
		System.out.println(paragraph);
	}

	public static String make(TreeSet<MainLink> theSet, String firstWord, int number) {
		String paragraph = firstWord;
		String word = firstWord;
		for (int i = 0; i < number - 1; i++) {
			Iterator<MainLink> itr = theSet.iterator();
			while (itr.hasNext()) {
				MainLink mainLink = itr.next();
				if (mainLink.getWord().equals(word)) {
					int randomNextWordIndex = (int) (Math.random() * mainLink.getBabyList().size());
					String nextWord = mainLink.getBabyList().get(randomNextWordIndex);
					paragraph += " " + nextWord;
					word = nextWord;
					break;
				}
			}
		}
		return paragraph;
	}

	public static void show(TreeSet<MainLink> theSet) {
		Iterator<MainLink> itr = theSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void learn(TreeSet<MainLink> theSet, String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			String word = arr[i];

			if (!theSet.contains(new MainLink(word))) {
				theSet.add(new MainLink(word));
			}
			Iterator<MainLink> itr = theSet.iterator();
			while (itr.hasNext()) {
				MainLink mainLink = itr.next();
				if (mainLink.compareTo(new MainLink(word)) == 0) {
					mainLink.getBabyList().add(arr[i + 1]);
				}
			}
		}
	}

	public static String[] getLyricsArray() {
		String lyrics = "how many roads must a man walk down before you call him a man how many "
				+ "seas must a white dove sail before she sleeps in the sand yes and how many times "
				+ "must the cannon balls fly before they're forever banned the answer my friend is "
				+ "blowing in the wind the answer is blowing in the wind yes and how many years can "
				+ "a mountain exist before it is washed to the sea yes and how many years can some "
				+ "people exist before they're allowed to be free yes and how many times can a man "
				+ "turn his head and pretend that he just doesn't see the answer my friend is blowing "
				+ "in the wind the answer is blowing in the wind yes and how many times must a man "
				+ "look up before he can see the sky yes and how many ears must one man have before "
				+ "he can hear people cry yes and how many deaths will it take 'till he knows that "
				+ "too many people have died the answer my friend is blowing in the wind the answer "
				+ "is blowing in the wind";
		String[] a = lyrics.split(" ");
		return a;
	}

}
