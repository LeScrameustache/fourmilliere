package monde;

import geometrie.Point;
import geometrie.Vecteur;

public class Fourmi {
	protected Point position;
	protected Vecteur direction;
	protected Fourmilliere fourmillere;
	protected boolean estChargee;
	protected boolean estVivante;
	
	
	public Fourmi(Fourmilliere f) {
		this.position = f.getPosition();
		this.direction = new Vecteur(0,0);
		this.fourmillere=f;
		this.estChargee=false;
	}
	
	public void explore() {
		this.direction.setX(2*Math.random()-1);
		this.direction.setY(2*Math.random()-1);
		this.position.translation(direction);
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Vecteur getDirection() {
		return direction;
	}

	public void setDirection(Vecteur direction) {
		this.direction = direction;
	}

	public Fourmilliere getFourmillere() {
		return fourmillere;
	}

	public void setFourmillere(Fourmilliere fourmillere) {
		this.fourmillere = fourmillere;
	}

	public boolean isEstChargee() {
		return estChargee;
	}

	public void setEstChargee(boolean estChargee) {
		this.estChargee = estChargee;
	}

	public boolean isEstVivante() {
		return estVivante;
	}

	public void setEstVivante(boolean estVivante) {
		this.estVivante = estVivante;
	}
	
	
	
}
