import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CMain4 {

	public static void main(String[] args) {

		// Set �迭 : ����������, �ߺ��ڵ�����, �������� - �� �Ⱦ�
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		System.out.println(hs.size());
		
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		// ������ ����Ϸ��� Set >> List�� �ٲ㼭 ���
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		System.out.println(al.get(0));
		
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("�ο�", 20, 10, 10, 10));
		students.add(new Student("�ָ�", 30, 20, 20, 20));
		students.add(new Student("�ָ�", 30, 20, 20, 20));
		// �����͸� ���� ���� ���� �ٸ� ���
		
		System.out.println(students.size());
		
		Student s = new Student("����", 20, 30, 50, 80);
		students.add(s);
		students.add(s);
		
		//��ü s�� ���� ������ (�ߺ�)
		System.out.println(students.size() + "------------------------");
		
		//�ζ�
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
			lotto.add(r.nextInt(45) + 1);
			
			if(lotto.size() == 6) {
				break;
			}
		}
		
		for (Integer integer : lotto) {
			System.out.println(integer );
		}
		
		
	}

}
