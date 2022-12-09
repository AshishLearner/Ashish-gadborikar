package mehode;

public class Methode3 {
	static double x=10,y= 20,z=30;//SGV
	public static void main(String[] args) {
				System.out.println("Inuput the first number :" +x);
				System.out.println("Inuput the first number :" +y);
				System.out.println("Inuput the first number :" +z);
				System.out.println("the average value is" + average(z,y,x));
				//System.out.println("the average value is" + average(10,20,30,));
				//System.out.println("the average value is" + average(50,60,70));
				//System.out.println("the average value is" + average(80,90,100));
				
			}
	public static double average(double p, double q, double r ) {
		return (p + q + r)/  3; 
	}

}
 