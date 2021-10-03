
public class Person implements Comparable<Person>{
	
	public final String name;
	public final int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ": " + age + "¼¼";
	}
	
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}

}
