
public abstract class Hero {
//	�߻�Ŭ������ ��ü���� �Ұ�
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
		System.out.println("���̷����� ����");
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
		System.out.println("���̾�� ����");
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
		System.out.println("��ũ ����");
	}
}
