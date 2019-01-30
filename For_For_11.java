public class For_For_11 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int k = 9 - i;
			int l = 9 + i;
			int m = 0;
			int n = 0;
			for (int j = 0; j < 19; j++) {
				if (k == j || j == l) {
					System.out.print("*");
				} else if (k <= j && j <= l) {
					if (n++ % 2 != 0) {
						if (j > 9) {
							m--;
						}

						switch (m) {
						case 0:
							System.out.print("=");
							break;
						case 1:
							System.out.print("+");
							break;
						case 2:
							System.out.print("!");
							break;
						case 3:
							System.out.print("^");
							break;
						}

						if (j < 9) {
							m++;
						}
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 8; i >= 0; i--) {
			int k = 9 - i;
			int l = 9 + i;
			int m = 0; // d中に表示するもの
			int n = 0; // tトグル
			for (int j = 0; j < 18; j++) {
				if (k == j || j == l) {
					System.out.print("*");
				} else if (k <= j && j <= l) {
					if (n++ % 2 != 0) {
						if (j > 9) {
							m--;
						}

						switch (m) {
						case 0:
							System.out.print("=");
							break;
						case 1:
							System.out.print("+");
							break;
						case 2:
							System.out.print("!");
							break;
						case 3:
							System.out.print("^");
							break;
						}

						if (j < 9) {
							m++;
						}
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
