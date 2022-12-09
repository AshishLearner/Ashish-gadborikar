package demo.twentySevenPrograms;

import java.util.Scanner;

public class LeapYear {
	
	public static void main() {
		int year;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an Year : ");
		year = scan.nextInt();
		
		scan.close();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Entered Year is a Leap Year.");
		}
		else {
			System.out.println("Entered Year is not a Leap Year.");
		}
		
	}

	public static void main(String[] args) {
		main();
	}

}
