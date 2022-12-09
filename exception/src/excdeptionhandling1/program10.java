package excdeptionhandling1;
//program to create userdefined exception

class UserdefinedException extends Exception{
	public UserdefinedException(String Str) {
		//calling constructor of parent class
		super(Str);
		
	}
	
}


public class program10 {

	public static void main(String[] args) {
		try {
			//throw an object of userdefine dclasss
			throw new UserdefinedException("its a user defined Exception");
		}
		catch(UserdefinedException ude){
			System.out.println("caught the Exception "+ude);
			
		}
		System.out.println("rest of code.....");

	}

}
