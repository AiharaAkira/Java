class Car07{
	int speed;
	
	final void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan07 extends Car07{
	//final�� ��ӵ�
	
	static final String CAR_TYPE = "�¿���";
	
	
}

public class Ex07 {
	
	public static void main(String[] args) {
		
		Sedan07 sedan1 = new Sedan07();
		System.out.println(sedan1.CAR_TYPE);
		sedan1.upSpeed(100);
		
	}
	
}
