
public class IronMan {
	private String name;
	private int age;
	private static IronMan ironMan = new IronMan("akira", 20);
	
	private IronMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public static IronMan getIronMan() {
		return ironMan;
	}
	
	
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
