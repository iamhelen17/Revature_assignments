package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List li1 = new LinkedList();
		li1.add("hi");
		li1.add( "hi there");
		li1.add(false);
		li1.add(5547);
		li1.add(800883.8888833);
		li1.add(666649058599660600L);
		System.out.println("li1 = " +li1);
		
		List<Integer> li2 = new LinkedList<>();
		li2.add(45);
		li2.add(null);
		li2.add(4);
		li2.add(4);
		li2.add(500);
		li2.add(345);
		li2.add(745);
		li2.add(4);
		li2.add(953);
		li2.add(null);
		li2.add(null);
		li2.add(39);
		li2.add(39);
		li2.add(39);
		li2.add(10);
		System.out.println("li2 = " +li2);
		
		li2.add(4, 93);
		System.out.println("li2 = " +li2);
		
		li2.set(6, 51);
		System.out.println("li2 = " +li2);
		System.out.println("li2.size() = " +li2.size());
		System.out.println("li2.get() = "+li2.get(1));
	
		li2.remove(7);
		System.out.println("li2 after li2.remove(7)" +li2);
		
		Integer i = 39;
		li2.remove(i);
		System.out.println("li2 after li2.remove(i) = "+li2);
		
		while (li2.remove(i)) {}
		System.out.println("li2 after while(li2.remove(i)){} = "+li2);
		
		System.out.println("li2.contains(59) : " +li2.contains(59));
		System.out.println("li2.contains(4) : " +li2.contains(4));
		
		System.out.println("\nTraversing using for loop");
		for (int j = 0; j < li2.size(); j++) {
			System.out.print(li2.get(j) + " ");
		}
		
		System.out.println("\n\nTraversing using for-each loop");
		for (Integer j:li2) {
			System.out.print(j + " ");
		}
		
		Collections.reverse(li2);
		System.out.println("\n\nli2  after Collections.reverse(li2); " +li2);
		Collections.shuffle(li2);
		System.out.println("li2  after Collections.shuffle(li2); " +li2);
		
		Collections.replaceAll(li2, null, -9);
		System.out.println("li2  after Collections.replaceAll(li2, null, -1); "+li2);
		Collections.sort(li2);
		System.out.println("li2  after Collections.sort(li2); " +li2);
		Collections.sort(li2, Collections.reverseOrder());
		System.out.println("li2  after Collections.sort(li2, Collections.reverseOrder()); " +li2);
		
		Collections.sort(li2);
		System.out.println("li2  after Collections.sort(li2); for doing binarySearch "+li2);
		System.out.println("Collections.binarySearch(li2, 40) : " +Collections.binarySearch(li2, 40));
		System.out.println("Collections.binarySearch(li2, 93) : "+ Collections.binarySearch(li2, 93));
		
		List<Integer> li3 = new ArrayList<>(li2);
		System.out.println("li3 = "+li3);
		li3.add(200);
		li3.add(459);
		li3.add(65);
		li3.add(50);
		System.out.println("li3 = " +li3);
		System.out.println("li2 = " +li2);
		//li3.retainAll(li2);
		//System.out.println("li3 after retainAll = " +li3);
		li3.removeAll(li2);
		System.out.println("li3 after removeAll = " +li3);
		
	}

}

//Task1)Try to play around with all the methods 