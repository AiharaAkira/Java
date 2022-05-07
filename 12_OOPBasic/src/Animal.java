
public class Animal {
	
	private String type;
	private int age;
	public void move() {
		System.out.println(type + "가 움직입니다.");
	}
	
	
	
	public String getType() {
		
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if( age > 100) {
			this.age = 99;
		}else if(age < 0) {
			this.age = 0;
		}
		else {
			this.age = age;
		}
		
	}

	public void ageInfo() {
		System.out.println(type + "는 " + age +"개월");
	}
	
	
}
