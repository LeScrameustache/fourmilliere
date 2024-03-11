package geometrie;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vecteur {
	protected int x;
	protected int y;
	
	public static final Vecteur VECT_I=new Vecteur(1,0);
	public static final Vecteur VECT_J=new Vecteur(0,1);
	public static final List<Vecteur> VECTEURS_ELEMENTAIRES;
	static {
		ArrayList<Vecteur> tmp = new ArrayList<Vecteur>();
		for(int i=-1;i<=1;i++) {
			for(int j =-1;j<=1;j++) {
				tmp.add(VECT_I.fois(i).plus(VECT_J.fois(j)));
			}
		}
		VECTEURS_ELEMENTAIRES=tmp;
	}
	
	public Vecteur(int x,int y) {
		this.x = x;
		this.y=y;
	}
	
	public Vecteur(Point a,Point b) {
		this.x=b.x - a.x;
		this.y=b.y - a.y;
	}
	
	public Vecteur(Vecteur v) {
		this.x = v.x;
		this.y=v.y;
	}
	
	public int produitScalaire(Vecteur v) {
		return this.x*v.x + this.y * v.y;
	}
	
	public double norme() {
		return Math.sqrt(this.produitScalaire(this));
	}
	
	public Vecteur fois(int i) {
		return new Vecteur(i*this.x,i*this.y);
	}

	public Vecteur plus(Vecteur v) {
		return new Vecteur(this.x+v.x,this.y+v.y);
	}
	
	public Vecteur toVecteurElementaire() {
		//voir si on peut pas faire plus simple avec une lambda-expression
		int prodScalMax = 0;
		int indexOfMax = 0;
		for(int i=0; i<VECTEURS_ELEMENTAIRES.size();i++) {
			if (prodScalMax<this.produitScalaire(VECTEURS_ELEMENTAIRES.get(i))) {
				prodScalMax=this.produitScalaire(VECTEURS_ELEMENTAIRES.get(i));
				indexOfMax=i; 
			}
		}
		return new Vecteur(VECTEURS_ELEMENTAIRES.get(indexOfMax));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+this.x +"," + this.y +")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vecteur other = (Vecteur) obj;
		return x == other.x && y == other.y;
	}
	
	

}
