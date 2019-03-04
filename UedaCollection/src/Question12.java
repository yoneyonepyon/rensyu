import java.util.HashSet;
import java.util.Scanner;

// HashSetの使い方(remove)
public class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<String> inputs = new HashSet<String>();

		inputs.add("Sapporo");
		inputs.add("beef");
		inputs.add("milk");
		inputs.add("123");

		inputs.remove(sc.nextLine());

		for (String input : inputs) {
			System.out.println(input);
		}

		sc.close();
	}

}
