
public class NoteBook1 extends Product {
	private double weight;
	private double battery;
	private double volume;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public NoteBook1(String name, int cost, double weight, double battery, double volume) {
		super(name, cost);
		this.weight = weight;
		this.battery = battery;
		this.volume = volume;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("weight : " + weight);
		System.out.println("battery : " + battery);
		System.out.println("volume : " + volume);
	}

	

}
