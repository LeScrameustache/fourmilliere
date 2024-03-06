package geometrie;

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

}
