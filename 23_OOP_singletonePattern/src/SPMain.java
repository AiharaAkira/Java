
public class SPMain {

	public static void main(String[] args) {
//		��ü�� �ϳ��� �������� = �̱�������
		
//		�ڱ� �ڽ�: �̸�, ����
		Me me = Me.getMe();
		me.info();
		System.out.println(me);
		
		Me me2 = Me.getMe();
		me2.info();
		System.out.println(me2);
		
		System.out.println("-------------------------");
		//���̾�� : �̸�, ���� > �������
		IronMan im = IronMan.getIronMan();
		im.info();
		System.out.println(im);
	}

}
