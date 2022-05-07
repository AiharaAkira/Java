
public class MW extends Strudent{
	
	
	public MW(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	void stSignal() {
		System.out.println("입실완료");
	}
	
	@Override
	void fnSignal() {
		System.out.println("퇴실완료");
	}
}
