package hw;

import java.util.Arrays;

public class duplicatearray {

	public static void main(String[] args) {
		System.out.println("duplicate of an arraay");
		int arr[]= {1,2,3,6,4,};
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("printing duplicate of an array");
		int chaar[]=arr.clone();
		for(int i:chaar) {
			System.out.println(i);
		}
	}

}
