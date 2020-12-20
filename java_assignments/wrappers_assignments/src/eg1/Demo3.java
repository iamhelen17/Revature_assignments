package eg1;

public class Demo3 {

	public static void main(String[] args) {
			Double i1 = 9884.3792424;
			Double i2 = 9884.3792424;
			Double i3 = new Double(9884.3792424);
			System.out.println("i1 = " +i1);
			System.out.println("i2 = " +i2);
			System.out.println("i3 = "+ i3);
			System.out.println("i1==i2 " +(i1==i2));
			System.out.println("i1==i3 " +(i1==i3));
			
			System.out.println("i1.equals(i2)) " +(i1.equals(i2)));
			System.out.println("i1.equals(i3)) " +(i1.equals(i3)));
			
			double x = i1; //Autoboxing
			System.out.println("x = " +x);
			x = 1000;
			i1 = x;
			System.out.println("i1 = " +i1);
			
			System.out.println(Double.MAX_VALUE);
			System.out.println(Double.MIN_VALUE);
			
			String s = "33";
			double id = Double.parseDouble(s); 
			System.out.println("id = "+id);
			
			id = 32;
			s = id+"";
			System.out.println("s = " +s);
			Double i5 = 1046675500.8944;
			s = i5.toString();
			System.out.println("s = " +s);
			
			System.out.println(Double.toHexString(9884.3792424));
			
			//compareTo 
			System.out.println("i5 = "+i5);
			System.out.println("i5.compareTo(1046675500.8944) "+i5.compareTo(1046675500.8944));
			System.out.println("i5.compareTo(10466754444500.8944) "+i5.compareTo(10466754444500.8944));
			System.out.println("i5.compareTo(104660.8944) "+i5.compareTo(104660.8944));
			
			Long l = 142424255L;
			double d = l.longValue();
			System.out.println("d = " +d);

	}

}
