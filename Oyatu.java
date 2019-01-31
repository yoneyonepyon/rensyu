
public class Oyatu {

	public static void main(String[] args) {
		int okasi = 6;
		int max_happiness = 0;
		String fake_list = "";
		int happiness = 0;

		for (int i = 0; i < Math.pow(2, okasi); i++) {
			int balance = 0;
			happiness = 0;

			int u = i / 32 % 2;
			int v = i / 16 % 2;
			int w = i / 8 % 2;
			int x = i / 4 % 2;
			int y = i / 2 % 2;
			int z = i % 2;

			// potato chips
			if (u > 0) {
				balance += 100;
				happiness += 5;
			}
			// potato chips
			if (v > 0) {
				balance += 130;
				happiness += 7;
			}
			// marshmallow
			if (w > 0) {
				balance += 80;
				happiness += 4;
			}
			// candy
			if (x > 0) {
				balance += 50;
				happiness += 2;
			}
			// gum
			if (y > 0) {
				balance += 70;
				happiness += 3;
			}
			// osenbay
			if (z > 0) {
				balance += 110;
				happiness += 6;
			}

			if (balance <= 300 && happiness == max_happiness) {
				fake_list = "" + u + v + w + x + y + z;
			} else if (balance <= 300 && happiness > max_happiness) {
				max_happiness = happiness;
				fake_list += "|" + u + v + w + x + y + z;
			}
		}

		int pt = 0;

		for (int i = 0; i < fake_list.length(); i++) {
			char sign = fake_list.charAt(i);
			if (sign == '|') {
				pt = 0;
				System.out.println();
			} else if (sign == '1') {
				switch (pt) {
				case 0:
					System.out.println("ポテトチップス1袋");
					break;
				case 1:
					System.out.println("チョコレート1枚");
					break;
				case 2:
					System.out.println("マシュマロ1袋");
					break;
				case 3:
					System.out.println("飴1個");
					break;
				case 4:
					System.out.println("ガム1箱");
					break;
				case 5:
					System.out.println("せんべい1袋");
					break;

				default:
					break;
				}
			}
			pt++;
		}

		System.out.println("満足度 = " + happiness);
	}

}
