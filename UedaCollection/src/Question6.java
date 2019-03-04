import java.util.ArrayList;
import java.util.Scanner;

// キー入力の終了
public class Question6 {

	public static void main(String[] args) {
		ArrayList<String> inputs = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.nextLine();

			if (input.equals("end")) {
				break;
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
