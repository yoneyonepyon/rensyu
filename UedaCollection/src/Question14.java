import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// HashMapとArrayListの組み合わせ
public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, ArrayList<String>> list = new HashMap<>();
		ArrayList<String> item;

		// 北海道
		item = new ArrayList<>();
		item.add("じゃがいも");
		item.add("米");
		item.add("ジンギスカン");

		list.put("北海道", item);

		// 富山
		item = new ArrayList<>();
		item.add("マス寿司");
		item.add("米");
		item.add("ブリ");

		list.put("富山", item);

		// 東京
		item = new ArrayList<>();
		item.add("バナナ");
		item.add("人");
		item.add("魔都新宿");

		list.put("東京", item);

		for (Map.Entry<String, ArrayList<String>> hash : list.entrySet()) {
			System.out.println(hash.getKey() + "の名産物:");
			for (String name : hash.getValue()) {
				System.out.print(name + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
