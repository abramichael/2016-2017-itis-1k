public class Main {
	public static void main(String [] args){
	
		Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
		System.out.println("m1:");
		System.out.println(m1);
		Matrix2x2 m2 = new Matrix2x2(new double[][]{
			{1,0},
			{0,1}
		});
		// System.out.println(m2);
		Matrix2x2 m3 = m1.mult(m2);
		// System.out.println(m3);
		
		System.out.println("Inverse matrix for m1:");
		Matrix2x2 m4 = m1.getInverse();
		System.out.println(m4);
		System.out.println("m1 * inverse");
		Matrix2x2 m5 = m1.mult(m4);
		System.out.println(m5);
	}
} 