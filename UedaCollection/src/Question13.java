import java.util.HashMap;
import java.util.Scanner;

// HashMapの使い方(put)
public class Question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> inputs = new HashMap<>();

		while (true) {
			String input = sc.nextLine();

			if (input.equals("end")) {
				break;
			}

			Integer v = inputs.get(input);

			if (v == null) {
				v = 0;
			}

			inputs.put(input, v + 1);
		}

		for (String key : inputs.keySet()) {
			System.out.println(key + ": " + inputs.get(key));
		}

		sc.close();
	}

}
