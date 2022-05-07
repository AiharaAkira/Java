
public class ICMAin {

	public static void main(String[] args) {
		
		//스포츠카 
		//모델명, 넘버 > 정보출력
		Car sportsCar =  new Car("페라리", "10가1036");
		sportsCar.info();
		
		//택시
		//모델명, 넘버, 기본료 > 정보 출력
		Taxi taxi = new Taxi("개인택시", "46가1034", 1000);
		taxi.info();
		
		
		
		//버스
		//모델명, 넘버, 노선번호 > 정보출력
		Bus bus = new Bus("마을버스", "31가1234", "101번");
		bus.info();
//		인스턴스 생성시 생성자에 파리미터 포함
//		모든 필드는 직접 접근 안되게

	}

}
