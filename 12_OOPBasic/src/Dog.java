
public class Dog {

	//필드 선언(속성)
	String name;	// 멤버 변수
	int age;
	double weight;
	
	//기능
	public static void bark() {
		System.out.println("멍");
	}
	
	void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
	}
	
}
