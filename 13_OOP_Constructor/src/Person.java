
public class Person {
	private String name;
	String gender;
	private int age;
	private Boolean nightWork;
	
	

	// 갑설정 : setter or 오버로딩 생성자
	public Person(String name, int age, Boolean nightWork) {
		super();
		this.name = name;
		this.age = age;
		this.nightWork = nightWork;
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("야근: " + nightWork);

	}
	

	// 기본 생성자 : 생성자를 전혀 안건드리면 자동으로 만들어줌
	// 오버로딩 생성자를 만들었다면 자동으로 안만들어줌
	
	public void work() {
		
	}

	public String work(String working) {
		if (working.equals("일")) {
			return "코딩하기";

		} else if (working.equals("퇴근")) {
			return "감사요";
		}

		return null;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getNightWork() {
		return nightWork;
	}

	public void setNightWork(Boolean nightWork) {
		this.nightWork = nightWork;
	}

	// 안 보여도 존재. 근데 '응애' 넣어야 되서 가시화 시킨 것
	public Person() {
		System.out.println("응애");

//		주의 사항 : Spring .. 등 자바 객체를 자동으로 만들어주는 등의 일을 할때 기본생성자를 사용
//		>>기본생성자를 빼면 에러가 생김
//		다른 프로그램 해주는? 이유들 때문에 그냥 만드는 것을 습관화
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		System.out.println("응애");
	}

}
