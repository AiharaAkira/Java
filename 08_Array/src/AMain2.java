
public class AMain2 {

	public static void main(String[] args) {

		// �л��� �Ͼ����� 90��
		int jpScore = 90;
		System.out.println(jpScore);

		// �迭 (������)
		// �л� 5���� ���� ����
		// �� ��(���, element)�� �𸦶�
		int[] engScore = new int[5]; // 5ĭ (ĭ�� �ε���, ����)
		System.out.println(engScore);

		engScore[0] = 100;
		engScore[1] = 90;
		engScore[2] = 80;
		engScore[3] = 70;
		engScore[4] = 60;

		System.out.println("4��° �л��� ����: " + engScore[3]);
		System.out.println("_______________________________");

		// ���� �˰� ���� ��(���� ����, �ʱ�ȭ�� ���ÿ�)

//		int[] engTest = new int[] {10, 20, 30, 40, 50};
		int[] engTest = { 10, 20, 30, 40, 50 };
		System.out.println(engTest[1]);
		System.out.println(engTest.length); // �� ĭ ¥��?

		System.out.println("1______________________________________________");

		// jpScore
		int[] jpTest = { 50, 60, 70, 80, 90 };

		// �迭�� ���� ���
		System.out.println(jpTest.length);

		// ��ü ��հ���ؼ� ���
		int sum = 0;
		for (int i = 0; i < jpTest.length; i++) {
			sum += jpTest[i];
		}

//		sum = jpTest[0] + jpTest[1] + jpTest[2] + jpTest[3] + jpTest[4];
		// ������
		int avg = sum / jpTest.length;
		System.out.println("sum = " + avg);

		System.out.println("2______________________________________________");

		for (int i = 0; i < jpTest.length; i++) {
			System.out.println(jpTest[i]);
		}

		System.out.println("3______________________________________________");
		// foreach(�迭) ���� ���� ���� ������
		for (int asd : jpTest) {
			System.out.println(asd);
		}

		System.out.println("4.______________________________________________");

		// engScore 2��°

		// �װ��� ����(ũ��)
		System.out.println(engScore.length);
		// for������ �ϳ��� ���
		for (int i = 0; i < engScore.length; i++) {
			System.out.println(engScore[i]);
		}
		// foreach
		for (int i : engScore) {
			System.out.println(i);
		}

		System.out.println("5.______________________________________________");

		// ���ʷ�, ���, �ǿ�

		String[] name = { "���ʷ�", "���", "�ǿ�" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		for (String s : name) {
			System.out.println(s);
		}
		System.out.println("6.______________________________________________");

		int[] push = new int[5];

		// ����� �ʱ�ȭ�� ���ϸ� 0�� �ڵ����� ��
		for (int i = 0; i < push.length; i++) {
			System.out.println(push[i]);

		}
		System.out.println();

		for (int i = 0; i < push.length; i++) {
			push[i] = i + 1;
			System.out.println(push[i]);

		}

		// ����� �� �� ���ϱ�
		sum = 0;
		for (int i = 0; i < push.length; i++) {
			push[i] = i + 1;

			sum += push[i];

		}
		System.out.println(sum);
		System.out.println("________________________________________________");

		int sum1 = 0;
		int avg1 = 0;
		for (int i : jpTest) {
			sum1 += i;

		}

		avg1 = sum1 / jpTest.length;

		System.out.println(avg1);
	}

}
