
public class OMain2 {

	public static void main(String[] args) {
		// 삼성
		// Galaxy

		/*
		 * 1.'직접'접근 안되게 2.제조사 상수 3.품명 : 갤럭시 1 가격 50 제조사 오버로딩생성자로 생성 // 상품정보 출력 기능 3.품명 :
		 * 갤럭시 2 가격 150 제조사 // 상품정보 출력 기능 3.품명 : 갤럭시 3 가격 250 제조사 // 상품정보 출력 기능
		 * 
		 * 갤럭시 3 가격 조정 250 >> 180 상품정보 출력 현재 생산된 폰 총 대수
		 */

		Product gal1 = new Product(50, "갤럭시1");
		gal1.info();
		
		Product gal2 = new Product(150, "갤럭시2");
		gal2.info();
		
		Product gal3 = new Product(250, "갤럭시3");
		gal3.info();
		
		gal3.setPrice(180);
		gal3.info();
		
		System.out.println("휴대폰 수 : " + Product.getCount() + "대");

	}

}
