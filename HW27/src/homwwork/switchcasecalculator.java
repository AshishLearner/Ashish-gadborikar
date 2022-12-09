package homwwork;

public class switchcasecalculator {

	public static void main(String[] args) {
		 int a=10,b=20,c;
		 char op='-';
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
