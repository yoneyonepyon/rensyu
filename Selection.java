import java.util.Random;

/*
 *  3つの数値をランダムに出して、それを選択ソートする
 *  (記憶を頼りに)
 */
public class Selection {

	public static void main(String[] args) {
		Random r = new Random();
		
		int max1 = r.nextInt(100);
		int max2 = r.nextInt(100);
		int max3 = r.nextInt(100);
		int temp;
		
		System.out.println("初期値: " + max1 + ", " + max2 + ", " + max3);
		
		if (max2 > max1) {
			temp = max1;
			max1 = max2;
			max2 = temp;
		}

		if (max3 > max2) {
			temp = max2;
			max2 = max3;
			max3 = temp;
		}

		if (max2 > max1) {
			temp = max1;
			max1 = max2;
			max2 = temp;
		}

		
		System.out.println("変更後: " + max1 + ", " + max2 + ", " + max3);		
		
	}

}
