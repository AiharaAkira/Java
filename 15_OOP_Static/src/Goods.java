
public class Goods {

	private String productName;
	private int price;
	private static final String MAKER = "����";

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
		System.out.println("ǰ�� : " + productName);
		System.out.println("���� : " + price);
		System.out.println("������ : " + MAKER);
	}

}
