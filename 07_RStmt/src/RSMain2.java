

public class RSMain2 {

	public static void main(String[] args) {

		//���� ����
		
//		for(int i = 0; true; i++) {
//			System.out.println(i);
//		}
		
//		for (;;) {
//			System.out.println("ii");
//		}
		
		for(int i = 0; i < 3;) {
			i++;
			System.out.println("ll");
		}
		
		
//		while(true) {
//			System.out.println("hi");
//		}
		
		//break; ���� ��ġ���� ���� ����� ������ �Ǵ� �ݺ��� Ż��
		//���ѷ����� ������������ �극��ũ
		
		int a = 0;
		for(;;) {
			System.out.println(a);
			a++;
			
			if(a>10) {
				break;
			}
		}
		
		int b = 0;
		while(true) {
			System.out.println("while�� ���� ���� : " + b);
			b++;
			if(b>5) {
				System.out.println("break");
				break;
			}
		}
		
		
		
		

	}

}
