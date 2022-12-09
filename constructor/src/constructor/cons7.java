package constructor;

class b{
	int i= 10;
	b(){
		System.out.println("runing class b constructor");
		i=23;
	}
}

public class cons7 {

	public static void main(String[] args) {
		System.out.println("main() of class cons7 is runing ");
		b B1=new b();
		System.out.println(" class b global varibal i " +B1.i);
		System.out.println("===============================");
		b B2=new b();
		System.out.println("class b global varibal i ="+B2.i);
		System.out.println("main () of class cons7 is end here");
	
		
	}

}
