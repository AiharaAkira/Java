import java.util.Random;

public class IAMain3 {

	public static void main(String[] args) {
		
		//���� ���� ¦����
		Random r = new Random();
		int a = r.nextInt(5);
		if(a % 2 == 0) {
			System.out.println(a);
		}
		System.out.println("----------------------------");
		// ¦���� �������� �̾��ִ� �ڽ���ü
		Box b = new Box();
		System.out.println(b.nextInt(3));
		
	}

}
