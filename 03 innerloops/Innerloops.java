public class Innerloops {

	public static void main(String [] args) {
	
		int n = 10;
		
		//1! + 2! + ... + n! 
		long t1 = System.nanoTime();
		long s = 0;
		
		// bad solution
		for (int i = 1; i <= n; i++) {
			long p = 1;
			for (int j = 1; j <= i; j++) {
				p *= j;
			}
			s += p;
		}
		System.out.println(System.nanoTime() - t1);
		t1 = System.nanoTime();
		long p = 1;
		s = 0;
		
		// good solution
		for (int i = 1; i <= n; i++) {
			p *= i;
			s += p;
		}
		System.out.println(System.nanoTime() - t1);
		
		// counting the square of n
		t1 = System.nanoTime();
		int x = (int) Math.pow(n, 2);
		System.out.println(System.nanoTime() - t1);
		
		t1 = System.nanoTime();
		x = n * n;
		System.out.println(System.nanoTime() - t1);
		
		
		
		
		
	}

}