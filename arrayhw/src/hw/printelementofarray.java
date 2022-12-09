package hw;

public class printelementofarray {

	public static void main(String[] args) {
		System.out.println("printing element of an array");
		int array[];//declaration
		array =new int[5];//initialization
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		System.out.println("printing array");
		for(int i:array) {
			System.out.println(i);//we have another methode also o print the array
		}
	
		
		

	}

}
