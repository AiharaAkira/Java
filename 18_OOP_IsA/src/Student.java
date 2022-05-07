
//student is a human
public class Student extends Human{
	int jpScore;
	public Student() {
	}
	
	public Student(String name, int age,int jpScore) {
		
		this.name = name;
		this.age = age;
		this.jpScore = jpScore;
	}

	//자기소개
	//메소드를 재정의 : 오버라이딩
	
	//상위(super)클래스
	@Override
	public void info(){
		super.info();
		System.out.println(jpScore);
	}
	
	
}
