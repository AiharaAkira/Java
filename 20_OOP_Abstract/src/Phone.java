
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
		System.out.println("전화");
	}
	
	void sns(){
		System.out.println("Sns");
	}
	
	void internet(){
		System.out.println("인터넷");
	}
	
	void game(){
		System.out.println("게임");
	}

}
