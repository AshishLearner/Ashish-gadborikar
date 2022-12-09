package overidding;

class parent2{
	static void m1() {
		System.out.println("from parent "+ "static m1()");
		}
	void m2() {
		System.out.println("from parent " + "bon static m2");
		
	}
	
}
class child2 extends parent2{
	static void m1() {
		System.out.println("from child static m1()");
	}
	void m2() {
		
		System.out.println("from child " + "non static (instance)m2 ");
		//super.m2();
	}
}

public class over7 {

	public static void main(String[] args) {
		parent2.m1();
		parent2 m2=new child2();
		m2.m1();//since static methode can not be overite it calls parent m1()
		m2.m2();
		

	}

}
