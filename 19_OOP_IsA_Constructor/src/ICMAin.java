
public class ICMAin {

	public static void main(String[] args) {
		
		//������ī 
		//�𵨸�, �ѹ� > �������
		Car sportsCar =  new Car("���", "10��1036");
		sportsCar.info();
		
		//�ý�
		//�𵨸�, �ѹ�, �⺻�� > ���� ���
		Taxi taxi = new Taxi("�����ý�", "46��1034", 1000);
		taxi.info();
		
		
		
		//����
		//�𵨸�, �ѹ�, �뼱��ȣ > �������
		Bus bus = new Bus("��������", "31��1234", "101��");
		bus.info();
//		�ν��Ͻ� ������ �����ڿ� �ĸ����� ����
//		��� �ʵ�� ���� ���� �ȵǰ�

	}

}
