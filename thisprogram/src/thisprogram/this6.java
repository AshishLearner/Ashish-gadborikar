package thisprogram;
class B{
	B(){
		System.out.println("zero para");
	}
	B(int c){
		this();
		System.out.println("int para");
	}
}

public class this6 {

	public static void main(String[] args) {
		B b1=new B(10);
		

	}

}
