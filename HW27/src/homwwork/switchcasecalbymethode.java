package homwwork;

public class switchcasecalbymethode {

	public static void main(String[] args) {
		 cal(25,10,'*');
	}
public static void cal(int a,int b,char op){
	  int c;
	 switch(op){
	 case '*':
		 c=a*b;
		 System.out.println("mul is :"+c);
		 break;
	 case '-':
		 c=a-b;
		 System.out.println("sub is :"+c);
		 break;
	 case '+':
		 c=a+b;
		 System.out.println("addition is :"+c);
		 break;
	 case '/':
		 c=a/b;
		 System.out.println("div is :"+c);
		 break;
	 case '%':
		 c=a%b;
		 System.out.println("remainder is :"+c);
		 break;
	default:
	    System.out.println("invalid operation");
}
}
}
