package hw;

public class sumofarray {
    
	public static void main(String[] args) {
	System.out.println("printing sum of all element of an array");
	int sum=0;
    double avg=0;
	int[] arr= {10,20,30,40,50};
	for(int i:arr) {
		sum=sum+i;
		avg=sum/arr.length;
	}
	
	System.out.println("sum is " +sum);
	System.out.println("average is "+avg);
	

	}

}
