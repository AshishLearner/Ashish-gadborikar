package homwwork;

public class forloopreverseno {

	public static void main(String[] args) {
		System.out.println("reverse the no");
		int i,p=1234,sum=0,r;
		for(i=0;p>0;i++) {
			r=p%10;
			sum=sum*10+r;
			p=p/10;
			System.out.println(sum);
		}

	}

}
