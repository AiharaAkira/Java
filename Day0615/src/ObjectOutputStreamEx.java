import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {


	public static void main(String[] args) {

		ObjectOutputStream oos = null;

		try {
		
			//메모리에 생성된 객체를 직렬화 해서 스트림을 통해서
			//기록할 수 있는 ObjectOutputStream객체를 생성
			
			oos = new ObjectOutputStream(new FileOutputStream("d:/Akira/obj.ccc"));
			
			//ObjectOutputStream을 통해서 직렬화된 후 파일로 기록될 Data 객체 생성
			//객체를 생성하기전 반드시 Serializabl을 구현하고 있어야함
			
			Data data = new Data();
			data.setNo(30);
			data.setName("홍길동");
			data.setMail("hong@naver.com");
			//ObjectOutputStream을 객체를 직렬화 해서 스트림을 통해서
			//저장할 수 있는 writeObject()메소드를 활용함
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
