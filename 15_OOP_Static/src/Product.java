
public class Product {
	
	
	private static final String PRODUCTION = "�Ｚ";
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
		System.out.println("------��ǰ����---------");
		System.out.println("��ǰ��	:	" + productName);
		System.out.println("����	:	" + price + "����");
		System.out.println("������	:	" + PRODUCTION);
		
		System.out.println("----------------------");
		System.out.println("");
		
	}





	public static int getCount() {
		return count;
	}
	
	

}
