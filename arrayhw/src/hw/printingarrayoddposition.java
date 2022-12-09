package hw;

public class printingarrayoddposition {

	public static void main(String[] args) {
		System.out.println("printing array in odd position");
		int arr[]= {78,56,89,25,64,50,29};
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
