
public abstract class Hero {
//	추상클래스는 객체생성 불가
	String name;

	public Hero() {
	}

	public Hero(String name) {
		super();
		this.name = name;
	}

	abstract void attack();
}

 class SuperMan extends Hero {
	public SuperMan() {
		// TODO Auto-generated constructor stub
	}
	
	public SuperMan(String name) {
		super();
		this.name = name;
	}
	
	@Override
	void attack() {
		System.out.println("아이레이저 공격");
	}
}

class IronMan extends Hero {
	
	public IronMan() {
		// TODO Auto-generated constructor stub
	}
	
	public IronMan(String name) {
		super();
		this.name = name;
	}
	@Override
	void attack() {
		System.out.println("아이언맨 공격");
	}
}

class Hulk extends Hero {
public Hulk() {
	// TODO Auto-generated constructor stub
}	
	
	public Hulk(String name) {
		super();
		this.name = name;
	}
	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("헐크 공격");
	}
}
