package demo.twentySevenPrograms;

import java.util.Scanner;

public class CountNumberOfDigits {
	
	public static void main() {
		
		int num, count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = scan.nextInt();
		
		scan.close();
		
		for (; num != 0; num /= 10, count++) {
		}
		System.out.println("Number of digits in a entered nummber is : " + count);
		
	}

	public static void main(String[] args) {
		main();
	}

}
