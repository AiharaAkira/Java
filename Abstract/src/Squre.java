
public class Squre extends Shape{
	public final double side;
	
	public Squre(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return side*side;
	}
	
	@Override
	public double getPerimeter() {
		return 4*side;
	}
}
