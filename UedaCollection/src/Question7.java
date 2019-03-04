import java.util.ArrayList;
import java.util.Scanner;

// 入力の削除 (remove)
public class Question7 {

	public static void main(String[] args) {
		ArrayList<String> inputs = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.nextLine();

			if (input.equals("end")) {
				break;
			} else if (input.equals("del")) {
				int index = inputs.size();
				if (index > 0) {
					inputs.remove(index - 1);
				}
			} else {
				inputs.add(input);
			}
		}

		for (String input : inputs) {
			System.out.println(input);
		}

		sc.close();
	}

}
