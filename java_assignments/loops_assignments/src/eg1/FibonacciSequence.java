package eg1;

public class FibonacciSequence {

	public static void main(String[] args) {
		getSequence(2, 5, 60);

	}
	
	public static void getSequence(int a, int b, int end) {
		int first = a;
		int second = b;
		int third = a + b;
		
		System.out.println("Fibonacci Sequence");
		System.out.print(first +" ");
		System.out.print(second +" ");
		
		
		while (third < end) {
			
			System.out.print(third +" ");
			
			first = second;
			second = third;
			third = first + second;
		}
		
	}
}
