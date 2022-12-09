package homwwork;

public class largestno {

	public static void main(String[] args) {
		 int a=8,b=8,c=6;
		 if(a>b && a>c) {
			 System.out.println("a is greater than b and c :"+a );
		 }else if (b>a&&b>c) {
			 System.out.println("b is greater than a and c :"+b);
		 }else if(c>a&&c>b) {
			 System.out.println("c is greater than a and b :"+c);
		 }else if (a==c && a==b) {
			 System.out.println("all is equal");
		 }else if (a<=b&& b==c) {
			 System.out.println("b and c is equal a is less than b and c ");
		 }else if(a==b&&b>=c) {
			 System.out.println("a and b is equal c is less than a and b ");
		 }else {
			 System.out.println("invalalid input");
		 }
		 }
		
}


