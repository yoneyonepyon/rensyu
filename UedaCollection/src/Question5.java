import java.util.ArrayList;
import java.util.Scanner;

// 拡張for文
public class Question5 {

	public static void main(String[] args) {
		ArrayList<String> inputs = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			String input = sc.nextLine();
			inputs.add(input);
		}

		for (String input : inputs) {
			System.out.println(input);
		}

		sc.close();
	}

}
