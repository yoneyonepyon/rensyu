
public class Mahoujin {
	public static void main(String[] args) {

		int a1 = 9;
		int b0 = 3;
		int c2 = 6;

		for (int i = 0; i < Math.pow(9, 6); i++) {
			int a0 = i % 9 + 1;
			int a2 = i / (int) Math.pow(9, 1) % 9 + 1;
			int b1 = i / (int) Math.pow(9, 2) % 9 + 1;
			int b2 = i / (int) Math.pow(9, 3) % 9 + 1;
			int c0 = i / (int) Math.pow(9, 4) % 9 + 1;
			int c1 = i / (int) Math.pow(9, 5) % 9 + 1;

			boolean x0 = a0 + a1 + a2 == 15;
			boolean x1 = b0 + b1 + b2 == 15;
			boolean x2 = c0 + c1 + c2 == 15;
			boolean y0 = a0 + b0 + c0 == 15;
			boolean y1 = a1 + b1 + c1 == 15;
			boolean y2 = a2 + b2 + c2 == 15;
			boolean xy = a0 + b1 + c2 == 15;
			boolean yx = a2 + b1 + c0 == 15;

			if (x0 && x1 && x2 && y0 && y1 && y2 && xy && yx) {
				System.out.println("" + a0 + a1 + a2);
				System.out.println("" + b0 + b1 + b2);
				System.out.println("" + c0 + c1 + c2);
				break;
			}
		}

	}

}
