package excdeptionhandling1;

public class program4 {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e){
			System.out.println("Arriythmatic Excepion Occures");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(" ArrayIndexOutOfBoundsException ");
			
			
		}catch(Exception e){
			System.out.println("parrent Exception ocures");
			
		}
		try {
			int a[]=new int[5];
			a[5]=30/2;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occures");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds Exception Occures");
			
		}
		catch(Exception e) {
			System.out.println("parrent Exception occures");
			
		}
		System.out.println("rest of the code");

	}

}
