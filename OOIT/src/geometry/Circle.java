package geometry;

public class Circle extends Shape {
	private Point center;
	private double r;

	
	
	public Circle () {
		
	}
	
	public Circle(Point center, double r) {
		this.center=center;
		this.r=r;
	}
	
	public Circle(Point center, double r, boolean selected) {
		this.center=center;
		this.r=r;
		this.selected=selected;
	}
	
	public boolean contains(int x, int y) {
		return center.distance(x,y)<=r;
	}
	
	public boolean contains(Point p) {
		return center.distance(p.getX(), p.getY())<=9;
	}
	@Override
	public String toString() {
		return "Center: " + center + ", radius: " + r;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle temp=(Circle) obj;
			if(temp.getCenter().equals(getCenter())  && temp.getR()==r){
				return true;
			}
		}
		return false;
	}
	
	public double circumference () {
		return 2*r*Math.PI;
	}
	public double area() {
		return r*r*Math.PI;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	
}
