interface Car10{
	public static final String CAR_TYPE = "�¿���";
	abstract void work();
}
// �������̽��� �߻�޼���, ���
class Sedan10 implements Car11{
	@Override
	public void work() {
	System.out.println("�¿����� ����¿�");	
	}
}

class Truck10 implements Car11{
	@Override
	public void work() {
	System.out.println("Ʈ���� ���� �ư� ����");	
	}
}
public class Ex10 {
	
	Car11 car; 
	
}
