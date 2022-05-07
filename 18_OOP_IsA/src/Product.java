
public class Product {
	private String name;
	private int cost;
	
public Product() {
	// TODO Auto-generated constructor stub
}

	
	public Product(String name, int cost) {
	super();
	this.name = name;
	this.cost = cost;
}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void info() {
		System.out.println("---------------------------------------------");
		System.out.println("力前疙: " + name);
		System.out.println("力前啊拜: " + cost);
	}
}
