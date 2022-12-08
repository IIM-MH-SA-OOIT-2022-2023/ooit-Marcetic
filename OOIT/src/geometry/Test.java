package geometry;

import zadaci.Computer;

public class Test {

	public static void main(String[] args) {
		/*
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
		 l1.setEndPoint(p1);
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
		 
		
		Computer c1=new Computer(); //c1 je promenljiva/referenca, konstruktor je zaduzen za instaciranje objekata
		c1.setRam(15);
		
		
		Automobil a1=new Automobil(true,3);
		a1.promeniBrzinu()
		
		*/
		
		Point p1=new Point(5,5);
		Point p2=new Point (5,5);
		System.out.println(p1.toString());
		Line l1=new Line(p1,p2);
		Rectangle r1= new Rectangle (p2,50,50,false);
		Circle c1=new Circle(p1,50,true);
		Line l=new Line(new Point(5,7), new Point(8,9));
		System.out.println(l.toString());
		
		
		Rectangle r=new Rectangle(p2, 5, 6,false);
		System.out.println(r.toString());
		
		System.out.println(p1==p2);
		System.out.println(15==15);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(c1));
		System.out.println(l1.equals(p1));
		
		
		Circle c=new Circle(new Point(3,5),8);
		System.out.println(c.area());
		
		Donut d=new Donut(new Point(3,5),8,3);
		System.out.println(d.area());
		
		
		Point p = new Point(3,5);
		System.out.println(c.equals(d));
		System.out.println(d.equals(c));
		
		
	}

}
