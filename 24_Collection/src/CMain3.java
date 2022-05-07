import java.util.ArrayList;
import java.util.Comparator;

public class CMain3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("asd");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student("효섭", 20, 80, 70, 50);
		students.add(s1);
		
		students.add(new Student("병관", 30, 50, 60, 90));
		students.add(new Student("하늬", 23, 50, 60, 90));
		students.add(new Student("제현", 33, 23, 14, 11));
		students.add(new Student("유진", 21, 70, 60, 90));
		students.add(new Student("재식", 24, 100, 100, 100));
		students.add(new Student("태림", 40, 89, 60, 90));
		
		// 학생수
		System.out.println(students.size());
		
		//두번째 학생의 국어점수
		System.out.println(students.get(1).getKr());
		
		// 세번째 학생의 이름
		System.out.println(students.get(2).getName());
		// 일곱번째 학생의 일본어 점수
		System.out.println(students.get(6).getJp());
		//다섯번째 학생의 이름과 나이
		System.out.println(students.get(1).getName() + students.get(1).getAge());
		// 여섯번째 학생의 영,국, 일 평균점수
		double avg =(double)( students.get(5).getEng() + students.get(5).getJp() + students.get(5).getKr())/3;
		System.out.println(avg);
		
		System.out.println("------------------");
		
		//이름 가나다순 정렬
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				String o1Name = o1.getName();
				String o2Name = o2.getName();
				
				return o1Name.compareTo(o2Name);
			}
		};
		
		students.sort(c);
		
		for (Student student : students) {
			student.info();
			System.out.println("----");
		}
		
		System.out.println("---------------------------------");
		//나이순 정렬
		
		//기본형 int 를 참조형 Integer로 바꿔야 메소드 사용 가능
		Comparator<Student> d = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Age = o1.getAge();
				Integer o2Age = o2.getAge();
				
				return o1Age.compareTo(o2Age);
			}
		};
		
//		students.sort(d);
		students.sort(d.reversed());
		
		for (Student student : students) {
			student.info();
			System.out.println("----");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//종합 성적순
		Comparator<Student> e = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
			Double o1Avg =(o1.getEng() + o1.getJp() + o1.getKr())/ 3.0;
			Double o2Avg =(o2.getEng() + o2.getJp() + o2.getKr())/ 3.0;
				return o1Avg.compareTo(o2Avg);
			}
		};
		
		students.sort(e.reversed());
		
		for (Student student : students) {
			student.info();
			System.out.println("----");
		}
		
		System.out.println("++++++++++++1등 꼴등+++++++++++");
		
		//1등학생의 전체 정보 출력
		students.get(0).info();
		System.out.println("------------------");
		//꼴등학생의 전체 정보
		students.get(students.size()-1).info();
	}

}
