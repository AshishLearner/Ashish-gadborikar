package overidding;

class Animal{
	public void move() {
		System.out.println(" Animal can move");
	}
}
class dog extends Animal{
	public void move() {
		System.out.println("dogs can walk and run");
	}
}

public class over1 {

	public static void main(String[] args) {
		Animal a=new Animal() ;
		a.move();
		dog d=new dog();
		d.move();
	

	}

}
