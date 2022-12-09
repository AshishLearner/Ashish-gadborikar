package inheritance;

class componey99 {
	int a;

	componey99() {
		a = 12;
		System.out.println("i am first construcor");
		System.out.println("the value of a is" +a);
	}

	componey99(int b) {
		this();
		System.out.println("i am second cons");

	}

	public void set() {
		System.out.println("start methodeoverloading");
	}

	public void rest(int d) {
		System.out.println("overloading end");
		this.set();
	}
}

class employe45 extends componey99 {

}

public class classassignment {

	public static void main(String[] args) {
		componey99 c1 = new componey99(10);
		//c1.set();
		c1.rest(56);

	}

}