package constructor;

class A{
	int i=0;
	A(){
		System.out.println("runing class A construcor");
	}

void display() {
	System.out.println("i am display of class A");
}
class X{
	int j=10;
	X(){
		System.out.println("runing class X constructor");
	}
void display() {
	System.out.println("i am display of class X");
}
}

public class cons5 {
	void display() {
		System.out.println(" i am display of cons5");
	}

	public  void main(String args[]) {
		System.out.println("main () of class is started");
		A a1=new A();
		a1.display();
		System.out.println("class A global varibale i= "+a1.i);
		X x1 = new X();
		x1.display();
		System.out.println("class X global variable j= "+x1.j);
		cons5 c5= new cons5();
		c5.display();
		System.out.println("main () of class is end here");
	}

}
}
