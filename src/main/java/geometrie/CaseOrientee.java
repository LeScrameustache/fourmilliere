package geometrie;

import java.awt.Point;

public class CaseOrientee extends Point {

	private static final long serialVersionUID = -3369842634544815187L;
	protected Vecteur direction;
	
	public CaseOrientee(int x, int y, Vecteur direction) throws IllegalArgumentException {
		super(x, y);
		if (!(Vecteur.VECTEURS_ELEMENTAIRES.contains(direction))) {
			throw new IllegalArgumentException("Entrez un vecteur élémentaire (voir classe Vecteur)");
		} else {
			this.direction = direction;
		}
	}

	public CaseOrientee(Point p, Vecteur direction) throws IllegalArgumentException{
		super(p);
		if (!(Vecteur.VECTEURS_ELEMENTAIRES.contains(direction))) {
			throw new IllegalArgumentException("Entrez un vecteur élémentaire (voir classe Vecteur)");
		} else {
			this.direction = direction;
		}
	}
	
	public CaseOrientee(CaseOrientee c) {
		super(c.x,c.y);
		this.direction=c.direction;
	}
	
	public Vecteur getDirection() {
		return direction;
	}

	public void setDirection(Vecteur direction) {
		this.direction = direction;
	}

}
