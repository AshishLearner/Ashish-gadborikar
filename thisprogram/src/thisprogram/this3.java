package thisprogram;

public class this3 {
	int age =25;
	void display() {
		int age =50;
		System.out.println("age : "+age);//50
		System.out.println("NSG variable :"+this.age);//25
		this.call(12345);                              //calling to the call methode
	}
	void call(int number) {
		System.out.println(("calling display methode "+number));//12345
	}
	public static void main(String[] args) {
		this3 t3=new this3();
		t3.display();
		System.out.println("age :"+t3.age);//25
		System.out.println("program ends here");

	}

}
