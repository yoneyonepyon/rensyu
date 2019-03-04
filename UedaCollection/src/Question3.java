import java.util.Scanner;

// 配列のサイズを小さくしよう
public class Question3 {

	public static void main(String[] args) {
		String[] inputs = new String[5];
		int i = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			String input = sc.nextLine();

			if (input.equals("e")) {
				break;
			} else if (input.equals("d")) {
				--i;
				inputs[i] = null;
				if (i % 5 == 0) {
					inputs = delArray(inputs);
				}
			} else {
				inputs[i] = input;
				++i;
				if (i % 5 == 0) {
					inputs = addArray(inputs);
				}
			}
		}

		for (String input : inputs) {
			if (input != null) {
				System.out.println(input);
			}
		}

		sc.close();
	}

	// 引数の配列のサイズを5ずつ増やしていく
	private static String[] addArray(String[] inputs) {
		String[] newArray = new String[inputs.length + 5];

		for (int i = 0; i < inputs.length; i++) {
			newArray[i] = inputs[i];
		}

		return newArray;
	}

	// 引数の配列のサイズを5減らす
	private static String[] delArray(String[] inputs) {
		String[] newArray = new String[inputs.length - 5];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = inputs[i];
		}

		return newArray;
	}

}
