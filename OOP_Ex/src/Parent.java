
public class Parent {

	public String name;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("p1");
	}
	
	public Parent(String name) {
		this.name = name;
		System.out.println("p2");
	}
	
	public void p() {
		System.out.println("pm");
	}

}
