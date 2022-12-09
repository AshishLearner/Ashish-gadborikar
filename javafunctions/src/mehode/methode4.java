package mehode;

public class methode4 {
	static double x,y,z;
	

	public static void main(String[] args) {
		//System.out.println("input the first number :"+x);
		//System.out.println("input the second number :"+y);
	//	System.out.println("input the third number :"+z);
		System.out.println(average(10,20,30));
		System.out.println(average(40,50,60));
		System.out.println(average(70,80,90));

	}
	public static double average(double x, double y,double z) {
		
		return (x+y+z)/3;
	}
	

}
