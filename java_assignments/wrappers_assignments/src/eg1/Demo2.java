package eg1;

public class Demo2 {

	public static void main(String[] args) {
			Long i1 = 222222222222222222L;
			Long i2 = 222222222222222222L;
			Long i3 = new Long(222222222222222222L);
			System.out.println("i1 = " +i1);
			System.out.println("i2 = " +i2);
			System.out.println("i3 = " +i3);
			System.out.println("i1==i2 " +(i1==i2));
			System.out.println("i1==i3 " +(i1==i3));
			
			System.out.println("i1.equals(i2)) " +(i1.equals(i2)));
			System.out.println("i1.equals(i3)) " +(i1.equals(i3)));
			
			long x=i1; //Autoboxing
			System.out.println("x = " +x);
			x=1000;
			i1=x;
			System.out.println("i1 = " +i1);
			
			System.out.println(Long.MAX_VALUE);
			System.out.println(Long.MIN_VALUE);
			
			String s = "33";
			long age=Long.parseLong(s);  
			System.out.println("age = " +age);
			
			age = 29;
			s = age+"";
			System.out.println("s = " +s);
			Long i5 = 1003553647770L;
			s = i5.toString();
			System.out.println("s = "+s);
			
			System.out.println(Long.toBinaryString(222222222222222222L));
			System.out.println(Long.toHexString(222222222222222222L));
			System.out.println(Long.toOctalString(222222222222222222L));
			
			//compareTo 
			System.out.println("i5 = "+i5);
			System.out.println("i5.compareTo(1003553647770L) "+i5.compareTo(1003553647770L));
			System.out.println("i5.compareTo(1003553664647770L) "+i5.compareTo(1003553664647770L));
			System.out.println("i5.compareTo(1003553770L) "+i5.compareTo(1003553770L));
			
			Double d = 43412.55;
			long l = d.intValue();
			System.out.println("l = "+l);


	}

}
