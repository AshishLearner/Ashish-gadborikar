package collectionprograms;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//create a vector
		Vector<String> Vec= new Vector<String>();
		Vec.add("Tiger");
		Vec.add("Lion");
		Vec.add("Dog");
		Vec.add("Elephant");
	//	System.out.println(Vec);
		//Adding element using addElement()methode of vector
		Vec.addElement("rat");
		Vec.addElement("cat");
		Vec.addElement("deer");
		System.out.println("Elements are : "+Vec);
	}

}
