package eg1;

public class Demo1 {

	public static void main(String[] args) {
		Float i1 = 10899765219.768f;
		Float i2 = 10899765219.768f;
		Float i3 = new Float(10899765219.768f);
		System.out.println("i1 = " +i1);
		System.out.println("i2 = " +i2);
		System.out.println("i3 = " +i3);
		System.out.println("i1==i2 " +(i1==i2));
		System.out.println("i1==i3 " +(i1==i3));
		
		System.out.println("i1.equals(i2)) " +(i1.equals(i2)));
		System.out.println("i1.equals(i3)) " +(i1.equals(i3)));
		
		float x = i1; 
		System.out.println("x = "+x);
		x = 1000;
		i1 = x;
		System.out.println("i1 = " +i1);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
	
		String s = "33";
		float age = Float.parseFloat(s);
		System.out.println("age = " +age);
		
		age = 19;
		s = age+"";
		System.out.println("s = "+s);
		Float i5 = 1676678.19f;
		s = i5.toString();
		System.out.println("s = " +s);
		
		System.out.println(Float.toHexString(10899765219.768f));
	
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("i5 = "+i5);
		System.out.println("i5.compareTo(1676678.19f) " +i5.compareTo(1676678.19f));
		System.out.println("i5.compareTo(167666678.19f) " +i5.compareTo(167666678.19f));
		System.out.println("i5.compareTo(16778.19f) " +i5.compareTo(16778.19f));
		
		Double d = 1567.97;
		float f = d.floatValue();
		System.out.println("f = " +f);

	}
}
