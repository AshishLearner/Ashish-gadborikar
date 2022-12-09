package thisprogram;

class An {
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		this.n();
	}
}

public class this8 {
	void methode1() {
		System.out.println("inside the methodeone");
	}
	void methode2() {
		System.out.println("inside methode2");
		this.methode1();
	}

	public static void main(String[] args) {
		
		/*this8 m=new this8();
		m.methode2();*/
		An q=new An();
		q.n();
	}

}
