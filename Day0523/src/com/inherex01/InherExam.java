package com.inherex01;


class SuperTest{
	
	protected double area;
	private String title;
	
	public SuperTest() {
		
		System.out.println("super 파라미터가 없는 생성자");
	
	}
	
	public SuperTest(String title) {
		
		this.title = title;
		
	}
	
	public void write() {
		
		System.out.println(title + ", "+ area);
		
	}
	
}

class Rect extends SuperTest{
	
	//상속받아서 위에거 쓸 필요 없음(private빼고)
	
	private int w, h;
	
	public Rect() {
		//super();
	}
	
	/*메소드 오버라이딩
	 * 
	 * 상위 클래스를 상속 받은 하위클래스에서 
	 * 상위 클래스에 정의된 메소드를 재정의 하는것을 의미함
	 * 
	 * 객체지향 프로그램의 특징인 다형성을 나타냄
	 * 
	 * 재정의
	 * 반드시 상속관계에 있어야하며
	 * 메소드 이름, 리턴타입, 매개변수의 개수나 타입이 완전히 일치해야함
	 * 
	 * */
	
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		area = (double)this.w * this.h;
		this.write();
	}
	
	@Override
	public void write() {
		//super.write();
		
		System.out.println("w:"+w+","+"h:"+h);
		System.out.println("넓이: "+area);
	}
	
	
	
	
}

class Circle extends SuperTest{
	
	public Circle(String title) {
	
		super(title);
	}
	
	public void calc(int r) {
		area = r*r*3.14;
		write();
	
	}
	
}

public class InherExam {

	/*상속시 주의 사항
	 * - 상위 클래스에서 선언됨 멤버변수와 하위 클래스에서 선언한 멤버 변수가 같으면
	 * 상위 클래스의 멤버 변수가 무시됨
	 *이때, 상위 클래스의 멤버변수를 사용하기 위해서는 super라는 키워드를 이용함
	 *
	 *-동일한 이름의 멤버 변수나 동일한 이름의 메소드가 한 클래스 안에 정의 되는 경우는 에러가 발생
	 *
	 * */

	public static void main(String[] args) {

		Rect r = new Rect();
		
		Circle c = new Circle("원의넓이:");
		r.calc(4, 5);
		c.calc(4);
		
	}

}
