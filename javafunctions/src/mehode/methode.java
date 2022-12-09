package mehode;

public class methode {
	int age;//GNV
	void display() {
		System.out.println("i am display() of methode class and age value is :" +age);
	}
	void display(int a) {
		age = a;
		System.out.println("i am dispalay(int) of methode class age value is : " + age);
	}
	public static void main (String[] args) {
		methode m2=new methode();
		System.out.println("age :" +m2.age);
		m2.display();
		m2.display(25);
		System.out.println("age :"+m2.age);
		methode m3=new methode();
		m3.display();
		m3.display(75);
	}
	

}
