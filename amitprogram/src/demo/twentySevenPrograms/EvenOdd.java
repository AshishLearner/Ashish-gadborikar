package demo.twentySevenPrograms;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main() {
		
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		i = scan.nextInt();
		
		scan.close();
		
		if (i%2 == 0) {
			System.out.println("The entered number is even.");
		}
		else {
			System.out.println("The entered number is odd.");
		}
	}

	public static void main(String[] args) {
		main();
	}

}
