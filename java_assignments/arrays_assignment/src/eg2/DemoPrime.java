package eg2;

import java.util.Arrays;

public class DemoPrime {

	public static void main(String[] args) {
		int ar[] = {12, 33, 11, 62, 344, 11, 12, 35, 22, 15, 11, 23, 11, 44, 11, 22, 11, 55};
		
		
		//Print the array in reverse order
		System.out.println("Array elements in reverse order");
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
			}
	
		//delete a specific element from an array
		System.out.println();
		int newar[] = new int [ar.length - 1];
		
		int removeIndex = 7;
		for (int i = 0, j = 0; i < ar.length; i++) {
			if (i != removeIndex) {
				newar[j++] = ar[i];
			}
		}
		
		System.out.println("\nar[] after deletion");
		for (int i = 0; i < newar.length; i++) {
			System.out.print(newar[i] + " ");
		}
		
		//find all the even numbers and put it in a new array and also find all the odd numbers and put it in another array
		System.out.println();
		int oddCounter = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 1) {
				oddCounter++;
			}
			
		}

		int odd[] = new int[oddCounter];
		oddCounter = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 1) {
				odd[oddCounter] = ar[i];
				oddCounter++;
			}
			
		}

		
		System.out.println("\nPrinting contents of odd[]");
		
		for (int i = 0; i < odd.length; i++) {
			System.out.print(odd[i] + " ");
		}

		
		System.out.println();
		int evenCounter = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				evenCounter++;
			}
		}

		int even[] = new int[evenCounter];
		evenCounter = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				even[evenCounter] = ar[i];
				evenCounter++;
			}		
		}

		
		System.out.println("\nPrinting contents of even[]");
		for (int i = 0; i < even.length; i++) {
			System.out.print(even[i] + " ");
		}
		
		
		//find sum of all even and odd numbers separately and print the max of it
		System.out.println();
		System.out.println("\nPrinting the max of the sum of even vs odd numbers in the array");
		int sumeven = 0;
		int sumodd = 0;
		for(int num:even) {
			sumeven = sumeven + num;
		}
		System.out.println("Sum of even numbers = " + sumeven);
		for(int num:odd) {
			sumodd = sumodd + num;
		}
		System.out.println("Sum of odd numbers = " + sumodd);
		if (sumeven > sumodd) {
			System.out.println("sumeven is greater than sum odd");
		} else if (sumeven < sumodd){
			System.out.println("sum odd is greater than sum even");
		}
		
		
		
		//find the minimum and maximum element in an array
		Arrays.sort(ar);
		System.out.println("\nMax element in the array = " +(ar[ar.length-1]));
		System.out.println("Min element in the array = " +(ar[0]));
		
		
		//find all Palindrome numbers in the array
		
		System.out.println("\nPalindrome numbers in the array");
		for (int i = 0; i < ar.length; i++) {
			String str = Integer.toString(ar[i]);
			if (new StringBuffer(str).reverse().toString().equals(str)) {
				System.out.print(str + " ");
			}
			
		}	
		
		
	}
	
}
//Tasks
/*
*1)Print the array in reverse order
*2)Delete specific element from an array
*3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
*4)Find the sum of all even and odd numbers separately and print the max out of it.(max of sum of even vs odd)
*5)Find the minimum and the maximum element in an array
*6)Find all Palindrome numbers in an array 
*/
