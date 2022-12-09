package thisprogram;

public class this4 {
	this4(){
		
		System.out.println(" this statment zero parameterised constructor");
	}
	this4(int a){
		this();
		System.out.println("this statment int parameterised costructor");
	}
	this4(double d){
	    this(4);
		System.out.println("this statment double parmeterised constructor");
	}
	this4(char c){
		this(25.3);
		System.out.println("this statment character parameterised constructor");
	}

	public static void main(String[] args) {
		//this4 t1=new this4();
		//this4 t2=new this4(45);
		//this4 t3=new this4(98.32);
		//this4 t4=new this4('c');
		this4 t1 = new this4('s');
	}
}
//this is a instance of current class,used to call another constructor of current class
//i should be 1st statment inside constructor body