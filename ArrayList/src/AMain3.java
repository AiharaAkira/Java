import java.util.ArrayList;

public class AMain3 {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		
		students.add(new Student("�ο�", 25, "������"));
		students.add(new Student("��ȯ", 27, "����"));
		students.add(new Student("�̼�", 25, "����"));
		
		//���� = ������ = �л���
		System.out.println(students.size());
		
		//����° �л��� �ּ�
		System.out.println(students.get(2).getAdress());
		
		
		
	}

}
