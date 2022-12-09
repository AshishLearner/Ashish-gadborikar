package abstraction;

abstract class icici{
	abstract double getrateofintrestforhomeloan();
	void loan() {
		System.out.println("as per rbi loan");
	}
}
class boi extends icici{
	double getrateofintrestforhomeloan() {
		return 6.78;
	}
}
class bob extends icici{
	double getrateofintrestforhomeloan() {
		return 8.36;
	}
}

public class abspractice5 {

	public static void main(String[] args) {
		/*bob b=new bob();
		System.out.println("bank of baroda rate of intrest "+b.getrateofintrestforhomeloan());		
		boi b1=new boi();
		System.out.println("bank of india rate of intrest "+b1.getrateofintrestforhomeloan());*/
		icici i=new bob();
		System.out.println(i.getrateofintrestforhomeloan());
		
	}

}
