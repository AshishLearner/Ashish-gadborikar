package demo.twentySevenPrograms;

import java.util.*;

public class CountNumberOfDigitsWhileLoop {
	
	public static void main() {
		
		int num, count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = scan.nextInt();
		
		scan.close();
		
		while(num != 0) {
//			num = num / 10;
			num /= 10;
			count++;
		}
		System.out.println("Number of diigits are : " + count);
	}

	public static void main(String[] args) {
		main();
	}

}
