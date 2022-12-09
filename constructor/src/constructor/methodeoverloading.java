package constructor;

public class methodeoverloading {
	double sum(int g,int h) {
		System.out.println(g+h);
		return (g+h);
	}
	double sum(int g, double h) {
		System.out.println(g+h);
		return (g+h);
	}

	public static void main(String[] args) {
		methodeoverloading ov=new methodeoverloading();
		double result =ov.sum(20,20);
		System.out.println("result : "+result);
		double resul=ov.sum(56, 45.56);
		System.out.println("result :"+resul);
		
		

	}

}
