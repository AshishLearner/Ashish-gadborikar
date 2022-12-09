package hw;

import java.util.Arrays;

public class sortingarray {

	public static void main(String[] args) {
		int[] arr ={1,52,58,65,2,8};
		Arrays.sort(arr);
		System.out.println("element of array sorted in ascending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
