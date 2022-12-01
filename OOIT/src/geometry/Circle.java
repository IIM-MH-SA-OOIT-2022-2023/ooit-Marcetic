package geometry;

public class Circle {
	private Point center;
	private double r;
	private boolean selected;
	
	
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
	@Override
	public String toString() {
		return "Center: " + center + ", radius: " + r;
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
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
