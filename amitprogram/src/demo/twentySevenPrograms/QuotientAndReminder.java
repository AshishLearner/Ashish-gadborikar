package demo.twentySevenPrograms;

import java.util.Scanner;

public class QuotientAndReminder {
	
	public static void main() {
		int num1, num2, quotient, remainder;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value for num1 : ");
		num1 = scan.nextInt();
		
		System.out.print("Enter the value for num2 : ");
		num2 = scan.nextInt();
		
		scan.close();
		
		//Formula for Quotient
		quotient = num1 / num2;
		
		System.out.println("Quotient is : " + quotient);
		
		//Formula for Remainder
		remainder = num1 % num2;
		
		System.out.println("Remainder is : " + remainder);
	}

	public static void main(String[] args) {
		main();
	}

}
