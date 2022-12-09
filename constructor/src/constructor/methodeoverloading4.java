package constructor;

public class methodeoverloading4 {
	public  void square(int number) {
		int square= number*number;
		System.out.println("methode with imnteger argument called :"+square);
	}
    public void square(double number){
    	double square= number*number;
    	System.out.println("methode with double argument called :"+square);
    }
    public void square(long number) {
    	long square= number*number;
    	System.out.println("methode with long argument called ;"+square);
    }
	public static void main(String[] args) {
		methodeoverloading4 m=new methodeoverloading4();
		m.square(12.5);
		m.square(892);
		m.square(125l);

	}
}
