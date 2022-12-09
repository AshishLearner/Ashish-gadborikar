package casting;

public class sample {
	void test1(double d) {
		System.out.println(" value of d  is "+d);
	}
	void test1(int i) {
		System.out.println("value of i is "+i);
	}

	public static void main(String[] args) {
		System.out.println("program start from here");
		sample s= new sample();
		s.test1(1.0);
		System.out.println("program Ends");

	}

}
