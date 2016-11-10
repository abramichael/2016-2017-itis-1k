import java.util.Scanner;
public class TestClass {
	

	public static void sop(Object o) {
		if (o instanceof String) {
			//System.out.println(o.getClass().getName());
			System.out.print("THIS IS STRING: ");
			String s = (String) o;
			System.out.print("length: " + s.length() + " ");
		}
		else {
			System.out.print("THIS IS NOT STRING: ");	
		}
		System.out.println(o);
	}

	public static void main(String [] args) {
		String abc = "11-601 group";
		Thread t1 = new Thread();
		Scanner sc = new Scanner(System.in);
		TestClass tc = new TestClass();
		sop(abc);
		sop(t1);
		sop(sc);
		sop(tc);
	}

}