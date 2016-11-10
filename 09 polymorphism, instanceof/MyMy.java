abstract class A {
	
	abstract public Object f(int x);

}

public class MyMy extends A{

	public String f(int x) {
		return "abc";
	}

	public static void main(String [] args) {
		A a = new MyMy();
		String s = (String) a.f(1);
		MyMy a2 = new MyMy();
		String s2 = a2.f(1);
	}

}