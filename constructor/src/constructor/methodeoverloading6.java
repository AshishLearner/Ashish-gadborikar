package constructor;



class superclass {
	void msg(int x, int y){
    System.out.println(" hello ");

	}
}
class subclass{
	void msg(double x, double y) {
		System.out.println("lets go");
	}
}
public class methodeoverloading6 {
	
	public static void main(String[] args) {
		superclass sc=new superclass();
		sc.msg(12, 10);
		subclass s=new subclass();
		s.msg(12.30, 10.25);
		}
	}
