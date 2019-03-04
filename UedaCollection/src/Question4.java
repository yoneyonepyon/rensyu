import java.util.ArrayList;
import java.util.Scanner;

// ArrayListへの追加(add size get)
public class Question4 {

	public static void main(String[] args) {
		ArrayList<String> inputs = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			String input = sc.nextLine();
			inputs.add(input);
		}

		for (int i = 0; i < inputs.size(); i++) {
			String string = inputs.get(i);
			System.out.println(string);
		}

		sc.close();
	}

}
