package p7;

import java.util.LinkedList;

public class MainLink implements Comparable<MainLink>{
	private String word;
	private LinkedList<String> babyList = new LinkedList<>();
	
	public MainLink(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public LinkedList<String> getBabyList() {
		return babyList;
	}

	public void setBabyList(LinkedList<String> babyList) {
		this.babyList = babyList;
	}

	@Override
	public String toString() {
		return "MainLink [word=" + word + ", babyList=" + babyList + "]";
	}

	@Override
	public int compareTo(MainLink o) {
		return this.word.compareTo(o.word);
	}

}
