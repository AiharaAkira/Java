
public abstract class Shape {
	
	private double x,y;
	
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
