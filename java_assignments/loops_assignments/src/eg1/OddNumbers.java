package eg1;

public class OddNumbers {

	public static void main(String[] args) {
		oddNumbers(16);
	}
	public static void oddNumbers(int n) {
		
		System.out.println("Odd Numbers");
		for (int i = 1; i <= n; i++) {
			if (i%2 == 1) { 
				System.out.print(i +" ");
			}
	
		}
	}
}
