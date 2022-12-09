package demo.twentySevenPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main() {
		
		int a, b, temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value for a : ");
		a = scan.nextInt();
		
		System.out.print("Enter the value for b : ");
		b = scan.nextInt();
		
		scan.close();
		
		System.out.println("Before swapping numbers : " + "a = " + a + " , " + "b = " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping numbers : " + "a = " + a + " , " + "b = " + b);
	}

	public static void main(String[] args) {
		main();
	}

}
