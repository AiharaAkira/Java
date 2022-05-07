
public class Computer extends Product{
	private double cpu;
	private double ram;
	private double hdd;
	
	
	public Computer(String name, int cost,double cpu, double ram, double hdd) {
		super(name, cost);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getHdd() {
		return hdd;
	}
	public void setHdd(double hdd) {
		this.hdd = hdd;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("cpu : " + cpu);
		System.out.println("ram : " + ram);
		System.out.println("hdd : " + hdd);
	}
	
}
