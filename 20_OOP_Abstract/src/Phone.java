
abstract class Phone {
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	String model;
	String color;
	int price;
	double weight;
	
	abstract public void info();
	
	void call(){
		System.out.println("��ȭ");
	}
	
	void sns(){
		System.out.println("Sns");
	}
	
	void internet(){
		System.out.println("���ͳ�");
	}
	
	void game(){
		System.out.println("����");
	}

}
