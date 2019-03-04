import java.util.HashSet;
import java.util.Scanner;

// HashSetの使い方(add)
public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<String> inputs = new HashSet<String>();

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
