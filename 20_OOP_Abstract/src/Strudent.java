
public abstract class Strudent {
	String name;
	int age;
	
	
	public Strudent() {
		// TODO Auto-generated constructor stub
	}


	public Strudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	
	abstract void stSignal();
	abstract void fnSignal();
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
	 
	 
}
