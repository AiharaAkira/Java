class Car03 {
	public Car03() {
		System.out.println("슈클 생성자 (파라미터 없음)");
	}

	public Car03(String str) {
		System.out.println("슈클 생성자 ->" + str);
	}
}

class Sedan03 extends Car03 {
	public Sedan03(String str) {
		// super는 타이핑 안되있어도 존재함.
		super();
		System.out.println("섭클 생성자 ->" + str);
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan03 sedan1 = new Sedan03("여기요");
	}

}
