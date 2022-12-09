package overidding;
class parent3{
	void show() {
		System.out.println("grandparent show()");
		
	}
	
}
class child3 extends parent3{
	void show() {
		super.show();
		System.out.println("parent show()");
	}
}
class grandchild extends child3{

	void show() {
		super.show();
		
		System.out.println("child show()");
		
	}
}


public class over8 {

	public static void main(String[] args) {
		parent3 p2=new grandchild();
		p2.show();
		
	}

}
