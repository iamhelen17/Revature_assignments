package eg1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {


	public static void main(String[] args) {
		Queue q1 = new LinkedList();
		q1.add("hi");
		q1.add(98);
		q1.add(true);
		q1.add(937343232);
		q1.add(123244.2222);
		q1.add(null);
		q1.add(3474744774747747884L);
		System.out.println("q1 = "+q1);
		
		Queue<Integer> q2 = new LinkedList<>();
		q2.add(25);
		q2.add(22);
		q2.add(122);
		q2.add(null);  //can have null values
		q2.add(null);
		q2.add(220);
		q2.add(221);
		q2.add(22);
		q2.add(null);
		q2.add(42);
		q2.add(22);
		q2.add(null);
		System.out.println("\nq2 = "+q2); //insertion order is retained
		
		q2.add(170);
		System.out.println("q2.add(170) = "+q2); //element inserted to the back of the queue. insertion order is retained
		System.out.println("\nHead of the queue = " +q2.peek()); //returns the head of the queue
		
		                               
		System.out.println("\nq2.remove() = "+q2.remove());  //remove the head of the queue  
		System.out.println("\nq2 = "+q2);
		System.out.println("q2.size() = "+q2.size());   //returns the number of elements
		
		System.out.println("Retrieve and remove head of the queue = " +q2.poll());
		System.out.println("\nq2 = "+q2);
		System.out.println("New head of the queue = " +q2.peek());
		
		
		
		Queue<Integer> q3 = new PriorityQueue<>();
		q3.add(2);
		q3.add(3);
		q3.add(1);
		q3.add(0);
		q3.add(4);  //can't have null values
		System.out.println("\nq3 = "+q3);   //at the time of insertion elements will be sorted and ordered
		
		q3.add(170);
		System.out.println("q3.add(170) = "+q3); //element inserted to the back of the queue. insertion order is retained
		System.out.println("\nq3.element() = " +q3.element()); //returns the head of the queue
		
		System.out.println("q3.remove() = " +q3.remove()); //removes the head of the queue
		System.out.println("\nq3 = "+q3);
		System.out.println("q3.size() = " +q3.size()); //returns the number of elements
		
		System.out.println("\nHead of the queue = " +q3.peek()); //retrieves but does not remove the head of the queue
		System.out.println("Retrieve and remove head of the queue = " +q3.poll());
		System.out.println("\nq3 = "+q3);
		System.out.println("New head of the queue = " +q3.peek());
		
		
		
	}
}

//Task3)Explore Queue Interface and try implementing Queue using LinkedList and PriorityQueue, and get the difference between them
