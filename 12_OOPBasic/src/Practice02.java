
public class Practice02 {

	public static void main(String[] args) {
		Animal dog = new Animal();
		
		//�ʵ忡 ���� �������� ���ϰ� ����
		
		//������ 100 �� ����

		dog.setType("������");
		dog.setAge(8);
		
		dog.move();

		Animal cat = new Animal();

		cat.setType("�����");
		cat.setAge(13);
		
		cat.move();
		
		System.out.println(dog.getType()+"�� "+dog.getAge() + "����");
		System.out.println(cat.getType()+"�� "+cat.getAge() + "����");

		
	}

}
