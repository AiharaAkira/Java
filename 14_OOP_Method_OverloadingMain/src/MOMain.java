
public class MOMain {
	
	

	public static void main(String[] args) {
		
		Cal c = new Cal();
		c.add(10, 20);
		System.out.println("---------------------------");
		
		// 정수 3개 넣어서 합을 출력
		c.add(10, 20, 30);
		
		//정수 4개 합
		c.add(10, 20, 30, 40);
		
		//실수 2개 합
		c.add(1.0, 2.0);
		
		//실수 3개 합
		c.add(1.0, 2.0, 3.0);
		
		// 정수를 몇개 넣든 다 더해주는 메소드
		c.add_free(1, 2, 3, 4, 5);
		
		//정수를 몇개 넣든 다 곱해주는 메소드
		c.multiplies_free(1, 2, 3, 4, 5);

	}

}
