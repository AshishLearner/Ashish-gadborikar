package homwork;

public class circule {
	
	static double a = 3.14;
	
	static double res(int r,int q)	{
		
		System.out.println("area of circule is "+(a*r*q));
		 
		double res = (a*r*q);
		return res ;
		
	}
			

	public static void main(String[] args) {
		res(2,5);
		res(8,9);
		
		
		

	}

}