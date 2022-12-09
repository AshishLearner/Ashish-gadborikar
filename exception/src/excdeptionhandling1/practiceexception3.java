package excdeptionhandling1;

public class practiceexception3 {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[5];
			a[5]=30/2;
		}
		catch(ArithmeticException  e){
			System.out.println("arrithmeic exception ocuures "+e);
			
		}
		catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("array exception ocuures "+e );
			
		

	}
		catch(Exception  e){
			System.out.println("excepion exception ocuures "+e);

}
		System.out.println("exceptionm not occures");
	}
}
