package overidding;

class abc{
	public void rt(int b) {
		System.out.println("methode of abc class");
	}
}
class xyz extends abc{
	public void rt(double d) { // argument should be diffrent to check tha wha happen
		super.rt(2);//this will call the parent class methode,, its super statment
		System.out.println("methode of xyz class");
	}
}

public class over4 {

	public static void main(String[] args) {
		xyz r= new xyz();
		r.rt(40.25);
		
		

	}

}
