
public class IAM {

	public static void main(String[] args) {

		// 사람 = 이름, 나이, 자기소개(정보출력)
		// 병관, 25, 자기소개

		Human h1 = new Human("병관", 25);
		h1.info();
		System.out.println("---------------------");

		// 학생 = 이름,나이,일본어점수
		// 자기소개 기능
		// 건우, 20, 99

		Student s = new Student("건우", 20, 99);

	s.info();
		System.out.println("---------------------");

		// 선생 = 이름, 나이, 담당 과목
		// mz 27 java
		// 자기소개 가능

		Teacher t = new Teacher("mz", 27, "java");
		t.info();

	}

}
