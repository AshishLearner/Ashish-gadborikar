package demo.twentySevenPrograms;

import java.util.Scanner;

public class MultiplyTwoFloatingNumbers {
	
	public static void main() {
		
		float i, j, mul;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the floating value for 1 : ");
		i = scan.nextFloat();
		
		System.out.print("Enter the floating value for 2 : ");
		j = scan.nextFloat();
		
		scan.close();
		
		mul = i * j;
		System.out.println("The multiplication of two floating values is : " + mul);
	}

	public static void main(String[] args) {
		main();
	}

}
