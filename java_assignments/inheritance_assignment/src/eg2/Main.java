package eg2;

public class Main {

	public static void main(String[] args) {
		
		Address ap1 = new Address(435, "Val Vista Dr", "Mesa", 85204);
		Address at1 = new Address(7, "Baseline Rd", "Gilbert", 85233);
		Team t1 = new Team(15, "WI cricket team", "Phil Simmons");
		Player py1 = new Player(520, t1);
		Project p1 = new Project(9000, "Abc Corp", "Abc Corp Some Client");
		
		Employee e1=new  Employee(100, "Sachin", "Manager", 23333.44, p1, ap1, at1, py1);
		System.out.println("e1");
		System.out.println(e1);
		
		Address ap2 = new Address(49, "Gilbert Rd", "Chandler", 85286);
		Address at2 = new Address(7, "E Southern Ave", "Tempe", 85282);
		Team t2 = new Team(23, "IND cricket team", "Ravi Shastri");
		Player py2 = new Player(842, t2);
		Employee e2 = new Employee(101, "Richard", "Associate", 2000.33, p1, ap2, at2, py2);
		System.out.println("e2");
		System.out.println(e2);
		
		Address ap3 = new Address(15, "Ray Rd", "Phoenix", 85044);
		Address at3 = new Address(63, "University Dr", "Mesa", 85203);
		Team t3 = new Team(23, "AUS cricket team", "Justin Langer");
		Player py3 = new Player(791, t3);
		Project p2 = new Project(9001, "SMS", "Revature");
		Employee e3 = new Employee(102, "Tushar", "Manager", 33000.33, p2, ap3, at3, py3);
		System.out.println("e3");
		System.out.println(e3);
		
		

	}
}//Complete Address, Player and Team
