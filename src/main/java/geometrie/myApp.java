package geometrie;

import monde.Fourmiliere;

import java.awt.Point;

import monde.Fourmi;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testPoint();
		//testFourmi();
		System.out.println(Vecteur.VECTEURS_ELEMENTAIRES);
		testCaseOrientee();
		testFourmiliere();
		testFourmi();
	}
	
	public static void testCaseOrientee() {
		CaseOrientee c = new CaseOrientee(2,2,new Vecteur(1,-1));
		System.out.println(c.toString());
		//CaseOrientee d = new CaseOrientee(2,2,new Vecteur(1,-2));
		//System.out.println(c.toString());
	}
	
	public static void testFourmiliere() {
		Fourmiliere f = new Fourmiliere(new Point(42,42), 10);
		System.out.println(f);
	}


	public static void testFourmi() {
		Fourmiliere f = new Fourmiliere(new Point(42,42), 10);
		Fourmi foufou = f.getListeFourmis().get(0);
		for(int i=0;i<10;i++) {
			foufou.seDeplace();
			System.out.println(foufou.toString());
		}
		f.addPheromone(foufou);
		System.out.println(foufou.estSurChemin() );
		for(int i=0;i<10;i++) {
			foufou.seDeplace();
			System.out.println(foufou.toString());
		}
		System.out.println(foufou.estSurChemin() );
		
	}

}
