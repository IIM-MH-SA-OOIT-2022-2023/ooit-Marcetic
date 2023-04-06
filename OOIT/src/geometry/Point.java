package geometry;

import java.awt.Graphics;

public class Point extends Shape implements Moveable{
	
	//	OBELEZJA
	private int x;
	private int y;
	
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(int x, int y, boolean selected) {
		this.x=x;
		this.y=y;
		this.selected=selected;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public double distance(int x, int y) {
		int dx = this.x - x;
		int dy = this.y - y;
		double d = Math.sqrt((dx*dx)+(dy*dy));
		return d;
	}
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			 Point temp=(Point) obj;
			 if(x==temp.x && y==temp.y) {
				 return true;
			 }
		}
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Point) {
			Point temp = (Point)o;
			return ((int)(this.distance(0, 0) - temp.distance(0, 0))); 
		}
		return 0;
	}
	
	@Override
	public void moveOn(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}
	
	public void draw(Graphics g) {
		g.drawLine(this.x - 2, this.y, this.x + 2, this.y);
		g.drawLine(this.x, this.y - 2, this.x, this.y + 2);
		if(selected) {
			g.drawRect(this.x - 4, this.y - 4, 8, 8);
		}
	}
	
	public boolean contains(int x, int y) {
		return this.distance(x, y)<=2;
		
	}
	
	// GETTERS I SETTERS
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	
	
}
