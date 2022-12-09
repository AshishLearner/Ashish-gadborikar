package abstraction;
//absrtract class
abstract class animal{
	// absract methode does not have body
	public abstract void animalsound();
	//regular methode
	public void sleep() {
		System.out.println("zzzz");
	}
}
//subclass inherita from animal
 class pig extends animal{
	public void animalsound() {
		//the body of animalsound is provided here
		System.out.println(" the pig says wee weee");
	}
}
 //subclass inherit from animal
 class dog extends animal{
	 public void animalsound() {
		//the body of animalsound is provided here
		 System.out.println(" the dog says bow bow");
	 }
 }
public class abs1 {

	public static void main(String[] args) {
		pig p=new pig();
		p.animalsound();//the pig says wee weee
        p.sleep();//zzzz
		dog d = new dog();
		d.animalsound();//the dog says bow bo
		d.sleep();//zzzz
	}

}
