package homwwork;

public class whileloopreverseno {

	public static void main(String[] args) {
		System.out.println("reverse no");
		int p=4523,r=0,sum=0;
		while(p>0) {
			r=p%10;
			sum=sum*10+r;
			p=p/10;
			System.out.println(sum);
			
		}

	}

}
