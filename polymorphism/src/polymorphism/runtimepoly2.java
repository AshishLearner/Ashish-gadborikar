package polymorphism;
class hilstation{
	void location() {
		System.out.println("location is ");
	}
	void famousfor() {
		System.out.println("famous for");
	}
	
}
class manali extends hilstation{
	void location() {
		System.out.println("manali is in himachalpradesh");
	}
	void famousfor() {
		System.out.println("manali is famous for hadimbatemple");
	}
	
}
class maisorie extends hilstation{
	void location () {
		System.out.println("maisorie is in utarakhand");
	}
	void famousfor() {
		System.out.println("maisorie is famousfor education");
	}
}
class gulbarg extends hilstation{
	void location() {
		System.out.println("gulberg is in kashmir");
	}
	void famousfor() {
		System.out.println("gulberg is famousfor sking");
	}
}

public class runtimepoly2 {

	public static void main(String[] args) {
		hilstation h=new hilstation();
		h.location();
		h.famousfor();
		h=new manali();
		h.location();
		h.famousfor();
		h=new maisorie();
		h.location();
		h.famousfor();
		h=new gulbarg();
		h.location();
		h.famousfor();
	}

}
