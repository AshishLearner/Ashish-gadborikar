package excdeptionhandling1;

import java.util.Scanner;

public class practiceexception1 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int i,j;
		System.out.println("enter first no");
		i=s.nextInt();
		System.out.println("enter second no ");
		j=s.nextInt();
		try {
			int res=i/j;
			System.out.println("result is "+res);
		}
		catch (Throwable e){
			System.out.println("exception type "+e);
			
			
		}
		System.out.println("programs end");

	}

}
