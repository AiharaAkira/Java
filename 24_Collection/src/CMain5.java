import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CMain5 {

	public static void main(String[] args) {

		// Map �迭 : ����������, �����ý���, Ű - ��
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("ź��ȭ��", 50);
		hm.put("�ܹ���", 500);
		hm.put("����", 5000);
		
		System.out.println(hm.get("ź��ȭ��"));
		System.out.println("----------------");
		
		// ã�� �л� �̸� �ϳ� ���� ������ �� �� �ְ�
		
		// �л��� ���� ã���ĸ� ��������
		//�л��� ��ȣ�� ã���� ArrayList�� ����
		
		//����ó�� �̸����� ã�ڴٸ� HashMap�� ����
		
		//�ַ��� ArrayList�ε� ����ó�� Ư���� �����϶� Map
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		
		students.put("�ؼ�", new Student("�ؼ�", 20, 10, 20, 30));
		students.put("��ȣ", new Student("��ȣ", 30, 30, 50, 10));
		
		students.get("�ؼ�").info();
		
		// ���� ��°� ������ ���� �ִ����� �����ֱ�
		// Ű���� ���� (���� �ִ��� ������)
		
		Set<String> sNames = students.keySet();
		ArrayList<String> sNames2 = new ArrayList<String>(sNames);
		
		for (String string : sNames2) {
			System.out.println(string);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		
		String name = sc.next();
		
		System.out.println(students.get(name));//��ü �ּ�
		students.get(name).info();
		
		
	}

}
