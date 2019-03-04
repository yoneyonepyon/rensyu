// MyGenericsはどんな型でも受け取れるようにしたい
public class MyGenerics<T> {

	// 型パラメータを適用する箇所に変数のデータ型としてTを宣言
	private T value;

	// 型パラメータを適用する箇所に変数のデータ型としてTを宣言
	public void setValue(T value) {
		this.value = value;
	}

	// 型パラメータを適用する箇所に変数のデータ型としてTを宣言
	public T getValue() {
		return value;
	}

	public static void main(String[] args) {
		MyGenerics<String> g1 = new MyGenerics<>();
		MyGenerics<Integer> g2 = new MyGenerics<>();

		g1.setValue("123");
		g2.setValue(123);

		System.out.println(g1.getValue());
		System.out.println(g2.getValue());
	}

}
