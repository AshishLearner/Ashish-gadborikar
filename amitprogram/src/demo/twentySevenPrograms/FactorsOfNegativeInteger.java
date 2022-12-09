package demo.twentySevenPrograms;

import java.util.*;

public class FactorsOfNegativeInteger {
	
	public static void main() {
		
		int num, i;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number for the factors : ");
		num = scan.nextInt();
		
		scan.close();
		
		System.out.print("Factors of " + num + " are : ");
		
		for(i = num; i <= Math.abs(num); ++i) {
			if(i == 0) {
				break;
			}
			else {
				if(num % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		main();
	}

}
