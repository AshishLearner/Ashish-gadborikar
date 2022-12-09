package excdeptionhandling1;

public class program6 {

	public static void main(String[] args) {
		System.out.println("java program for finally block");
		try {
			int data =25/0;
		}
		/*catch(ArithmeticException e) {
			System.out.println("Excepion Handled.....");
			
		}*/
		finally {
			System.out.println("finally block is always Executed");
		}
	}

}
