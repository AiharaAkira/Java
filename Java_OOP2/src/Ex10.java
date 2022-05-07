interface Car10{
	public static final String CAR_TYPE = "승용차";
	abstract void work();
}
// 인터페이스는 추상메서드, 상수
class Sedan10 implements Car11{
	@Override
	public void work() {
	System.out.println("승용차가 사람태움");	
	}
}

class Truck10 implements Car11{
	@Override
	public void work() {
	System.out.println("트럭이 짐을 싣고 있음");	
	}
}
public class Ex10 {
	
	Car11 car; 
	
}
