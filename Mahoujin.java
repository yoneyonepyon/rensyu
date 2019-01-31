
public class Mahoujin {
	public static void main(String[] args) {

		for (int a0 = 1; a0 < 9; a0++) {
			int a1 = 9;
			int b0 = 3;
			int c2 = 6;
			if (a0 == a1 || a0 == b0 || a0 == c2) {
				continue;
			}

			for (int a2 = 1; a2 < 9; a2++) {
				if (a2 == a1 || a2 == b0 || a2 == c2) {
					continue;
				}

				for (int b1 = 1; b1 < 9; b1++) {
					if (b1 == a1 || b1 == b0 || b1 == c2) {
						continue;
					}

					for (int b2 = 1; b2 < 9; b2++) {
						if (b2 == a1 || b2 == b0 || b2 == c2) {
							continue;
						}

						for (int c0 = 1; c0 < 9; c0++) {
							if (c0 == a1 || c0 == b0 || c0 == c2) {
								continue;
							}

							for (int c1 = 1; c1 < 9; c1++) {
								if (c1 == a1 || c1 == b0 || c1 == c2) {
									continue;
								}

								boolean x0 = a0 + a1 + a2 == 15;
								boolean x1 = b0 + b1 + b2 == 15;
								boolean x2 = c0 + c1 + c2 == 15;
								boolean y0 = a0 + b0 + c0 == 15;
								boolean y1 = a1 + b1 + c1 == 15;
								boolean y2 = a2 + b2 + c2 == 15;
								boolean xy = a0 + b1 + c2 == 15;
								boolean yx = a2 + b1 + c0 == 15;

								if (x0 && x1 && x2 && y0 && y1 && y2 && xy && yx) {
									System.out.println(a0 + "|" + a1 + "|" + a2);
									System.out.println("-+-+-");
									System.out.println(b0 + "|" + b1 + "|" + b2);
									System.out.println("-+-+-");
									System.out.println(c0 + "|" + c1 + "|" + c2);

									break;
								}
							}

						}

					}

				}

			}

		}

	}

}
