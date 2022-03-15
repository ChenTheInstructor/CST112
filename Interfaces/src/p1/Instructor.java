package p1;

public class Instructor extends Person {
	private String rank;

	public Instructor(String firstName, String lastName, String rank) {
		super(firstName, lastName);
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Instructor [" + super.toString() + ", rank=" + rank + "]";
	}

	
}
