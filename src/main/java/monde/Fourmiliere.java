package monde;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import geometrie.CaseOrientee;

public class Fourmiliere extends Point{

	private static final long serialVersionUID = 3189950795245184525L;
	private int population;
	private List<Fourmi> listeFourmis;
	private List<CaseOrientee> pheromones;

	public Fourmiliere(Point position, int population) {
		super(position.x,position.y);
		this.pheromones=new ArrayList<CaseOrientee>();
		this.population = population;
		this.listeFourmis = new ArrayList<Fourmi>();
		for (int i = 0; i < this.population; i++) {
			this.listeFourmis.add(new Fourmi(this));
		}
	}
	
	public void addPheromone(CaseOrientee c) {
		this.pheromones.add(new CaseOrientee(c));
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(this.x, this.y, 15, 15);
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public List<Fourmi> getListeFourmis() {
		return listeFourmis;
	}

	public void setListeFourmis(List<Fourmi> listeFourmis) {
		this.listeFourmis = listeFourmis;
	}

	public List<CaseOrientee> getPheromones() {
		return pheromones;
	}

	public void setPheromones(List<CaseOrientee> pheromones) {
		this.pheromones = pheromones;
	}


	
	

}
