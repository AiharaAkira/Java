
public class Bus extends Car{
	private String busNum;

	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String model, String num, String busNum) {
		super(model, num);
		
		this.busNum = busNum;
		
	}
	
	@Override
	void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(busNum);
	}
	
}
