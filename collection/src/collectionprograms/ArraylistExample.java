package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();//creating arraylist
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		//printing the arraylist
		System.out.println("Elements of list :"+list);
		System.out.println("size of list : "+list.size());
		System.out.println("get the element present in position 1: "+list.get(0));
		System.out.println("Traversing list through for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		System.out.println("Traversing lisst through for each loop");
		for(Object fruit:list) {
			System.out.println(fruit);
			
		}
		//returning the element
		System.out.println("Returning Element : "+list.get(1));
		//changing the element
		list.set(1, "Dates");
		System.out.println(list);
		System.out.println(list.size());
		list.add(1, "Colour");
		System.out.println("Elements of list"+list);
		System.out.println("colour is present in list or not "+list.contains("Colour"));
		System.out.println("Index of banana in list :"+list.indexOf("Banana"));
		System.out.println("is list Empty "+list.isEmpty());
		System.out.println("before removing of object dates "+list);
		System.out.println("object removed from list "+list.remove(2));
		System.out.println("after remove of dates "+list);
		System.out.println("Banana object is removed from list "+list.remove("Banana"));//true
		System.out.println("After removing of banana"+list);
		//sorting the list
		Collections.sort(list);
		System.out.println("sorting by assending orde==r once sort methode execued "+list);
		System.out.println("size "+list.size());
		System.out.println("Traversing list through for each() method: ");
		//the forEach() methode is a new feature introduced in java8
		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Traversing list through Iterator interface : ");
		Iterator itr = list.iterator();//true or false
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//	//	System.out.println(itr.next());
//	//	System.out.println(itr.hasNext());
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//for 2nd iteration we need to create new instance for iteator interface
		System.out.println(itr.hasNext());
		System.out.println("***************");
		Iterator itr2=list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		/*List l1 = new ArrayList();
		List <String> l2=new ArrayList<String>();
		List <Integer> l3=new ArrayList<Integer>();
		*/

	}

}
