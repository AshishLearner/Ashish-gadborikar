package abstraction;

abstract class like{
	public abstract void srj();
	
	public void sleep() {
		System.out.println("practice on abstraction");
	}
}

class reck extends like {
	public void srj() {
		System.out.println("its just practice"); 
	}
	
}
class neck extends reck{
	public void srj() {
		System.out.println("why do you practice");
	}
}

public class abspractice1 {

	public static void main(String[] args) {
		neck n=new neck();
		n.sleep();
		n.srj();
		reck r= new reck();
		r.sleep();
		r.srj();
		
	}

}
