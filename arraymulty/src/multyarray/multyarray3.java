package multyarray;

import java.util.Arrays;

public class multyarray3 {
	// java program to clone array

	public static void main(String[] args) {
		int arr[] = { 33, 3, 5, 9 };
		System.out.println("printing original array");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("printing clone of the array");
		int carr[] = arr.clone();
		for (int i : carr) {
			System.out.println(i);
		}
		System.out.println("are both equal?");
		System.out.println(Arrays.equals(arr, carr));
		System.out.println("*******************");
		int copyarray[] = Arrays.copyOf(arr, arr.length);
		for (int i : copyarray) {
			System.out.println(i);
		}

		System.out.println("*****printing copy of range**************");
		int copyofarray[] = Arrays.copyOfRange(arr, 0, 3);
		for (int i : copyofarray) {
			System.out.println(i);
		}

		System.out.println("****after sorting***************");
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("printing in  reverse order ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
