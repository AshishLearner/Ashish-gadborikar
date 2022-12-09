package inheritance;
class vehicle{
	
	public void first() {
		System.out.println("i am parent of all");
	}
	
	}
class bike extends vehicle{
	
	public void second() {
		System.out.println("i am bike and has two wheels");
	}
}
class car1 extends vehicle {
	public void third() {
		System.out.println("i am car and i have 4 wheels");
	}
}
class auto extends vehicle{
	public void fourth() {
		System.out.println(" i am auto having 3 wheels");
	}
}
public class inheriyance5 {

	public static void main(String[] args) {
		bike b=new bike();
		b.second();
		b.first();
		car1 c=new car1();
		c.third();
		c.first();
		auto a=new auto();
		a.fourth();
		a.first();
		
		
		

	}

}
