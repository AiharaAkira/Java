import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {

	public static void main(String[] args) {

		ObjectInputStream ois = null;

		try {
			
			//���Ͽ� ����� ��ü�� �о� �������� ObjectInputStream��ü�� ���
			//����� �� �ִ� ObjectOutputStream��ü�� ����
			
			ois = new ObjectInputStream(new FileInputStream("d:/Akira/obj.ccc"));
			
			//ObjectInputStream�� ���ؼ� ����ȭ�� �� ��ü�� ������ȭ�ؼ� Data ��ü ����
			//������ȭ �Ҷ� �ʿ��� Ŭ������ ã�� ���ϸ� ���� ó�� �߻�
			//��ü�� �����ϱ��� �ݵ�� Serializabl�� �����ϰ� �־����
			
			Data data = (Data)ois.readObject();
			System.out.println(data.getNo());
			System.out.println(data.getName());
			System.out.println(data.getMail());
			//ObjectOutputStream�� ��ü�� ����ȭ �ؼ� ��Ʈ���� ���ؼ�
			//������ �� �ִ� writeObject()�޼ҵ带 Ȱ����
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			try {
				if(ois != null) {
					
					ois.close();
					
				}
			}catch (Exception e) {
				
				e.printStackTrace();
				
			}
				
		}
		
	}

}
