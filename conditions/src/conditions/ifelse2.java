package conditions;

public class ifelse2 {

	public static void main(String[] args) {
		int num1 = 55, num2= 30;
		if(num1>num2){
			System.out.println("number1 is greater than number 2");
		}else {
			System.out.println("number1 is less than number 2");
		}
		if(num1>=num2) {
			System.out.println("number1 is greater than or equal to number 2");
		}else {
			System.out.println("number1 is smaller than number 2");
		}
		if(num1==num2 || num1>num2) {
			System.out.println("number1 is either equal to number 2 or greater than no 2");
		}else {
			System.out.println("number1 is smaller than number 2");
		}

	}

}
