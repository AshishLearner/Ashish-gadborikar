package abstraction;

abstract class bike{
	abstract void run();
	void speed(int spd) {
		System.out.println("bike speed :"+spd);
	}
}
class honda extends bike{
	void run() {
		System.out.println("runing safely");
		
	}
	void speed(int spd) {
		System.out.println("honda speed:"+spd);
	}
	void colour(char clr) {
		System.out.println("honda colour is blue:"+clr);
	}
}

public class abs3 {

	public static void main(String[] args) {
		honda h= new honda();
		h.run();//runing safely
		h.speed(56);//honda speed:"+spd
		h.colour('B');//"honda colour is blue:"
		//bike b=new bike(); ,, abstract class ka obj nahi bana sakte accourding to me
		bike b1=new honda();
		b1.speed(89);//"honda speed:"+spd
		b1.run();	//"runing safely"	
		
	}

}
