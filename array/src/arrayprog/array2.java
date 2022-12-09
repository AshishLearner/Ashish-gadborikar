package arrayprog;

public class array2 {
	public static void main(String[] args) {
	//another methode of declariong and initializing of array
	//int getarray[]={10,20,30,40,50};
	//or
	int getarray[]=new int[] {10,20,30,40,50};
	System.out.println("*********for each loop***********");
	//System.out.println(getarray[0]);
	for(int i:getarray) {
		System.out.println(i);
	}
	
		
	}

}
