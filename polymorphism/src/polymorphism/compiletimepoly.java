package polymorphism;

public class compiletimepoly {
	
	static void sum(int a,int b) {
		int c= a+b;
		System.out.println("adiion is "+c);
		
	}
	static void sum(int a ,double b) {
		double c = a*b;
		System.out.println("multiplication is "+c); 
		
		
	}

	public static void main(String[] args) {
		compiletimepoly.sum(10, 20);
		compiletimepoly.sum(15, 50.0);
		

	}

}
