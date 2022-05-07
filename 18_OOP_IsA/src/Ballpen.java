
public class Ballpen extends Product{
	
	private String color;
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public Ballpen(String name, int cost, String color) {
		super(name, cost);
		this.color = color;
	}
	
	
	
	

	



	public void info() {
		super.info();
		System.out.println("color : " + color);
		
	}

}
