
public class EHMain3 {

	public static void main(String[] args) {
		
		//여기서 다른 메서드 호출
//		이미 처리된 메서드
		EHMain.test();
		
		EHMain2.test();
		
		
		//throw로 넘겨 받음
		try {
			EHMain2.test2();
		} catch (Exception e) {
			System.out.println("뭔가 문제 생김");
		}
		
		
		
	}

}
