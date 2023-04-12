package geometry;

import java.awt.Graphics;

public class Donut extends Circle{
	private int innerR;
	
	public Donut() {
		
	}
	
	public Donut(Point center, int r, int innerR) {
		super(center, r);
		this.innerR=innerR;
	}
	
	public Donut(Point center, int r, int innerR, boolean selected) {
		super(center,r,selected);
		this.innerR=innerR;
	}
	
	
	@Override
	public boolean contains(Point p) {
		return this.contains(p.getX(),p.getY());
	}
	

	@Override
	public double area() {
		return super.area() - innerR*innerR*Math.PI;
	}
	
	@Override
	public double circumference() {
		return super.circumference() + 2*innerR*Math.PI;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", inner radius: " + innerR;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Donut) {
			Donut temp = (Donut) obj;
			if(super.equals( new Circle(temp.getCenter(), temp.getR())) && temp.getInnerR() == innerR) {
				return true;
			}
		}
		return false;	
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(center.getX()-innerR, center.getY()-innerR,
				innerR*2, innerR*2);
		if(selected) {
			g.drawRect(getCenter().getX() - innerR - 3, getCenter().getY() - 3, 6, 6);
			g.drawRect(getCenter().getX() + innerR - 3, getCenter().getY() - 3, 6, 6);
			g.drawRect(getCenter().getX() - 3, getCenter().getY() - innerR - 3, 6, 6);
			g.drawRect(getCenter().getX() - 3, getCenter().getY() + innerR - 3, 6, 6);
		}
	}
	
	public int getInnerR() {
		return innerR;
	}

	public void setInnerR(int innerR) {
		this.innerR = innerR;
	}
	
	
}
