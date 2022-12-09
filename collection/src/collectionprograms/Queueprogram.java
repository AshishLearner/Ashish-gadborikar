package collectionprograms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueprogram {

	public static void main(String[] args) {
		Queue queue=new PriorityQueue();
		//while adding element in queue it will always keep smallest element on the top
		queue.add(123);
		queue.add(245);
		queue.add(10);
		queue.add(105);
		queue.add(50);
		queue.add(5);
		System.out.println("Size : "+queue.size());
		System.out.println("Element of queue : "+queue);
		//element() returns top most element of the queue ,if the queue empty then it will throw exception by name 'NoSuchException'
		System.out.println("Head Element of the queue : "+queue.element());
		//peak() is returns top most element of the queue if queue is empty then it will return "null" instead of throwing exception
		System.out.println("Head Element of the queue : "+queue.peek());
		System.out.println("Iterating the queue element using for each loop");
		for(Object obj:queue) { //anay class by default inherit object class 
			System.out.println(obj);
		}
		System.out.println("Iterating Elemen using Iterator :");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Element of queue : "+queue);
		//it will remove top most element of queue , if the queue is empty then it will throw an exception by name "NoSuchException"
		System.out.println("removing element from queue using removr() : "+queue.remove());
		System.out.println("element of queue : "+queue);
		//it will return the top most element of the queue if the queue is empty then it will return null value
		System.out.println("removing element from queue using poll : "+queue.poll());
		System.out.println("elements of queue : "+queue);
		Iterator itr1=queue.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("******************");
		//using lamda expression
		queue.forEach(Obj->{
			System.out.println(Obj);
		});
		
			
	}

}
