package overidding;
class Animal1{
	public void move() {
		System.out.println(" Animal can move");
	}
}
class dog1 extends Animal1{
	public void move() {
		System.out.println("dogs can walk and run");
	}
	public void bark() {
		System.out.println("dogs can bark");
	}
}

public class over2 {

	public static void main(String[] args) {
		Animal1 a=new Animal1() ;
		a.move();
		dog1 d=new dog1();
		d.move();
		Animal1 a1=new Animal1();
		a1.move();
		//a1.bark(); compile time error
	}

}

 
