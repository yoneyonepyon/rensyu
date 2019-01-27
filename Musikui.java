
public class Musikui {
	public static void main(String[] args) {
		int[][] answers = new int[100][100];
		// 左辺でかける数
		for (int i = 10; i < 100; i++) {
			// こっちは右辺
			for (int j = 10; j < 100; j++) {
				if (j < 20 || j >= 30) {
					// 左辺の十の位が2以外のものは除外
					continue;
				} else if (((i * j) / 10) % 10 != 3) {
					// 答えの10の位が3じゃないものは除外
					continue;
				} else if ((i * j) < 1000) {
					// 答えが3桁の時は除外
					continue;
				} else if (((i * 2) / 10) % 10 != 1) {
					// 筆算の10の位が1以外の時は除外
					continue;
				} else {
					answers[i][j] = j;
				}
			}
		}

		// 結果を取り出す
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] > 0) {
					System.out.println("解答: " + i + " " + j + "(" + i * j + ")");
				}
			}
		}
	}
}
