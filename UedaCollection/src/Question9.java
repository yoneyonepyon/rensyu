import java.util.ArrayList;
import java.util.Scanner;

// 指定要素の確認(contains)
public class Question9 {

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

		String input = sc.nextLine();
		boolean isContain = inputs.contains(input);

		System.out.println(isContain);

		sc.close();
	}

}
