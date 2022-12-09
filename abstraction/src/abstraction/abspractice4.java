package abstraction;

abstract class apple{
	abstract void orange();
}
class kashmir extends apple{
	void orange() {
		System.out.println(" nagpur is famous for orangre  ");
	}
}
class kullu extends apple{
	void orange() {
		System.out.println("apple is famous from shimla");	
	}
	
	
}
public class abspractice4 {

	public static void main(String[] args) {
		apple k=new kullu();
		k.orange();
		apple a = new kashmir();
		a.orange();
		
		
	}

}
