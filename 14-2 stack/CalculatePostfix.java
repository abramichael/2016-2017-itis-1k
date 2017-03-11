interface MyIntStack {
	void push(int x);
	int pop();
	boolean isEmpty();
}

class MyLinkedIntStack implements MyIntStack {
	class Elem {
		int value;
		Elem next;
		public Elem(int value, Elem next) {
			this.value = value;
			this.next = next;
		}
	}
	private Elem head;
	public void push(int x) {
		head = new Elem(x, head);
	}
	public int pop() {
		int x = head.value;
		head = head.next;
		return x;
	}
	public boolean isEmpty() {
		return (head == null);
	}


}


public class CalculatePostfix {
	public static boolean isOper(String c) {
		return (c.equals("*") || c.equals("/") ||
			c.equals("+") ||c.equals("-"));
	}

	public static int calculate(String oper, int x, int y) {
		switch (oper) {
			case "*": return x * y;
			case "/": return x / y;
			case "+": return x + y;
			case "-": return x - y;
			default: return 0;
		}
	}
	public static void main(String [] args) {

		String input = (new java.util.Scanner(System.in)).nextLine();
		String [] input_array = input.split(",");
		MyIntStack st = new MyLinkedIntStack();
		for (String item: input_array) {
			if (isOper(item)) {
				int result = calculate(item, st.pop(), st.pop());
				st.push(result);
			} else {
				int x = Integer.parseInt(item);
				st.push(x);
			}
		}
		System.out.println(st.pop());



	}

}