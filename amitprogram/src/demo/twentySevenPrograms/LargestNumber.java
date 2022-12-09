package demo.twentySevenPrograms;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main() {
		
		int num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		num1 = scan.nextInt();
		
		System.out.print("Enter the num2 : ");
		num2 = scan.nextInt();
		
		System.out.print("Enter the num3 : ");
		num3 = scan.nextInt();
		
		scan.close();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is a largest number.");
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is a largest number.");
		}
		else {
			System.out.println(num3 + " is a largest number.");
		}
		
	}
	
	public static void main(String[] args) {
		main();
	}

}
