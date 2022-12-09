package hw;

public class printingreverseorder {

	public static void main(String[] args) {
		System.out.println("printing array in reverse order");
		int arr[]= {1,2,3,4,5};
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("printing in reverse order");
		for(int i=arr.length;i>0;i--) {
			System.out.println(i);//arr[i] likhenge to error ayenga
			
		}
		
	}

}
