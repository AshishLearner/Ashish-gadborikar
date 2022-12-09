package thisprogram;

public class this1 {
	static int age=25;
	void display(){
		int age=50;
		System.out.println("age is "+age);// access the local variable
		//System.out.println("age is "+age);
		System.out.println("age is "+this.age);//acess the gloabal varibale
	}

	public static void main(String[] args) {
		this1 t1= new this1();
		t1.display();                     // methode calll
		System.out.println("AGE "+age);
		

	}

}
