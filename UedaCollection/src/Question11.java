import java.util.HashSet;
import java.util.Scanner;

// HashSetの使い方(contain)
public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<String> inputs = new HashSet<String>();

		inputs.add("Sapporo");
		inputs.add("beef");
		inputs.add("milk");
		inputs.add("123");

		String input = sc.nextLine();

		System.out.println(inputs.contains(input));

		sc.close();
	}

}
