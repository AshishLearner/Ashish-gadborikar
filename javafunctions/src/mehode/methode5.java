package mehode;

public class methode5 {
	 double x=10,y=20,z=30;
	

	public static void main(String[] args) {
		methode5 m5= new methode5();
		//System.out.println("input the first number :"+m5.x);
		//System.out.println("input the second number :"+m5.y);
		//System.out.println("input the third number :"+m5.z);
		System.out.println(m5.average(10,20,30));
		System.out.println(m5.average(40,50,60));
		System.out.println(m5.average(70,80,90));
		//System.out.println(" average is "+m5.average(m5.x,m5.y,m5.z));
		methode5 m6=new methode5();
		System.out.println(m6.average(100,200,300));
		
	

	}
	public double average(double x, double y,double z) {
		double res =(x+y+z)/3;
		//System.out.println("the average value is "+res);
		return res;
		
	}
	

}