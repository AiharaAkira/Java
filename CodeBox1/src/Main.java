public class Main {
	public static void main(String[] args) {
		// Theater ����
		Theater t = new Theater(5, 9);
		
		
		// �¼� ����
		System.out.println("����Ǵ� �̸����� A5���� 2���� �¼� ����: " + (t.reserve("�����", 'A', 5, 2) ? "����" : "����"));
		System.out.println("�������� �̸����� C1���� 3���� �¼� ����: " + (t.reserve("������", 'C', 1, 3) ? "����" : "����"));
		System.out.println("�����ƴ� �̸����� D4���� 7���� �¼� ����: " + (t.reserve("������", 'D', 4, 7) ? "����" : "����"));
		System.out.println("������� �̸����� C7���� 3���� �¼� ����: " + (t.reserve("������", 'C', 7, 3) ? "����" : "����"));

		// �¼� ���
		System.out.println("A6���� �¼� 3�� ���: �� " + t.cancel('A', 6, 3) + "���� �¼��� ��ҵǾ����ϴ�.");
		System.out.println("���������� �¼� ���: �� " + t.cancel("������") + "���� �¼��� ��ҵǾ����ϴ�.");

		// ��� ���
		System.out.println();
		t.printSeatMatrix();
		System.out.println("�� " + t.getNumberOfReservedSeat() + "���� �¼��� ����Ǿ����ϴ�.");
	}
}