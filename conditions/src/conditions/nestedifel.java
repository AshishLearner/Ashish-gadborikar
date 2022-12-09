package conditions;

public class nestedifel {

	public static void main(String[] args) {
		int age = 18;
		int weight = 45;
		if(age>=18) {
			System.out.println("your age is" +age);
		if(weight>=50) {
			System.out.println("your weight is "+weight);
		if(age>=18 && weight>=50){
			System.out.println("you are eligible for bload donation");
		
	    }else {
			System.out.println("you are not eligible");
	    }
		
		}else {
			System.out.println(" you are under weight");
		} 
	    }else {
		System.out.println(" not eligible");
	    }
	}
}
	
