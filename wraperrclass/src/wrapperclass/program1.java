package wrapperclass;

public class program1 {

	public static void main(String[] args) {
		System.out.println("wrapper class program ");
		int a =25;
		//in all wrapperclass tostring() will be overided converting in to integer
		//boxing operation
		Integer i=new Integer(a);
		Integer j=new Integer(10);
		Integer k=a; //auo boxing now compiler write Integer.valueof(a) internally new Integer(a)
		System.out.println("a : "+a+"\n k :"+k+"\ni : "+i+"\n j: "+j);
		//unboxing
		System.out.println("performing unboxing opertion");
		Integer a1=new Integer(3);
		int i1=a1.intValue();
		System.out.println("a1 : "+a1+"\ni1 :"+i1);
		System.out.println(a1==i1);
		System.out.println(a1.equals(i1));
	

	}

}
