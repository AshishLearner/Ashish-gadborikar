package stringprogram;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class palindromestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to check wheher it is palindrome or not");
		String str=sc.next();
		String str2 = str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		String str3 =str2.toUpperCase();
		String rev2 =rev.toUpperCase();
		if(str3.equals(rev2)) {
			System.out.println(str+" : enter string in palindrome string");
			
		}
		else {
			System.out.println(str+" : enter string is not palindrome");
		}
	}

}
