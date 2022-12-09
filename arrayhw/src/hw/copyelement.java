package hw;

import java.util.Arrays;

public class copyelement {

	public static void main(String[] args) {
		System.out.println("copy of element from one array to another array");
		int a1[]= {1,2,3,4,5,};
		for(int i:a1) {
			System.out.println(i);
		}
		System.out.println("***copy of element***");
		int copyarray[]=Arrays.copyOf(a1, a1.length);
				for(int i:copyarray) {
					System.out.println(i);
				}
		
		}
	}


