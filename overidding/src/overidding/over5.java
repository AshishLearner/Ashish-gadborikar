package overidding;
class parent{
	void show() {
		System.out.println("parents show()");
		
	}
	
}
class child extends parent{
	void show() {
		System.out.println("child show()");
	}
}

public class over5 {

	public static void main(String[] args) {
		parent p = new parent();
		p.show();
		child c= new child();
		c.show();

	}

}
