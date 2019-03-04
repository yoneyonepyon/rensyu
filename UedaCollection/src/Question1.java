import java.util.Scanner;

// 配列を思い出そう
public class Question1 {

	public static void main(String[] args) {
		String[] inputs = new String[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < inputs.length; i++) {
			String input = sc.nextLine();
			if (input.equals("e")) {
				break;
			}
			inputs[i] = input;
		}

		for (String input : inputs) {
			if (input != null) {
				System.out.println(input);
			}
		}

		sc.close();
	}

}
