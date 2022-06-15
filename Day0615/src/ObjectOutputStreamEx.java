import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {


	public static void main(String[] args) {

		ObjectOutputStream oos = null;

		try {
		
			//�޸𸮿� ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ���ؼ�
			//����� �� �ִ� ObjectOutputStream��ü�� ����
			
			oos = new ObjectOutputStream(new FileOutputStream("d:/Akira/obj.ccc"));
			
			//ObjectOutputStream�� ���ؼ� ����ȭ�� �� ���Ϸ� ��ϵ� Data ��ü ����
			//��ü�� �����ϱ��� �ݵ�� Serializabl�� �����ϰ� �־����
			
			Data data = new Data();
			data.setNo(30);
			data.setName("ȫ�浿");
			data.setMail("hong@naver.com");
			//ObjectOutputStream�� ��ü�� ����ȭ �ؼ� ��Ʈ���� ���ؼ�
			//������ �� �ִ� writeObject()�޼ҵ带 Ȱ����
			oos.writeObject(data);
			
		}catch (Exception e) {

			e.printStackTrace();
			
		}finally {
			
			try {
				if(oos != null) {

					oos.close();
				
				}
			}catch (Exception e) {

				e.printStackTrace();
			
			}
				
		}
		
	}

}
