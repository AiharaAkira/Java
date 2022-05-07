
public class Teacher extends Human{
	
	String subject;
	
	public Teacher(String name, int age,String subject) {
		
		this.name= name;
		this.age= age;
		this.subject = subject;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println(subject);
	}

}
