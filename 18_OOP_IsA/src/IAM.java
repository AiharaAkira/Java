
public class IAM {

	public static void main(String[] args) {

		// ��� = �̸�, ����, �ڱ�Ұ�(�������)
		// ����, 25, �ڱ�Ұ�

		Human h1 = new Human("����", 25);
		h1.info();
		System.out.println("---------------------");

		// �л� = �̸�,����,�Ϻ�������
		// �ڱ�Ұ� ���
		// �ǿ�, 20, 99

		Student s = new Student("�ǿ�", 20, 99);

	s.info();
		System.out.println("---------------------");

		// ���� = �̸�, ����, ��� ����
		// mz 27 java
		// �ڱ�Ұ� ����

		Teacher t = new Teacher("mz", 27, "java");
		t.info();

	}

}
