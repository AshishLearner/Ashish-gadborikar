package interfacee;

 interface Demointerface{
	int age=25;//public static int age=25;
	void display();//public abstract void display();
}

class iner1 implements Demointerface {//when class inherits the interface implements keyword is used
	public void display(){
		System.out.println("hello");
}


	public static void main(String[] args) {
		iner1 i1=new iner1();
		i1.display();
		
	}

}
