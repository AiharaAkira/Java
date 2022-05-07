import java.util.Random;

public class IAMain3 {

	public static void main(String[] args) {
		
		//·£´ý ¼ýÀÚ Â¦¼ö¸¸
		Random r = new Random();
		int a = r.nextInt(5);
		if(a % 2 == 0) {
			System.out.println(a);
		}
		System.out.println("----------------------------");
		// Â¦¼ö¸¸ ·£´ýÀ¸·Î »Ì¾ÆÁÖ´Â ¹Ú½º°´Ã¼
		Box b = new Box();
		System.out.println(b.nextInt(3));
		
	}

}
