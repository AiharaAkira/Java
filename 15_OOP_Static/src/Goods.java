
public class Goods {

	private String productName;
	private int price;
	private static final String MAKER = "애플";

	public Goods() {
		
	}

	public String getProductName() {
		return productName;
	}



	public int getPrice() {
		return price;
	}

	
	
	

	public static String getMaker() {
		return MAKER;
	}

	public Goods(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
		
	}
	
	public void info() {
		System.out.println("품명 : " + productName);
		System.out.println("가격 : " + price);
		System.out.println("제조사 : " + MAKER);
	}

}
