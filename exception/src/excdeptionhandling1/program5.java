package excdeptionhandling1;

public class program5 {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=25/0;
		}
		catch(Exception e) {
			System.out.println("Program of unreachable code");
			
		}
		/*catch(ArithmeticException e) {
			System.out.println("program of unreachable code arithmertic Exception");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("program of unreachable code Array Index out of bounds Exception");
			
		}*/

	}

}
