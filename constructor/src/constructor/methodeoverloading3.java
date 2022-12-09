package constructor;

public class methodeoverloading3 {
	public static void square(int number) {
		int square= number*number;
		System.out.println("methode with imnteger argument called :"+square);
	}
    public static void square(double number){
    	double square= number*number;
    	System.out.println("methode with double argument called :"+square);
    }
    public void square(long number) {// non static methode
    	long square= number*number;
    	System.out.println("methode with long argument called ;"+square);
    }
	public static void main(String[] args) {
		methodeoverloading3 m=new methodeoverloading3();
		square(12.5);
		square(892);
		m.square(125l);

	}

}
//in static methode we can also access the non static variable,methode
