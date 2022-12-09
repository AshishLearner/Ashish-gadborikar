package mehode;

public class methode1 {
	static int age = 25;
	static void sum(int num1 , int num2) {
		System.out.println("addition of two no :"+(num1+num2));
	}
	static double addition (int num1, int num2, int num3) {
		double res = (num1+num2+num3);
		
		return res;
		
	}

	public static void main(String[] args) {
		sum(25,90);
		System.out.println("addition of three no:"+addition(25,80,90));
		

	}

}
