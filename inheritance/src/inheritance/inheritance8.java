package inheritance;

//parent class
class fruitss {
	int fruitsage = 7;

	fruitss() {
		System.out.println("fruitss clas cons");

	}

	public void taste() {
		System.out.println("fruitss are sweets");
	}
}

class orange extends fruitss {
	int fruitsage;

	orange() {
		// super(); default if we not write it java compiler will write
		System.out.println("orange class cons");
	}

	public void shape() {
		System.out.println("orange is round");
		System.out.println("orange fruitage:" + fruitsage);
		System.out.println("fruits fruitage:" + super.fruitsage);
		super.taste();

	}
}

public class inheritance8 {
	public static void main(String[] args) {
		System.out.println("*************************************");
		orange o = new orange();
		o.shape();
	//	o.taste();

	}

}
