package polymorphism;

class runexa {
	public void ruin() {
		System.out.println("parent class methode");
	}
}

class time extends runexa
{

	public void ruin() {
		System.out.println("child class methode");
	}
}

public class runtimepoly {
	


	public static void main(String[] args) {
		time t = new time();
		t.ruin();
		
		
		

	}

}
