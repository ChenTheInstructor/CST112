package p1;

public abstract class Person {
	private Name name;
	private String id;
	private static int idCount = 0;

	public Person(String firstName, String lastName) {
		this.name = new Name(firstName, lastName);
		id = String.valueOf(idCount++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
