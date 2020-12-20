package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
	
		List<Integer> li1 = new ArrayList<>();
		li1.add(12);
		li1.add(33);
		li1.add(11);
		li1.add(62);
		li1.add(344);
		li1.add(11);
		li1.add(12);
		li1.add(35);
		li1.add(22);
		li1.add(15);
		li1.add(11);
		li1.add(23);
		li1.add(11);
		li1.add(44);
		li1.add(11);
		li1.add(22);
		li1.add(11);
		li1.add(55);
		System.out.println("li1 = " +li1);
		
		List<Integer> li2 = new ArrayList<>(li1);
		Collections.reverse(li2);
		System.out.println("\n\nli2  after Collections.reverse(li2); " +li2);  //reverse the order
		
		List<Integer> li3 = new ArrayList<>(li1);
		li3.remove(7);
		System.out.println("\nli3 after li3.remove(7) = " +li3);  //delete a specific element from the original
		
		
		
		List<Integer> li4 = new ArrayList<>();
		System.out.println("\nAll the even numbers in a new array in the original list");
		for (Integer i:li1) {
			if (i%2 == 0) {
				li4.add(i);
			}	
		}
		
		System.out.print(li4);
		int sumeven = 0;
		for (Integer i:li4) {
			sumeven = sumeven + i;
		}
		System.out.println("\n\nSum of the even elements = " +sumeven);
		
		List<Integer> li5 = new ArrayList<>();
		System.out.println("\n\nAll the odd numbers in a new array in the original list");
		for (Integer j:li1) {
			if (j%2 != 0) {
				li5.add(j);
			}
		}
		System.out.print(li5);
		
		int sumodd = 0;
		for (Integer i:li5) {
			sumodd = sumodd + i;
		}
		System.out.println("\n\nSum of the odd elements = " +sumodd);
		
		if (sumeven > sumodd) {
			System.out.println("sumeven is greater than sum odd");
		} else if (sumeven < sumodd){
			System.out.println("sum odd is greater than sum even");
		}
		
		
		System.out.println("\nThe max element = " +Collections.max(li3));
		
		System.out.println("The min element = " +Collections.min(li3));
		
		System.out.println("\nPalindrome numbers are ");
		for (Integer i:li3) {
			String str = i.toString();
			if (new StringBuffer(str).reverse().toString().equals(str)) {
				System.out.print(str + " ");	
			}
		}
		
		
		
	}

}
