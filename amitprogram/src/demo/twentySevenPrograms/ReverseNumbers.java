package demo.twentySevenPrograms;

import java.util.Scanner;

public class ReverseNumbers {
	
	public static void main() {
		int num, reverse = 0, remainder;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to reverse : ");
		num = scan.nextInt();
		
		scan.close();
		
		for (; num != 0; num = num / 10) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the entered number is : " + reverse);
	}

	public static void main(String[] args) {
		main();
	}

}
