package demo.twentySevenPrograms;

import java.util.*;

public class FactorsOfPositiveInteger {
	
	public static void main() {
		
		int num, i;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number for the factors : ");
		num = scan.nextInt();
		
		scan.close();
		
		System.out.print("Factors of " + num + " are : ");
		
		for(i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		main();
	}

}
