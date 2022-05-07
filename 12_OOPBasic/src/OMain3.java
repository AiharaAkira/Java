
public class OMain3 {

	public static void main(String[] args) {
		
		//쇼핑
		Item pen = new Item();
		
		pen.name = "형광펜";
		pen.price = 500;
		pen.source = "중국";
		//품명 가격 원산지 상품정보 출력가능
		pen.print();
		
		Item vodmaka = new Item();
		
		vodmaka.name = "보드마카";
		vodmaka.price = 1000;
		vodmaka.source = "한국";
		
		vodmaka.print();
		
		
	}

}
