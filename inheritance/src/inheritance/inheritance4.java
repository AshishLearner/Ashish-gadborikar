package inheritance;
//parent class
class fourwheel{
	//default costructor
	
	public void wheels() {
		System.out.println("i am wheels");
		
	}
}
//child class of fourwheel and parent class of maruti
class car extends fourwheel{
	//default constructor with default super()
	public void type() {
		System.out.println("i am car");
	}
		
	}
//child class of car class
class maruti extends car{
	//default constructor with default super()
	public void componey() {
		System.out.println("i am marui");
	}
}

public class inheritance4 {

	public static void main(String[] args) {
		maruti m=new maruti();//object of chold class
		m.componey();
		m.type();
		m.wheels();

	}

}
