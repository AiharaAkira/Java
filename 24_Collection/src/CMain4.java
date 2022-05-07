import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CMain4 {

	public static void main(String[] args) {

		// Set 계열 : 가변사이즈, 중복자동제거, 순서랜덤 - 잘 안씀
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		System.out.println(hs.size());
		
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		// 순서를 사용하려면 Set >> List로 바꿔서 사용
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		System.out.println(al.get(0));
		
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("민우", 20, 10, 10, 10));
		students.add(new Student("솔리", 30, 20, 20, 20));
		students.add(new Student("솔리", 30, 20, 20, 20));
		// 데이터만 같지 둘은 전혀 다른 사람
		
		System.out.println(students.size());
		
		Student s = new Student("혜수", 20, 30, 50, 80);
		students.add(s);
		students.add(s);
		
		//객체 s를 세번 넣은거 (중복)
		System.out.println(students.size() + "------------------------");
		
		//로또
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
			lotto.add(r.nextInt(45) + 1);
			
			if(lotto.size() == 6) {
				break;
			}
		}
		
		for (Integer integer : lotto) {
			System.out.println(integer );
		}
		
		
	}

}
