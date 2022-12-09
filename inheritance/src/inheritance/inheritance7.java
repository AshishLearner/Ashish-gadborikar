package inheritance;

//parent class,super class, base class
class grandfather {
	grandfather() {
		System.out.println("i am a grandfather");
	}

	void myhome() {
		System.out.println("this is my home");
	}
	void myprop() {
		System.out.println("this is my property");
	}
}

class father extends grandfather {
	father(double d) {
		super();// if we dont write java will automatically write it
		System.out.println("i am class of grandfather ");
	}

	void mycar() {
		System.out.println("this is mycar");
	}
}

class child extends father {
	child(int a) {
		super(10.25);// calling father constructor
		System.out.println("i am child");
	}

	void mybike() {
		System.out.println("my bike");
	}
}

public class inheritance7 {

	public static void main(String[] args) {
		child h = new child(10);// home ,car bike
		h.mybike();
		h.mycar();
		h.myhome();
		// creating an object or insance of child most class and reffered by its parent
		father f = new child(101);// home,car but bike will n ot visible
		f.mycar();
		f.myhome();
		// creating an object or insance of child most class and reffered by its
		// grandfather
		grandfather g1 = new child(456);
		g1.myhome();// home, car,bike will not visible
		/*grandfather bg2=new grandfather();
		bg2.myhome();*/
		g1.myprop();
		
		

	}

}
