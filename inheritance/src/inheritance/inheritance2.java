package inheritance;
//superclass or parent class
class A1{
	static int a=20;
	int b=10;
	double c=13.45;
}
//subclass or child class B1 inheritance class A1 non static member (variable and methode)
class B1 extends A1{
	static int x=58;
	int y=15;
	double z=19.45;
	//class A1 non static member
	//in b=10
	//double c=13.45
	
// c1 inherites class b1 non satic members 
}
class C1 extends B1 {
	static int p=80;
	int q=69;
	double r=96.85;
	//class B1 non static member
	//int y=15;
	//double z=19.45;
	//class A1 non static member
	//in b=10
	//double c=13.45
}
public class inheritance2 {
	
	public static void main(String[]args) {
		
		// accesss static member A member//
				System.out.println("class A static variable :"+A.a);
				System.out.println("class B static variable :"+B.x);
				System.out.println("class C static variable :"+C.p);
				//to acess non static member
				C1 c =new C1();
				System.out.println("non static member od class A1 "+c.b);
				System.out.println("non static member od class A1 "+c.c);
				System.out.println("non static member od class B1 "+c.y);
				System.out.println("non static member od class B1  "+c.z);
				System.out.println("non static member od class C1 "+c.q);
				System.out.println("non static member od class C1 "+c.r);
	}
	}