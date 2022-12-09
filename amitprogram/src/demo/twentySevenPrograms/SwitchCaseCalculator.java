package demo.twentySevenPrograms;

import java.util.*;

public class SwitchCaseCalculator {
	
	public static void main() {
		
		int num1, num2;
		char ch;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		num1 = scan.nextInt();
		
		System.out.print("Enter num2 : ");
		num2 = scan.nextInt();
		
//		scan.close();
		
		System.out.println("Select Operation : ");
		System.out.println("A : Addition | S : Subtraction | M : Multiplication | D : Division ");
		
		ch = scan.next().charAt(0);
		
		switch (ch) {
			case 'A' : 
			System.out.println("Addition of num1 and num2 is : " + (num1 + num2));
			break;
			
			case 'S' : 
			System.out.println("Subtraction of num1 and num2 is : " + (num1 - num2));
			break;
			
			case 'M' : 
			System.out.println("Multiplication of num1 and num2 is : " + (num1 * num2));
			break;
			
			case 'D' : 
			System.out.println("Division of num1 and num2 is : " + (num1 / num2));
			break;
			
			default :
			System.out.println("Value Invalid!");
		}
		
	}

	public static void main(String[] args) {
		main();
	}

}
