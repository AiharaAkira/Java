
public class Taxi extends Car{
	private int price;

	
	public Taxi(String model, String num, int price) {
		super(model, num);
		
		this.price = price;
		
		
	}
	
	
	
	@Override
	void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(price);
	}
}
