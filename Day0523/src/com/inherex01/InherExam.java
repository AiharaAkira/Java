package com.inherex01;


class SuperTest{
	
	protected double area;
	private String title;
	
	public SuperTest() {
		
		System.out.println("super �Ķ���Ͱ� ���� ������");
	
	}
	
	public SuperTest(String title) {
		
		this.title = title;
		
	}
	
	public void write() {
		
		System.out.println(title + ", "+ area);
		
	}
	
}

class Rect extends SuperTest{
	
	//��ӹ޾Ƽ� ������ �� �ʿ� ����(private����)
	
	private int w, h;
	
	public Rect() {
		//super();
	}
	
	/*�޼ҵ� �������̵�
	 * 
	 * ���� Ŭ������ ��� ���� ����Ŭ�������� 
	 * ���� Ŭ������ ���ǵ� �޼ҵ带 ������ �ϴ°��� �ǹ���
	 * 
	 * ��ü���� ���α׷��� Ư¡�� �������� ��Ÿ��
	 * 
	 * ������
	 * �ݵ�� ��Ӱ��迡 �־���ϸ�
	 * �޼ҵ� �̸�, ����Ÿ��, �Ű������� ������ Ÿ���� ������ ��ġ�ؾ���
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
		System.out.println("����: "+area);
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

	/*��ӽ� ���� ����
	 * - ���� Ŭ�������� ����� ��������� ���� Ŭ�������� ������ ��� ������ ������
	 * ���� Ŭ������ ��� ������ ���õ�
	 *�̶�, ���� Ŭ������ ��������� ����ϱ� ���ؼ��� super��� Ű���带 �̿���
	 *
	 *-������ �̸��� ��� ������ ������ �̸��� �޼ҵ尡 �� Ŭ���� �ȿ� ���� �Ǵ� ���� ������ �߻�
	 *
	 * */

	public static void main(String[] args) {

		Rect r = new Rect();
		
		Circle c = new Circle("���ǳ���:");
		r.calc(4, 5);
		c.calc(4);
		
	}

}
