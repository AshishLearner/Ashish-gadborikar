package excdeptionhandling1;

public class program7 {

	public static void main(String[] args) {
		try {
			System.out.println("inside the try block");
			//below code throws exception
			int data=25/0;
		}
		//can not handle null pointer type exception
		catch(NullPointerException e) {
			System.out.println(e);
			
		}
		//execute regardless of execution occured or not
		finally {
			System.out.println("finally block is always Executed");
		}

		System.out.println("program ends here");
	}

}
