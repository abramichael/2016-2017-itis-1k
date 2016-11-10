abstract class A {
	
	abstract public Object f(int x);

}

public class MyMy {

	public String f(int x) {
		return "abc";
	}

	public static void main(String [] args) {
		String s = (new MyMy()).f(1);
	}

}