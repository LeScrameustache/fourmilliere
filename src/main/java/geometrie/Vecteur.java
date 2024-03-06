package geometrie;

public class Vecteur {
	protected double x;
	protected double y;
	
	public Vecteur(double x,double y) {
		this.x = x;
		this.y=y;
	}
	
	public Vecteur(Point a,Point b) {
		this.x=b.getX() - a.getX();
		this.y=b.getY() - a.getY();
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
	
	

}
