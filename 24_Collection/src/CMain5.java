import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CMain5 {

	public static void main(String[] args) {

		// Map 계열 : 가변사이즈, 순서시스템, 키 - 값
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("탄수화물", 50);
		hm.put("단백질", 500);
		hm.put("지방", 5000);
		
		System.out.println(hm.get("탄수화물"));
		System.out.println("----------------");
		
		// 찾을 학생 이름 하나 쓰면 내용을 볼 수 있게
		
		// 학생을 뭘로 찾느냐를 따져보기
		//학생을 번호로 찾으면 ArrayList가 적절
		
		//지금처럼 이름으로 찾겠다면 HashMap이 적절
		
		//주력은 ArrayList인데 지금처럼 특수한 목적일때 Map
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		
		students.put("준석", new Student("준석", 20, 10, 20, 30));
		students.put("지호", new Student("지호", 30, 30, 50, 10));
		
		students.get("준석").info();
		
		// 누구 찍는건 좋은데 누가 있는지좀 보여주기
		// 키값만 빼기 (누가 있는지 볼려고)
		
		Set<String> sNames = students.keySet();
		ArrayList<String> sNames2 = new ArrayList<String>(sNames);
		
		for (String string : sNames2) {
			System.out.println(string);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("누구 : ");
		
		String name = sc.next();
		
		System.out.println(students.get(name));//객체 주소
		students.get(name).info();
		
		
	}

}
