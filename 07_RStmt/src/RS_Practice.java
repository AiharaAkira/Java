
public class RS_Practice {

	public static void main(String[] args) {

		// 2중포문을 써서 구구단

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}

		// 저건데 가로로

		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {

				System.out.printf("%d x %d = %d\t", j, i, i * j);

			}
			System.out.println();
		}

	}

}
