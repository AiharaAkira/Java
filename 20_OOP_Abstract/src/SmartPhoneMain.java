class Iphone extends Phone{
	public Iphone(String model, String color, int price, double weight) {
		super();
		this.color = color;
		this.model = model;
		this.price = price;
		this.weight = weight;
	}
	
	@Override
	public void info() {
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
		System.out.println(weight);
	}
}


public class SmartPhoneMain {

	public static void main(String[] args) {
		//모델명,컬러,가격,무게
//		정보출력(강제)
		
		//스마트폰
		
		
		//기능 전화/sns/인터넷/게임
		
		//아이폰
		Iphone iphone = new Iphone("iphone", "blue", 100, 5.2);
		iphone.info();
		
		//갤럭시
		
	}

}
