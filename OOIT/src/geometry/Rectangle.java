package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape {
	private Point upperLeft;
	private int width;
	private int height;
	
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft=upperLeft;
		this.width=width;
		this.height=height;
	}
	
	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this.upperLeft=upperLeft;
		this.width=width;
		this.height=height;
		this.selected=selected;
	}
	
	
	public int circumference() {
		return 2*(width+height);
	}
	public int area() {
		return width*height;
	}
	
	public boolean contains(int x, int y) {
		return upperLeft.getX() < x && (upperLeft.getX()+width>x) && 
				upperLeft.getY()<y && upperLeft.getY()+height>y;
	}
	
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	
	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void moveOn(int x, int y) {
		upperLeft.moveOn(x, y);
		
	}

	@Override
	public void moveBy(int dx, int dy) {
		upperLeft.moveBy(dx, dy);
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Rectangle) {
			Rectangle temp = (Rectangle)o;
			return this.area() - temp.area();
		}
		return 0;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeft.getX(), upperLeft.getY(), width, height);
	}
	
	@Override
	public String toString() {
	return "Upper left point: "	+ upperLeft + ", width: " + width + ", height: " + height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle temp=(Rectangle) obj;
			if(temp.upperLeft.equals(upperLeft) && temp.getHeight()==height && temp.getWidth()==width){
				return true;
			}
		}
		return false;
	}
	
}
