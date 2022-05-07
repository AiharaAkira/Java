
public class IAMain2 {

	public static void main(String[] args) {
		//필드 직접 x
		//나중에 값 o , 생성때 o 
		
		//컴퓨터 : 이름, 가격, cpu, ram, hdd
		Computer c = new Computer("sambo", 130, 11, 12.5, 11.1);
		
	
		
		//슈클 필드가 다 private 걸려있어서 상속이 안될텐데 어떻게 값 세팅되지?
	
		//우선, setter는 접근제어자가 public 이고
		//가격과 이름은 product 클래스에서 setter가존재하며
		//컴퓨터 클래스가 product 클래스를 상속받기 때문에
		//product클래스에 있는 setter 메소드가 발동
		
		//정보출력
		c.info();
		
		//볼펜 : 이름, 가격, 컬러
		Ballpen b = new Ballpen("Monami", 1500, "red");
		//정보출력
		b.info();
		
		//노트북 : 이름, 가격, 무게, 배터리, 용량
		//정보출력
		NoteBook1 n = new NoteBook1("MSI", 100, 7.3, 5.5, 500);
		n.setCost(80);
		n.info();
		
		

	}

}
