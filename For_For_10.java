public class For_For_10 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int k = 9 - i;
			int l = 9 + i;
			int m = (i + 1) % 10;
			int n = 0;
			for (int j = 0; j < 19; j++) {
				if (k == j || j == l) {
					System.out.print("*");
				} else if (k <= j && j <= l) {
					if (n++ % 2 == 0) {
						System.out.print(m);
						m = (m + 1) % 10;
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
			int m = i + 1; // d中に表示するもの
			int n = 0; // tトグル
			for (int j = 0; j < 18; j++) {
				if (k == j || j == l) {
					System.out.print("*");
				} else if (k <= j && j <= l) {
					if (n++ % 2 == 0) {
						System.out.print(m);
						m = (m + 1) % 10;
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
