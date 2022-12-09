package excdeptionhandling1;

public class practiceexception2 {

	public static void main(String[] args) {
	int arr[]= {10,20,30,};
	try {
		System.out.println(arr[5]);
	}
	catch(Throwable e) {
		System.out.println("exeption occures "+e); 
		
		
	}
	System.out.println("program ends");

	}

}
