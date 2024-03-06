package geometrie;

public class Voisinage extends Point {
	private double rayon;

	public Voisinage(Point p,double rayon) {
		super(p);
		this.rayon = rayon;
	}
	
	public double distance(Voisinage v) {
		return super.distance(v.getCentre())-this.rayon-v.rayon;
	}
	
	public boolean intersection(Voisinage v) {
		return (this.distance(v)<0);
	}
	
	public Point getCentre() {
		return new Point(this.x,this.y);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
