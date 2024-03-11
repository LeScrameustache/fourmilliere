package monde;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public class Nourriture extends Point{
	private int quantite;
	
	public Nourriture(Point p, int quantite) {
		super(p);
		this.quantite = quantite;
	}


	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(this.x, this.y, 15, 15);
	}
	
	
}
