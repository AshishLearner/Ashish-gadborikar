package inheritance;
// parent class
class fruit {
	//fruit(){
//}

	public void taste() {
		System.out.println("fruits are sweets");
	}
}

	class apple extends fruit {
// apple (){
//		super(); default super() statment written by compiler
//		{
		public void shape() {
			System.out.println("apple n round");
		}
		//public void taste() {
			//System.out.println("fruits are sweets");
	}

public class inheritance3 {
	public static void main(String[]args){
		apple a=new apple();
		a.taste();// calling methode of parent class
		a.shape();//calling methode of child class

			}

		}


