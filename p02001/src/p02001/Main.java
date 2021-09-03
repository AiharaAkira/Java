package p02001;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		KoreaFood koreaFood = new KoreaFood();
		
		ChinaFood chinaFood = new ChinaFood();
		
		GlobalFood globalFood = new GlobalFood();
		
		
		globalFood.makeFood(chinaFood);
		globalFood.makeFood(koreaFood);
		// TODO Auto-generated method stub

	}

}
