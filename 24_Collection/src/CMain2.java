import java.util.ArrayList;

public class CMain2 {

	public static void main(String[] args) {


		//List �迭 : ���� ������ �迭 - ���� ���� ���
		
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(33.1);
		al.add("��");
		
		System.out.println(al.size());
		System.out.println("-----------------------");
		
		//<Ŭ������> : generic >> ������ Ÿ���� �����ϴ� ��.
		
		ArrayList<String> al12 = new ArrayList<String>();
		al12.add("zzz");
		al12.add("������");
		al12.add("������");
		System.out.println(al12.size());
		
		System.out.println(al12.get(1));
		
		for (String s : al12) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		
		al12.add("��"); //�������� �߰�
		al12.add(0, "��"); // ��ġ ���� ����
		al12.set(1, "������"); // ������ �� ���� ����
		al12.remove(3); //������ �� ���� ���� 
		
		
		for(int i = 0; i < al12.size(); i++) {
			System.out.println(al12.get(i));
		}
		System.out.println("------------------------");
		// al3 ���� 10, 20 �ְ� �� ���
		// �� �Ⱦ��� ���� x
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		
		al3.add(10);
		al3.add(20);
		
		for (Integer integer : al3) {
			System.out.println(integer);
		}
		
	}

}
