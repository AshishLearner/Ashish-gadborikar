package constructor;

public class cons1 {
	cons1() {
		System.out.println("this is a zero para constructor");
		}

	cons1(char c){
		System.out.println(" this is a single para constructr");
	}
	cons1(int num1,int num2){
		System.out.println(" this is a int int parameterized constructor");
	}
	cons1(int num, double num2){
		System.out.println(" This is a double parametrised constructor");
	}
	cons1(double num2, int num1){
		System.out.println(" This is a double parametrised constructor");
	}
	public static void main(String[] args) {
		cons1 c1=new cons1('A');
		cons1 c2 = new cons1(10,25);
		cons1 c3 = new cons1(18,78.35);
		cons1 c4=new cons1(78.35,45);

	}

}
