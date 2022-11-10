package geometry;

public class Test {

	public static void main(String[] args) {
		
		Point p1=new Point();
		p1.setX(5);
		System.out.println("Koordinata x tacke p1 je:" +p1.getX());
		
		p1.setY(7);
		System.out.println("Koordinata y tacke p2 je:" +p1.getY());
		
		Point p2=new Point();
		 p2.setX(6);
		 p2.setY(7);
		 
		 double dist=p1.distance(p2.getX(), p2.getY());
		 System.out.println("Udaljenost tacaka je:" + dist);
		 
		 Line l1=new Line();
		 l1.setStartPoint(p1);
		 l1.setEndPoint(p2);
		 int odtacke=p2.getX();
		 int x=l1.getEndPoint().getX();
		 System.out.println("Obe vrednosti " + odtacke + " " + x);
	}

}
