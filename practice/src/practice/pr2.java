package practice;
class A{
	int i= 10;
	A(){
		System.out.println("runing construcor A");
	}
	void display() {
		System.out.println("i am displaynig A()");
		}
class X {
	int j=15;
	X(){
		System.out.println("i am runing X");
	}
void display() {
		System.out.println("i am displaying consX()");
	}
}
		
	}
	

public class pr2 {
	void display() {
		System.out.println("i am displaying main class");
	}

	public static void main(String[] args) {
		System.out.println("main is started");
		A a1= new A();
		a1.display();	
		System.out.println("global variable is "+a1.i);
		System.out.println("class A is end");
		X x1= new X();
		x1.display();
		
		

	}

}
