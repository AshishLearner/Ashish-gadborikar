package thisprogram;

class A{
	A(){
		System.out.println("hello zero");
	}
	A(double b){
		this();
		System.out.println("hello double");
	}
	A(int a){
		this(58.6);
		System.out.println("hello int");
	}
} 


public class this5 {
	
	

	public static void main(String[] args) {
		//A a1=new A();
		//A a2=new A(25.65);
		//A a3=new A(4);
		A a1=new A(5);
		

	}

}
