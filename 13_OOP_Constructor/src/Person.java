
public class Person {
	private String name;
	String gender;
	private int age;
	private Boolean nightWork;
	
	

	// ������ : setter or �����ε� ������
	public Person(String name, int age, Boolean nightWork) {
		super();
		this.name = name;
		this.age = age;
		this.nightWork = nightWork;
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�߱�: " + nightWork);

	}
	

	// �⺻ ������ : �����ڸ� ���� �Ȱǵ帮�� �ڵ����� �������
	// �����ε� �����ڸ� ������ٸ� �ڵ����� �ȸ������
	
	public void work() {
		
	}

	public String work(String working) {
		if (working.equals("��")) {
			return "�ڵ��ϱ�";

		} else if (working.equals("���")) {
			return "�����";
		}

		return null;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getNightWork() {
		return nightWork;
	}

	public void setNightWork(Boolean nightWork) {
		this.nightWork = nightWork;
	}

	// �� ������ ����. �ٵ� '����' �־�� �Ǽ� ����ȭ ��Ų ��
	public Person() {
		System.out.println("����");

//		���� ���� : Spring .. �� �ڹ� ��ü�� �ڵ����� ������ִ� ���� ���� �Ҷ� �⺻�����ڸ� ���
//		>>�⺻�����ڸ� ���� ������ ����
//		�ٸ� ���α׷� ���ִ�? ������ ������ �׳� ����� ���� ����ȭ
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		System.out.println("����");
	}

}
