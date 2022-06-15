import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {

	public static void main(String[] args) {

		ObjectInputStream ois = null;

		try {
			
			//파일에 저장된 객체를 읽어 오기위해 ObjectInputStream객체를 사용
			//기록할 수 있는 ObjectOutputStream객체를 생성
			
			ois = new ObjectInputStream(new FileInputStream("d:/Akira/obj.ccc"));
			
			//ObjectInputStream을 통해서 직렬화된 후 객체를 역직렬화해서 Data 객체 생성
			//역직렬화 할때 필요한 클래스를 찾지 못하면 예외 처리 발생
			//객체를 생성하기전 반드시 Serializabl을 구현하고 있어야함
			
			Data data = (Data)ois.readObject();
			System.out.println(data.getNo());
			System.out.println(data.getName());
			System.out.println(data.getMail());
			//ObjectOutputStream을 객체를 직렬화 해서 스트림을 통해서
			//저장할 수 있는 writeObject()메소드를 활용함
			
			
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
