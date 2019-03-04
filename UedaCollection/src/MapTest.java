import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		String key = null; // キー保存用
		ArrayList<String> array; // 配列保存用
		Map<String, ArrayList<String>> hm = new HashMap<>();

		key = "Z戦士";
		array = new ArrayList<>(); // インスタンスを作成
		array.add("ゴクウ");
		array.add("べジータ");
		hm.put(key, array); // mapに要素を入力

		key = "銀河戦士";
		array = new ArrayList<>(); // インスタンスを作成
		array.add("ボージャック");
		array.add("ザンギャ");
		array.add("ビドー");
		array.add("ブージン");
		hm.put(key, array); // mapに要素を入力

		for (String dat : hm.keySet()) {
			System.out.print("キー: " + dat);
			array = hm.get(dat);
			System.out.print(" 値:");
			for (String get : array) {
				System.out.print(get + " ");
			}
			System.out.println();
		}
	}

}
