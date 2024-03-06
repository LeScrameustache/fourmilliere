package geometrie;

public class Point {
	protected double x;
	protected double y;
	
	public Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	public void translation(double dx, double dy) {
			this.x = this.x +dx;
			this.y=this.y + dy;
	}
	
	public void translation(Vecteur v) {
		this.x = this.x +v.getX();;
		this.y = this.y + v.getY();
}
	
	public double distance(Point p) {
		double a = this.x - p.x;
		double b = this.y - p.y;
		a = Math.pow(a,2);
		b = Math.pow(b,2);
		return Math.sqrt(a + b);
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}




	@Override	
	public String toString() {
		return "( "+this.x+" ; "+this.y+" )";
	}


}
