package eg1;

public class TitleCase {

	public static void main(String[] args) {
		// Convert every word's last character to upper case and write back the sentence
		
		String s = "hello hi good evening how are you doing today";
		StringBuilder sb = new StringBuilder();
		
		String ar[] = s.split(" ");
		
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i].substring(0, ar[i].length() - 1) + Character.toUpperCase(ar[i].charAt(ar[i].length()-1)) + " ");    
		}
		
		System.out.println(sb);

	}
}
