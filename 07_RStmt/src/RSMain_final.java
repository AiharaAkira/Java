
public class RSMain_final {

	public static void main(String[] args) {
		// 세로
		for (int i = 1; i <= 31; i++) {
			for (int j = 1; j <= 12; j++) {
				
				if (j == 2 && i >= 29) {
					System.out.printf("\t\t");
					continue;
				} else if ((j == 4 && i >= 31) || (j == 6 && i >= 31) || (j == 9 && i >= 31)) {
					System.out.printf("\t\t");
					continue;
				} else if ((j == 11 && i >= 31)) {
					System.out.printf("\t\t\t");
					continue;
				}

				if (i <= 9) {
					System.out.printf(" ");
				}

				System.out.printf("%d월%d일||\t\t", j, i);
			}
			System.out.println();
		}

	}

}
