package patternprograms;

public class completetrangle {

	public static void main(String[] args) {
		System.out.println("complete trangle program");
		
		for(int i=0;i<5;i++) {
			for(int j=5-1;j>i;j--) {
				System.out.println(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.println("* ");
			}
		}

	}

}
