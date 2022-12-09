package homwwork;

public class whilearmstrong {

	public static void main(String[] args) {
		int a=153,p=0,r=0,b,q;
		System.out.println("armstrong number");
		while(a>0){
			p=a%10;
			b=p*p*p;
			r=r+p;
			q=a/10;
			if(q==r) {
				System.out.println("enter no is armstong number");
			}else {
				System.out.println("is not armstrong number");
			}
		}

	}

	
}
