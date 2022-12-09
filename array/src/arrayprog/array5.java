package arrayprog;

public class array5 {

	public static void main(String[] args) {
	int num[]= {10,20,30,40,50};
	double sum=0;
	double average;
	//access all element using for each loop
	for(int number:num) {
		sum=sum+number;
	}
	//System.out.println("sum="+sum);//if we print thise within loop then he output should be diffrent
	
	average=sum/num.length;
	System.out.println("sum="+sum);
	System.out.println("average="+average);
	
	}
	
//interview Ask program
}
