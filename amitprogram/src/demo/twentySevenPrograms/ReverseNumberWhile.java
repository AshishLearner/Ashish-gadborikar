package demo.twentySevenPrograms;

import java.util.Scanner;

public class ReverseNumberWhile {
	
	public static void main() {
		
		int num, reverse = 0, remainder;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to reverse : ");
		num = scan.nextInt();
		
		scan.close();
		
		while(num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num /= 10;
		}
		System.out.println("The reverse of the entered number is : " + reverse);
	}

	public static void main(String[] args) {
		main();
	}

}
