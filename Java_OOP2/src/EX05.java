class Car05{
	protected String color;
	int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class Sedan05 extends Car05{
	//super()
	void setSpeed(int speed) {
		this.speed = speed;
//		public > default > protected > private
	}
	//private�� �ɸ� ����� �ȵ�.
	//protected�� �ɸ� ����� ��.
	public void setColor(String color) {
		this.color = color;
	}
	
	
}


public class EX05 {

	public static void main(String[] args) {
		Sedan05 sedan01 = new Sedan05();
		sedan01.setSpeed(100);
		sedan01.setColor("����");
		System.out.println("�¿����ӵ� >" + sedan01.speed);
		System.out.println("�¿������� >" + sedan01.color);
		
		
	}

}
