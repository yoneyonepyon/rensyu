public class Mahoujin {

	// わからない箇所は0として扱う
	private static int[][] matrix = { { 0, 9, 0 }, { 3, 0, 0 }, { 0, 0, 6 } };

	public static void main(String[] args) {

		for (int a0 = 0; a0 < args.length; a0++) {
			if (a0 == 3 || a0 == 6 || a0 == 9) {
				continue;
			}
			matrix[0][0] = a0;

			for (int a2 = 0; a2 < args.length; a2++) {
				if (a0 == 3 || a0 == 6 || a0 == 9) {
					continue;
				}
				matrix[0][2] = a2;

				for (int a0 = 0; a0 < args.length; a0++) {
					if (a0 == 3 || a0 == 6 || a0 == 9) {
						continue;
					}
					matrix[0][0] = a0;

				}

			}

		}

	}

}
