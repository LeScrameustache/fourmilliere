package geometrie;

import monde.Fourmilliere;
import monde.Fourmi;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPoint();
	}
	
	public static void testPoint() {
		Point A= new Point(0,5);
		Point B = new Point(-1,-1);
		System.out.println("A "+A.toString());
		System.out.println("xA = "+A.getX());
		System.out.println("yA = "+A.getY());
		
		System.out.println("B "+B.toString());
		
		B.translation(1, 1);
		
		System.out.println("B "+B.toString());
	}
	
	public static void testFourmi() {
		Fourmilliere f = new Fourmilliere(new Point(0.0,0.0));
		Fourmi f1 = new Fourmi(f) ;
		
	}

}
