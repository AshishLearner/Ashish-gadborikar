package inheritance;
class m{
	
public void dad() {
	System.out.println("act as parent class");
}
}
class n{
	public void mom(){
		System.out.println("act as parent too");
			
		}
	}
class o extends m,n {// multiple inheritance is not possible
	o(){
		super();
	}
	public void child() {
		System.out.println("try to extend all class");
	}
}

public class inheritance6 {

	public static void main(String[] args) {
		o g1=new o();
		g1.child();
		//g1.dad();

	}

}
