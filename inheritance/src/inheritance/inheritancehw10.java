package inheritance;

class componey {
	void display() {
		System.out.println("i am compney class");
	}

}

class employe extends componey {
	void display() {
		System.out.println("i am employe class");
	}

	void callme() {
		System.out.println("i am employee class of call me");
	}
}

public class inheritancehw10 {

	public static void main(String[] args) {
		employe e = new employe();
		e.display();//i am employe class
		e.callme();//i am employee class of call me
		System.out.println("*****************************");
		componey c = new componey();
		c.display();//i am compney class
		System.out.println("*************************");
		componey c2 = new employe();
		c2.display();//i am compney class---my expected output

	}

}
