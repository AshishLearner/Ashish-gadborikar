package practice;

public class methode {
	int age;
	void display() {
		System.out.println("i am displaynig the methode display()"+age);//0
	}
	void display(int age) {
		System.out.println("i am display(int a)"+age);//25
	}

	public static void main(String[] args) {
		methode m=new methode();
		System.out.println("age :"+m.age);//0
		//m.display();
		m.display(25);

	}

}
