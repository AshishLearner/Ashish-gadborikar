package collectionprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList <String> a1=new ArrayList<String>();
		System.out.println("is array empty : "+a1.isEmpty());
		a1.add("Ravi");
		a1.add("vijay");
		a1.add("Ajay");
		System.out.println("a1 collection elements : "+a1);
		ArrayList<String> a12=new ArrayList<String>();
		a12.add("Ravi");
		a12.add("Ajay");
		a12.add("Hanumant");
		System.out.println("a12 collection elements : "+a12);
		a1.retainAll(a12);
		System.out.println("after retainAll , a1 collection elements : "+a1);
		System.out.println("iterating the Element after retaining the element of a12 : ");
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*** 2nd iterator using same iterator object ***");
		Iterator itr2 =a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
