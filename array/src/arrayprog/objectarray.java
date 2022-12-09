package arrayprog;


	class pune{
		void deccan() {
			System.out.println("i m in pune");
		}
	}
	class maharashtra extends pune{
		void display() {
			System.out.println("IT city");
		}
	}
	public class objectarray extends maharashtra {
		void call() {
			System.out.println("calling ......");
		}

	public static void main(String[] args) {
//		objectarray obj[]=new objectarray[3];
//		obj[0]=new objectarray();
////		obj[1]=new maharashtra();
//  	obj[2]=new pune();
//		obj[1]=(objectarray)new maharashtra();
//		obj[2]=(objectarray)new pune();
//		//obj[3=](objectarray)new pune();
	pune obj[]=new pune[3];
	obj[0]=new objectarray();
	obj[1]=new maharashtra();
	obj[2]=new pune();
//	obj[0].deccan();
	
			
			}

}
