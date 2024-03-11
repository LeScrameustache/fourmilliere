package monde;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import geometrie.CaseOrientee;
import geometrie.Vecteur;

public class Fourmi extends CaseOrientee {

	private static final long serialVersionUID = 4978851011182737641L;
	protected Fourmiliere fourmiliere;
	protected boolean estChargee;
	protected boolean estVivante;

	public Fourmi(Point position) {
		super(position,new Vecteur(0,0));
		this.fourmiliere = null;
		this.estChargee = false;
		this.estVivante = true;
	}

	public Fourmi(Fourmiliere f) {
		super(new Point(f),new Vecteur(0,0));
		this.fourmiliere = f;
		this.estChargee = false;
		this.estVivante = true;
	}

	public void explore() {
		int dir = (int) (9*Math.random()) ;
		this.direction = new Vecteur(Vecteur.VECTEURS_ELEMENTAIRES.get(dir));
	}

	public void seDeplace() {
		if (this.estChargee) {
			this.retourneFourmiliere();
		} else if (! this.estSurChemin()){
		   this.explore();
		} else {
			this.direction = new Vecteur(this.fourmiliere.getPheromones().get(this.fourmiliere.getPheromones().indexOf(this)).getDirection());
		}
		this.translate(this.direction.getX(), this.direction.getY());
	}
	
	public boolean estSurChemin() {
		return this.fourmiliere.getPheromones().contains(this);
	}

	public void ramasseNourriture(Nourriture n) {
		if (this.equals(n)) {
			this.estChargee=true;
		}
	}

	public void retourneFourmiliere() {
		Vecteur v = new Vecteur(this,this.fourmiliere);
		this.direction = v.toVecteurElementaire();
		if (! this.estSurChemin()) {
			this.fourmiliere.addPheromone(new CaseOrientee(this.x,this.y, direction.fois(-1)));
		}
		if (this.estSurFourmiliere()) {
			this.estChargee=false;
		}
	}
	
	public boolean estSurFourmiliere() {
		return (this.x==this.fourmiliere.x && this.y == this.fourmiliere.y);
	}

	public void meurt() {
		this.estVivante = false;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(this.x, this.y, 3, 3);
	}


	public Fourmiliere getFourmiliere() {
		return fourmiliere;
	}

	public void setFourmillere(Fourmiliere fourmillere) {
		this.fourmiliere = fourmillere;
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

	@Override
	public String toString() {
		return "Fourmi [position=("  +super.toString() + "direction = "+this.direction.toString()+", fourmillere=" + fourmiliere + ", estChargee=" + estChargee
				+ ", estVivante=" + estVivante + "]";
	}

}
