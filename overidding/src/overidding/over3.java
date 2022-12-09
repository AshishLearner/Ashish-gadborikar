package overidding;

class human{
	public void eat() {
		System.out.println("human is eating");
	}
}
class boy extends human{
	public void eat() {
		System.out.println("boy is eating");
		//super.eat(); for explicitely wans parent class methode
	}
}
public class over3 {

	public static void main(String[] args) {
		boy b=new boy();
		b.eat();
	

	}

}
