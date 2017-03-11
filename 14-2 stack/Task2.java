public class Task2 {

	public static void main(String [] args) throws Exception {

		String s = "(1+2)";
		ICharStack st = new LinkedCharStack();
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			System.out.println(c);
			if (c == '(') {
				st.push('(');
				System.out.println(1);
			}
			else if (c == ')') {
				if (st.isEmpty()) {
					throw new Exception("more ) than (");
				}
				st.pop();
				System.out.println(2);
			}
		}

		if (st.isEmpty()) {
			System.out.println("everything is OK");
		}
		else {
			throw new Exception("more ( than )");
		}




	}




}