package constructor;

public class consoverloading {
	consoverloading(){
		System.out.println("zero parameterized constructor");
		System.out.println("having no parameter");
		}
	consoverloading(int a){
		System.out.println(" parameterized constructor");
		System.out.println("having int parameter");
		}
	consoverloading(double b){
		System.out.println(" parameterized constructor");
		System.out.println("having double parameter");
		}
	consoverloading(int a,double b,int c){
		System.out.println("parameterized constructor");
		System.out.println("having int,double,int parameter");
		}
	consoverloading(double b,int a, int c){
		System.out.println("parameterized constructor");
		System.out.println("having double,int,intparameter");
		}

	public static void main(String[] args) {
		consoverloading o1=new consoverloading(12);
		consoverloading o2= new consoverloading(45.8);
		consoverloading o3=new consoverloading(14,58.65,6);
		consoverloading o4 = new consoverloading(78.25,8,3);
		consoverloading o5= new consoverloading();

	}

}
