public class Vector2D {
	private double x, y;
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}	
	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Vector2D add(Vector2D v) {
		Vector2D result =
				new Vector2D(x + v.getX(), y + v.getY());
		return result;
	}
	
	public String toString() {
		return "<" + x + ", " + y + ">";
	}
	
}