import java.util.ArrayList;
import java.util.Comparator;

public class CMain3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("asd");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student("ȿ��", 20, 80, 70, 50);
		students.add(s1);
		
		students.add(new Student("����", 30, 50, 60, 90));
		students.add(new Student("�ϴ�", 23, 50, 60, 90));
		students.add(new Student("����", 33, 23, 14, 11));
		students.add(new Student("����", 21, 70, 60, 90));
		students.add(new Student("���", 24, 100, 100, 100));
		students.add(new Student("�¸�", 40, 89, 60, 90));
		
		// �л���
		System.out.println(students.size());
		
		//�ι�° �л��� ��������
		System.out.println(students.get(1).getKr());
		
		// ����° �л��� �̸�
		System.out.println(students.get(2).getName());
		// �ϰ���° �л��� �Ϻ��� ����
		System.out.println(students.get(6).getJp());
		//�ټ���° �л��� �̸��� ����
		System.out.println(students.get(1).getName() + students.get(1).getAge());
		// ������° �л��� ��,��, �� �������
		double avg =(double)( students.get(5).getEng() + students.get(5).getJp() + students.get(5).getKr())/3;
		System.out.println(avg);
		
		System.out.println("------------------");
		
		//�̸� �����ټ� ����
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				String o1Name = o1.getName();
				String o2Name = o2.getName();
				
				return o1Name.compareTo(o2Name);
			}
		};
		
		students.sort(c);
		
		for (Student student : students) {
			student.info();
			System.out.println("----");
		}
		
		System.out.println("---------------------------------");
		//���̼� ����
		
		//�⺻�� int �� ������ Integer�� �ٲ�� �޼ҵ� ��� ����
		Comparator<Student> d = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Age = o1.getAge();
				Integer o2Age = o2.getAge();
				
				return o1Age.compareTo(o2Age);
			}
		};
		
//		students.sort(d);
		students.sort(d.reversed());
		
		for (Student student : students) {
			student.info();
			System.out.println("----");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//���� ������
		Comparator<Student> e = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
			Double o1Avg =(o1.getEng() + o1.getJp() + o1.getKr())/ 3.0;
			Double o2Avg =(o2.getEng() + o2.getJp() + o2.getKr())/ 3.0;
				return o1Avg.compareTo(o2Avg);
			}
		};
		
		students.sort(e.reversed());
		
		for (Student student : students) {
			student.info();
			System.out.println("----");
		}
		
		System.out.println("++++++++++++1�� �õ�+++++++++++");
		
		//1���л��� ��ü ���� ���
		students.get(0).info();
		System.out.println("------------------");
		//�õ��л��� ��ü ����
		students.get(students.size()-1).info();
	}

}
