package excdeptionhandling1;

public class program8 {

	public static void main(String[] args) {
		
		System.out.println("program to find in which scenarios finally block is not executed");
		try {
			int i=25/0;
			System.out.println(i);
			System.exit(0);
		}
		catch(ArithmeticException e) {
			System.out.println("program to find in which scenarios finally block is not executed");
			
		}
		
		finally {
			//int i=10/0; due to thise execution finally will not Executed
			System.out.println("finally block is always Executed");
		}
	}

}
