package abstraction;
abstract class shape {
	abstract void draw();
	}
//in real scenario implementaion is provided by oher i.e. unkown by end user
class rectangle extends shape{
	void draw(){
		System.out.println("drawing rectangle");
	}
}
class circule extends shape{
	void draw() {
		System.out.println("drawing circule");
	}
}
//inb real scenario methode is called by programmer or user
public class abs4 {

	public static void main(String[] args) {
	//	shape s= new shape();//object creation of abstract methode is not possible
	//	s.draw();
		shape s= new circule();
		s.draw();//drawing circule
		shape s1= new rectangle();
		s1.draw();//drawing rectangle
		

	}

}
