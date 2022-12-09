package inheritance;
class fruitA{

	int fr;
	fruitA(){
		fr=7;
		System.out.println("fruitA class cons");
	}
	public void tase() {
		System.out.println("fruits are sweets");
	}
}
class mango extends fruitA{
	int fr;
	mango(){
		fr=10;
		System.out.println("mango constructor");
	}
	public void taste() {
		System.out.println("mango are tart in taste");
	}
	public void rest() {
		System.out.println("mango is round");
	}
}
public class inheritancehw9 {

	public static void main(String[] args) {
		System.out.println("****************");
		mango m1=new mango();
		m1.rest();
		m1.taste();
		System.out.println(m1.fr);
		fruitA f1 = new fruitA();
		f1.tase();
		System.out.println(f1.fr);

	}

}
