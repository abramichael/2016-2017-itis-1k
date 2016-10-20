public class Matrix2x2 {
	private double [][] matrix = new double[2][2];
	
	public Matrix2x2(double a,double b,double c,double d){
		matrix[0][0] = a;
		matrix[0][1] = b;
		matrix[1][0] = c;
		matrix[1][1] = d;
	}
	public Matrix2x2(double [][] matrix){
		this.matrix = matrix;
	}
	public String toString(){
		String s = "";
		for (int i=0;i<matrix.length;i++){
			for (int j=0;j<matrix[i].length;j++){
				s += matrix[i][j] + " ";
			}
			s += "\n";
		}
		return s;
	}
	public Matrix2x2(){
		this(0,0,0,0);
	}
	public double getDeterminant() {
		return matrix[0][0]*matrix[1][1] -
			matrix[0][1]*matrix[1][0];
	}
	public Matrix2x2 getInverse() {
		Matrix2x2 result = new Matrix2x2();
		double det = getDeterminant();
		result.matrix[0][0] = matrix[1][1] / det;
		result.matrix[0][1] = -1 * matrix[0][1] / det;
		result.matrix[1][0] = -1 * matrix[1][0] / det;
		result.matrix[1][1] = matrix[0][0] / det;
		return result;
	}
	public Matrix2x2 mult(Matrix2x2 m){
		double c;
		Matrix2x2 result = new Matrix2x2();
		for (int i=0;i<matrix.length;i++){
			for (int j=0;j<matrix[i].length;j++){
				c = 0;
				for (int k=0;k<matrix.length;k++){
					c += matrix[i][k]*m.matrix[k][j];
					
				}
				result.matrix[i][j] = c;
			}
		}
		return result;
	}
}