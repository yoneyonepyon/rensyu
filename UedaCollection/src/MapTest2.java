import java.util.ArrayList;

public class MapTest2 {

	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();

		array1.add("ゴクウ");
		array1.add("べジータ");

		array2.add("ボージャック");
		array2.add("ザンギャ");
		array2.add("ビドー");
		array2.add("ブージン");

		array3.add("ゴクウ");
		array3.add("べジータ");

		if (array1.equals(array2)) {
			System.out.println("Z戦士と銀河戦士は同じだったんだ…");
		} else {
			System.out.println("Z戦士と銀河戦士が同じわけがない！");
		}

		if (array1.equals(array3)) {
			System.out.println("Z戦士はZ戦士だった");
		} else {
			System.out.println("Z戦士がZ戦士ではない…？");
		}
	}

}
