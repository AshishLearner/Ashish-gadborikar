package polymorphism;

class bank{
	float getrateofintrest() {
		return 6.8f;
	}
}
class sbi extends bank{
	float getrateofintrest() {
		return 7.9f;
	}
}
class icici extends bank{
	float getrateofintrest() {
		return 6.3f;
	}
}
class axis extends bank{
	float getrateofintrest() {
		return 9.5f;
	}
}
public class runtimepoly1 {

	public static void main(String[] args) {
		bank b=new sbi();
		System.out.println("sbi rate of intrest is : "+b.getrateofintrest());
		b=new icici();//upcasting
		System.out.println("icici rate of intrest is : "+b.getrateofintrest());
		b=new axis();
		System.out.println("axis bank rate of intrest: "+b.getrateofintrest());

	}

}
