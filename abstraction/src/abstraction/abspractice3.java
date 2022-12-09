package abstraction;

abstract class bike2{
	abstract void run();
	 void speed(int spd) {
		 System.out.println("biks spped: "+spd);
	 }
}
class twowheeler extends bike2{
	void run() {
		System.out.println("runing slowly"); 
	}
	void colour() {
		System.out.println("colour is red"); 
	}
	/*void speed(int spd) {
		System.out.println("speed should be "+spd);
*/	
	//}
}


public class abspractice3 {

	public static void main(String[] args) {
		/*twowheeler t=new twowheeler();
		t.run();
		t.speed(40);
		t.colour();*/
		bike2 b2=new twowheeler();
		b2.speed(50);
	//	b2.run();
		
		

	}

}
