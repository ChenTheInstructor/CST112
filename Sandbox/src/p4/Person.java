package p4;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	
	private static int idCount = 0;

	public Person(String name) {
		super();
		this.name = name;
		this.id = String.valueOf(idCount++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public static void setIdCount(int idCount) {
		Person.idCount = idCount;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
