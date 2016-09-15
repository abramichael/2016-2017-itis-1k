public class LimitClass {

	public static void main(String [] args) {
	
		int n = 1;
		double sign = 1;
		final double EPS = 1e-9;
		double current = 1;
		double prev;
		
		do {
			prev = current;
			n += 1;
			sign *= -1;
			current = sign / (n * n);
			System.out.println(current);
		}
		while (Math.abs(current - prev) > EPS);
		System.out.println(current);
	
	}

}