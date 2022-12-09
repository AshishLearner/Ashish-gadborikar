package demo.twentySevenPrograms;

import java.util.Scanner;

public class AddTwoIntegers {
	
	public static void main() {
		
		int i, j, add;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value for Integer 1 : ");
		i = scan.nextInt();
		
		System.out.print("Enter the value for Integer 2 : ");
		j = scan.nextInt();
		
		scan.close();
		
		add = i + j;
		System.out.println("Addition of two integers is : " + add);
	}

	public static void main(String[] args) {
		main();
	}

}
