import java.util.ArrayList;

public class AMain2 {

	
	public static void main(String[] args) {
		
		//List 계열: 가변 사이즈 배열 - 가장 많이 사용
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("0");
		al.add("1");
		al.add("33.1");
		al.add("ㅋ");
		
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println("----------------------------");
		
		//<클래스명> : generic >> 데이터 타입을 강제 하는 것
		ArrayList<String> all = new ArrayList<>();
		
		
		
		all.add("zzz");
		all.add("ㅁㅁㅁ");
		all.add("ㅋㅋㅋ");
		
		
		System.out.println(all.size());
		
		for (String str : all) {
			System.out.println(str);
		}
		
		System.out.println(all.get(0));
		
		System.out.println("----------------------------");
		
		all.add("ㅎ"); //언제든지 추가, 인데스3
		all.add(0,"a");//위치 지정 가능
		all.set(1, "ㅋㅅㅋ");//데이터 값 변경 가능
		all.remove(0);//데이터값 삭제 가능
		
		for(int i = 0; i< all.size(); i++) {
			
			System.out.println(all.get(i));
			
		}
		
		System.out.println("-------------------------");
		
		//al3 만드셔서 10,20 넣고 출력
		
		
		//오름차순 정렬
		
		
		
		
	}
	
}
