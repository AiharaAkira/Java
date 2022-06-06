import java.util.ArrayList;

public class AMain3 {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		
		students.add(new Student("민우", 25, "의정부"));
		students.add(new Student("세환", 27, "서울"));
		students.add(new Student("미선", 25, "서울"));
		
		//길이 = 사이즈 = 학생수
		System.out.println(students.size());
		
		//세번째 학생의 주소
		System.out.println(students.get(2).getAdress());
		
		
		
	}

}
