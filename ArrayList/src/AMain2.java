import java.util.ArrayList;

public class AMain2 {

	
	public static void main(String[] args) {
		
		//List �迭: ���� ������ �迭 - ���� ���� ���
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("0");
		al.add("1");
		al.add("33.1");
		al.add("��");
		
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println("----------------------------");
		
		//<Ŭ������> : generic >> ������ Ÿ���� ���� �ϴ� ��
		ArrayList<String> all = new ArrayList<>();
		
		
		
		all.add("zzz");
		all.add("������");
		all.add("������");
		
		
		System.out.println(all.size());
		
		for (String str : all) {
			System.out.println(str);
		}
		
		System.out.println(all.get(0));
		
		System.out.println("----------------------------");
		
		all.add("��"); //�������� �߰�, �ε���3
		all.add(0,"a");//��ġ ���� ����
		all.set(1, "������");//������ �� ���� ����
		all.remove(0);//�����Ͱ� ���� ����
		
		for(int i = 0; i< all.size(); i++) {
			
			System.out.println(all.get(i));
			
		}
		
		System.out.println("-------------------------");
		
		//al3 ����ż� 10,20 �ְ� ���
		
		
		//�������� ����
		
		
		
		
	}
	
}
