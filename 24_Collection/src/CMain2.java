import java.util.ArrayList;

public class CMain2 {

	public static void main(String[] args) {


		//List 계열 : 가변 사이즈 배열 - 가장 많이 사용
		
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(33.1);
		al.add("ㅋ");
		
		System.out.println(al.size());
		System.out.println("-----------------------");
		
		//<클래스명> : generic >> 데이터 타입을 강제하는 것.
		
		ArrayList<String> al12 = new ArrayList<String>();
		al12.add("zzz");
		al12.add("ㅁㅁㅁ");
		al12.add("ㅋㅋㅋ");
		System.out.println(al12.size());
		
		System.out.println(al12.get(1));
		
		for (String s : al12) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		
		al12.add("ㅎ"); //언제든지 추가
		al12.add(0, "ㅎ"); // 위치 지정 가능
		al12.set(1, "ㅋㅅㅋ"); // 데이터 값 변경 가능
		al12.remove(3); //데이터 값 삭제 가능 
		
		
		for(int i = 0; i < al12.size(); i++) {
			System.out.println(al12.get(i));
		}
		System.out.println("------------------------");
		// al3 만들어서 10, 20 넣고 다 출력
		// 잘 안쓰는 형태 x
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		
		al3.add(10);
		al3.add(20);
		
		for (Integer integer : al3) {
			System.out.println(integer);
		}
		
	}

}
