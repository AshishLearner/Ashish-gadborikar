package constructor;

public class methodoverloading5 {
	public static void main(int g) {
		System.out.println("main method with int argument execution");
		System.out.println(g);
	}
	public static void main(char c) {
		System.out.println("main method with int argument execution");
		System.out.println(c);
	}

	public static void main(String[] args){
		System.out.println("original main() executing");
		main(458);
		main('y');
		
		
	}
		

	}


