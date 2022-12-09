package stringprogram;

import java.util.Scanner;

public class reversestringusingscanner {

	public static void main(String[] args) {
		String	reversestring = "";
		Scanner str=new Scanner(System.in);
		System.out.println("enter your string");
		
		
		String reverse =str.next();
		str.close();
	
		
		for(int i=reverse.length()-1;i>=0;i--) {
			reversestring=reversestring+reverse.charAt(i);
			
			
		}
		System.out.println("Reverse of Enered String is: "+reversestring);
	

	}


	}


