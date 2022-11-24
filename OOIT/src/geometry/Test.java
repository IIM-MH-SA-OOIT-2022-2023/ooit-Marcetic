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
		 
		 
		 Point p=new Point();
		 p.setX(3);
		 p.setY(5);
		 
		 Circle c=new Circle();
		 c.setR(7);
		 c.setCenter(p);
		 
		 System.out.println("Centar kruga je tacka sa koordinatama: ");
		 System.out.println("X je:" + c.getCenter().getX());
		 System.out.println("Y je:" + c.getCenter().getY());
		 System.out.println("Poluprecnik kruga je:" + c.getR());
		 
		 double circleArea=c.area();
		 System.out.println(circleArea);
		 
		 Line l=new Line();
		 Line l2=new Line(p,p1);
		 Line l3=new Line(p,p,true);
		 Line l4=new Line(new Point(6,7), new Point (5,6));
		 
	}

}
