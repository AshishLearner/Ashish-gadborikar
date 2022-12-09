package abstraction;
abstract class RBIBank{
	abstract double getrateofIntrestforHomeloan();
		void loan() {
			System.out.println("as per RBI guideline");
		}
}
class SBI extends RBIBank{
	 double getrateofIntrestforHomeloan() {
		return 4.23;
	}
}
class PNB extends RBIBank{
	double getrateofIntrestforHomeloan() {
		return 9.25;
	}
}

public class abs5 {

	public static void main(String[] args) {
		PNB p=new PNB();
		System.out.println("PNB rate of intrest is;"+p.getrateofIntrestforHomeloan()+"%");//9.25
		SBI S=new SBI ();
		System.out.println("SBI rate of intrest is;"+S.getrateofIntrestforHomeloan()+"%");//4.23
		RBIBank R= new PNB();
		System.out.println("RBI reference but object is PNB"+R.getrateofIntrestforHomeloan()+"%");//9.23;
		RBIBank R1=new SBI();
		System.out.println("RBI reference but object is SBI"+R1.getrateofIntrestforHomeloan()+"%");//4.23
		
	
	}

}
