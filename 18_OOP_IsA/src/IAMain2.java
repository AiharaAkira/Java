
public class IAMain2 {

	public static void main(String[] args) {
		//�ʵ� ���� x
		//���߿� �� o , ������ o 
		
		//��ǻ�� : �̸�, ����, cpu, ram, hdd
		Computer c = new Computer("sambo", 130, 11, 12.5, 11.1);
		
	
		
		//��Ŭ �ʵ尡 �� private �ɷ��־ ����� �ȵ��ٵ� ��� �� ���õ���?
	
		//�켱, setter�� ���������ڰ� public �̰�
		//���ݰ� �̸��� product Ŭ�������� setter�������ϸ�
		//��ǻ�� Ŭ������ product Ŭ������ ��ӹޱ� ������
		//productŬ������ �ִ� setter �޼ҵ尡 �ߵ�
		
		//�������
		c.info();
		
		//���� : �̸�, ����, �÷�
		Ballpen b = new Ballpen("Monami", 1500, "red");
		//�������
		b.info();
		
		//��Ʈ�� : �̸�, ����, ����, ���͸�, �뷮
		//�������
		NoteBook1 n = new NoteBook1("MSI", 100, 7.3, 5.5, 500);
		n.setCost(80);
		n.info();
		
		

	}

}
