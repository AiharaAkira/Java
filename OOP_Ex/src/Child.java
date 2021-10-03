
public class Child extends Parent{
	
	private String name2;
	
	public Child() {
		this("ÇÑ±¹");
		System.out.println("c1");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("c2");
	}
	
	@Override
	public void p() {
		System.out.println("cm");
	}

	
	
}
