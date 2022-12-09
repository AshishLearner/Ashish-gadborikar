package excdeptionhandling1;

public class program3 {

	public static void main(String[] args) {
		System.out.println("program starts from here");
		//abnormal statment
		int[] empid= {12,30,20};
		try {
			System.out.println(empid[3]);//ArrayIndexout of bounds Exception 
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception handled " +e);
		}
		System.out.println("programs ends here");

	}

}
