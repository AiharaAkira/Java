
public class Product {
	
	
	private static final String PRODUCTION = "삼성";
	private int price;
	private String productName;
	private static int count;
	
	
	
	
	
	
	public Product(int price, String productName) {
		super();
		this.price = price;
		this.productName = productName;
		count = getCount() + 1;
		
	}
	
	



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getProductName() {
		return productName;
	}






	public String getProduction() {
		return PRODUCTION;
	}
	
	



	public void info() {
		System.out.println("------상품정보---------");
		System.out.println("제품명	:	" + productName);
		System.out.println("가격	:	" + price + "만원");
		System.out.println("제조사	:	" + PRODUCTION);
		
		System.out.println("----------------------");
		System.out.println("");
		
	}





	public static int getCount() {
		return count;
	}
	
	

}
