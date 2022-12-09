package constructor;

public class methodoverloading6 {

	public void test(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		// return sum;
	}

	public static void main(String[] args) {
		methodoverloading6 boj = new methodoverloading6();

		boj.test(9999999, 5555555);
	}

}
