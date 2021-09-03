package p02001;

public class GlobalFood {

	public GlobalFood() {
		// TODO Auto-generated constructor stub
		System.out.println("----- GlobalFood() constract");
		
	}
	
	public void makeFood(Ifood food) {
		
		System.out.println("----- makeFood() start");
		food.makeFood();
	}

}
