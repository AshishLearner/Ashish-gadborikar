package constructor;

class h {
	double i=100.23;
	h(double j){
		i=j;
		System.out.println("runing of class b constructor");
		System.out.println("j = "+i);
}
}

public class consb {

	public static void main(String[] args) {
		h b1= new h(15.32);
		System.out.println("value is"+b1.i);
	}

}
