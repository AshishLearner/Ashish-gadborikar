package demo.twentySevenPrograms;

import java.util.Scanner;

public class PalindromeNumberWhile {
	
	public static void main() {
		
		int num, rem, sum = 0, temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a palindrome : ");
		num = scan.nextInt();
		
		scan.close();
		
		temp = num;
		
		while(num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num /= 10;
		}
		
		if (temp == sum) {
			System.out.println("Entered number is palindrome.");
		}
		else {
			System.out.println("Entered number is not palindrome.");
		}
	}

	public static void main(String[] args) {
		main();
	}

}
