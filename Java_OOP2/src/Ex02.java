
public class Ex02 {
	public  Ex02() {
	System.out.println("슈퍼클래스 호출!");
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Sedan02 sedan1 = new Sedan02();
	}

}

 class Sedan02 extends Ex02 {
	public Sedan02() {
		System.out.println("서브클래스 호출!");
		// TODO Auto-generated constructor stub

	}

}
