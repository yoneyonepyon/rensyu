import java.util.ArrayList;
import java.util.Scanner;

// Integer型への変換(ラッパークラス)
public class Question8 {

	public static void main(String[] args) {
		ArrayList<Integer> inputs = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			Integer input = sc.nextInt();

			if (input == -9) {
				break;
			} else if (input == -1) {
				int index = inputs.size();
				if (index > 0) {
					inputs.remove(index - 1);
				}
			} else {
				inputs.add(input);
			}
		}

		for (Integer input : inputs) {
			System.out.println(input);
		}

		sc.close();
	}

}
