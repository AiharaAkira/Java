
public class OAMain {

	public static void main(String[] args) {
		
		//����
//		���ݱ�� void attack(); ������
//		�����̶�� �� ������ �����ؾ� �Ѵ�.
		
		// ���۸�
		SuperMan superMan = new SuperMan("���۸�");
		superMan.attack();
		// ���̾��
		IronMan ironMan = new IronMan("���̾��");
		ironMan.attack();
		// ��ũ
		Hulk hulk = new Hulk("��ũ");
		hulk.attack();
	}

}
