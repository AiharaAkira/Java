// Conditional Stmt(���ǹ�)
// ���ǹ� (if)

//if(���ǽ�){
//������ ���϶� ���� �� ����}
public class CDMain1 {

	public static void main(String[] args) {
		
//		if��, else(�����ϳ�. �³� �ƴϳ�)
		int age = 70;
		
		//���̰� 70�̻��̸� "�ȳ��Ͻʴϱ�"���, �ƴϸ� "��ó׿�" ���
		if(age >= 70) {
			System.out.println("�ȳ��Ͻʴϱ�");
		}else {
			System.out.println("��ó׿�.");
		}
		
		
		String msg = age >= 70 ? "�ȳ��Ͻʴϱ�" : "��ó׿�";
		System.out.println(msg);
		
		//���̰� Ȧ�� 10��̸�, "������" �ƴϸ� "������"
		
		int age2 = 3;
		if(age2 %2 ==1 && age2 < 10) {
			System.out.println("Ȧ���̸鼭 10�� �̸�");
		}else {
			System.out.println("Else");
		}
		
		//���̰� 1�� �ʰ� 5�� �̸��̸� "������" ���
		if(age2 > 1 && age2 < 5) {
			System.out.println("1�� �ʰ� 5��̸�");
		}
		
		//���� ���� ����ž��
		//���� ���� age(70), age2(3)
		
		int height = 100;
		
		//age �� 20�� ������, age2�� 3���̻��̰�, Ű�� 80������ 
		//����ž�� ���� < ���
		//���� �ȸ����� ����ž�� �Ұ� < ���
		
		if(age > 20 || age2 >= 30 && height > 180) {
			System.out.println("����ž�� ����");
		}else {
			System.out.println("����ž�� �Ұ�");
		}
		
		/*
		 * t || t && t == t
		 * t || t && f == t
		 * t || f && t == t
		 * t || f && f == t
		 * && ���켱���� ���� == ���� ������
		 * 
		 */
		
		
		
	}

}
