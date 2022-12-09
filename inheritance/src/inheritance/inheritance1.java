package inheritance;
class A{
	static int a=20;
	int b=10;
	double c=13.45;
}
class B{
	static int x=58;
	int y=15;
	double z=19.45;
}
class C{
	static int p=80;
	int q=69;
	double r=96.85;
}
public class inheritance1 {
	
	public static void main(String[]args) {
	// accesss static member A member//
		System.out.println("class A static variable :"+A.a);
		System.out.println("class B static variable :"+B.x);
		System.out.println("class C static variable :"+C.p);
		// acess non static variable//
		A a1=new A();
			System.out.println("non statis member of class A"+a1.b);
			System.out.println("non statis member of class A"+a1.c);
		B b1=new B();
		System.out.println("non statis member of class B"+b1.y);
		System.out.println("non statis member of class B"+b1.z);
		C c1=new C();
		System.out.println("non statis member of class C"+c1.q);
		System.out.println("non statis member of class C"+c1.r);
			
		
}
	
}
