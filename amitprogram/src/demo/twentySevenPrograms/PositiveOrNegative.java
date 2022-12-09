package demo.twentySevenPrograms;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main() {
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = scan.nextInt();
		
		scan.close();
		
		if (num > 0) {
			System.out.println("Entered number is Positive.");
		}
		else if (num < 0) {
			System.out.println("Entered number is Negative.");
		}
		else {
			System.out.println("Entered number is Zero.");
		}
	}

	public static void main(String[] args) {
		main();
	}

}
