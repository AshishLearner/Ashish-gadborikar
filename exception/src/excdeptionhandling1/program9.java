package excdeptionhandling1;

public class program9 {
	public static void validateage(int age) {
	if(age < 18) {
		throw new ArithmeticException("person is not eligible for vote");
		
	}
	else {
		System.out.println("person is eligible for vote");
	}
}
	public static void main(String[] args) {
		//validateage(20);// valid scenario
		validateage(13);//invalid scenario

	}

}
