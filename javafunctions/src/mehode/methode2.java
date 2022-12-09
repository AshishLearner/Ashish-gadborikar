package mehode;

public class methode2 {
	int age=25;
	void sum(int num1,int num2) {
		System.out.println("addition of two number: "+(num1+num2));
	}
	double addition(int num1,int num2,int num3) {
		System.out.println("addition of three number: "+(num1+num2+num3));
		double res= (num1+num2+num3);
		
		return res;
	}

	public static void main(String[] args) {
		methode2 m2 = new methode2();
		m2.sum(3,5);
		m2.addition(15,8,9);
		
		//or
	//	double res = m2.addition(250,8,6);
		//System.out.println("addition of three no"+res);

	}

}
