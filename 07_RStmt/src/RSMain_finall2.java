
public class RSMain_finall2 {

	public static void main(String[] args) {
		// ����
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 31; j++) {
				if (i == 2 && j >= 29) {
					System.out.printf("\t\t");
					continue;
				} else if ((i == 4 && j >= 31) || (i == 6 && j >= 31) || (i == 9 && j >= 31)) {
					System.out.printf("\t\t");
					continue;
				} else if ((i == 11 && j >= 31)) {
					System.out.printf("\t\t\t");
					continue;
				}

				if (i <= 9) {
					System.out.print(" ");
				}
				System.out.printf("%d��%d��||\t\t", i, j);
			}
			System.out.println();
		}

	}

}
