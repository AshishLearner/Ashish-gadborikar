package casting;

public class primitivecasting {

	public static void main(String[] args) {
		int myint =7;
		double d =myint;//implicitely widening
		double mydouble = (double)myint; //explicitely widening
		System.out.println(myint);
		System.out.println(d);
		System.out.println(mydouble);
		
		double sal=12345.789456523;
		int low = (int)sal; // explicitely narrowing
		float lower =(float)sal; // expilcitely narrowing
		System.out.println(sal);
		System.out.println(low);
		System.out.println(lower);
		
		
		
	}

}
