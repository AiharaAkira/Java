
public class AMain5 {

	public static void main(String[] args) {

		// 2���� �迭

		// �л����� Ű, ü��

		int[][] stud = { { 180, 80 }, { 170, 70 }, { 160, 60 }, };
		// ù��° �л��� Ű
		System.out.println(stud[0][0]);

		// ����° �л��� ü��
		System.out.println(stud[2][1]);

		// �ι�° �л��� ü��
		System.out.println(stud[1][0]);

		System.out.println("____________________________________");

		// �̸�, ��� ��
		String[][] ss = { { "�ǿ�", "���빮" }, { "���", "����" }, { "���ʷ�", "���빮" } };

		// �ι�° ��� ��� ��
		System.out.println(ss[0][1]);
		// ù��° ��� �̸�
		System.out.println(ss[0][0]);
		// ����° ��� ��� ��, �̸�
		System.out.println(ss[2][0] + " 	" + ss[2][1]);

		System.out.println("____________________________________");

		int[][] ar = new int[3][4];

		// Test
		// ���� ���� ���� ����
		int num = 1;
		// ��
		for (int i = 0; i < 3; i++) {
			// ��
			for (int j = 0; j < 4; j++) {

				ar[i][j] = num++;
//				ar[i][j] = num;	
//				num++;
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}

		// ���
		System.out.println("_____________________________________________");
		// [��][��][��]
		int[][][] aa = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } } };
		
		System.out.println(aa[0][2][2]);
		System.out.println(aa[1][1][0]);

	}

}
