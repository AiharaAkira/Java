
public class RS_Practice2 {

	public static void main(String[] args) {
		// �޷� ���� ���
		int j = 1;
		

		for (int i = 1; i <= 31; i++) {

			for (j = 1; j <= 12; j++) {
				
				if(j==2 && i>=29) {
					System.out.printf("\t\t");
					continue;
					
					
				}else if((j==4 && i>=31)||(j==6 && i>=31)||(j==9 && i>=31)) {
					System.out.printf("\t\t");
					continue;
				}else if(j==11 && i>=31) {
					System.out.printf("\t\t\t");
					continue;
				}
				System.out.printf("%d��%d��||\t\t", j, i);
				
				
			}

			System.out.println();

		}

	}

}
