
public class MW extends Strudent{
	
	
	public MW(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	void stSignal() {
		System.out.println("�ԽǿϷ�");
	}
	
	@Override
	void fnSignal() {
		System.out.println("��ǿϷ�");
	}
}
