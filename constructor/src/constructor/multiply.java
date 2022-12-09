package constructor;

public class multiply {
	multiply(){
		System.out.println("zero para cons");
	}
	void mul(int a, int b) {
		System.out.println("sum of two no = "+(a+b));
	}
	void mul(int a ,int b, int c) {
		System.out.println("sum of three no ="+(a+b+c));
	}
	public static void main(String[] args) {
		multiply m=new multiply();
		m.mul(4,8);
		m.mul(6,8,6);
		

	}

}
