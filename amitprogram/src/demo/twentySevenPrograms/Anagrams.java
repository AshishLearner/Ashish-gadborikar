package demo.twentySevenPrograms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String str1, str2;
		
		str1 = "Silent";
		str2 = "Listen";
		
	//	str1 = str1.replace(" ", "");
	//	str2 = str2.replace(" ", "");
		
		char a[] = str1.toLowerCase().toCharArray();
		char b[] = str2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(a);
		System.out.println(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result) {
			System.out.println("String str1 and str2 are Anagrams.");
		}
		else {
			System.out.println("String str1 and str2 are not Anagrams.");
		}
	}

}
