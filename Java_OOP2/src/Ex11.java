interface Car11{
	public static final String CAR_TYPE = "�¿���";
	abstract void work();
}

interface Cannon{
	void fire();
}

interface MachinGun{
	void shoot();
}
// �������̽��� �߻�޼���, ���
// �������̽� ���� ���� ��Ӱ���
// �ڹٴ� �⺻������ ���� ���
class Tank implements Car11, Cannon, MachinGun{
	@Override
	public void work() {
		System.out.println("��ũ�� ��������.");
	}
	
	@Override
	public void fire() {

		System.out.println("�����߻�");
	}
	
	@Override
	public void shoot() {
		System.out.println("����� �߻�");
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
