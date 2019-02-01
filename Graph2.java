public class Graph2 {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		while (true) {
			i = i < 10 ? i + 1 : 0;
			Thread.sleep(100);
			printGraph(i);
		}
	}

	private static void printGraph(int n) {
		for (int i = 0; i < 10; i++) {
			if (n > i) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}

		}
		System.out.print('\r');
	}

}
