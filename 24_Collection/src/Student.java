
public class Student {

	private String name;
	private int age;
	private int eng;
	private int kr;
	private int jp;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String name, int age, int eng, int kr, int jp) {
		super();
		this.name = name;
		this.age = age;
		this.eng = eng;
		this.kr = kr;
		this.jp = jp;
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

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKr() {
		return kr;
	}

	public void setKr(int kr) {
		this.kr = kr;
	}

	public int getJp() {
		return jp;
	}

	public void setJp(int jp) {
		this.jp = jp;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(eng);
		System.out.println(kr);
		System.out.println(jp);
	}
	
}
