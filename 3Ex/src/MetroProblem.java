import java.util.Scanner;

public class MetroProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Boolean result = true;

		System.out.println("�����Դϱ�?(����:1, ���� �ƴ�:0):");
		int answerCity = sc.nextInt();

		System.out.println("�α��� �� ���Դϱ�?(���� : ��) : ");
		int answerPeople = sc.nextInt();

		System.out.println("���ڴ� �� ���Դϱ�?(���� : ��) :");
		int answerRich = sc.nextInt();
		
		System.out.println("�� ���ô� ��Ʈ���������Դϱ�? :");

		if (answerCity == 1 && answerPeople >=100 && answerRich >= 60 ) {
			System.out.println(result);
		} else {
			System.out.println(!result);
		}

	}

}
