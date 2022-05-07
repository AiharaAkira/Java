interface Car11{
	public static final String CAR_TYPE = "승용차";
	abstract void work();
}

interface Cannon{
	void fire();
}

interface MachinGun{
	void shoot();
}
// 인터페이스는 추상메서드, 상수
// 인터페이스 사용시 다중 상속가능
// 자바는 기본적으로 단일 상속
class Tank implements Car11, Cannon, MachinGun{
	@Override
	public void work() {
		System.out.println("탱크가 굴러간다.");
	}
	
	@Override
	public void fire() {

		System.out.println("대포발사");
	}
	
	@Override
	public void shoot() {
		System.out.println("기관총 발사");
	}
}

public class Ex11 {
	
	public static void main(String[] args) {
		Tank tank1 = new Tank();
		tank1.fire();
		tank1.shoot();
		tank1.work();
	}
	
}
