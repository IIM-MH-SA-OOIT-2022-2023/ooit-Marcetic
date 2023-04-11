package geometry;

import java.awt.Graphics;

public class Line extends Shape{
	private Point startPoint;
	private Point endPoint;
	
	public Line () {
		
	}
	public Line (Point startPoint, Point endPoint) {
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	
	public Line (Point startPoint, Point endPoint, boolean selected) {
		this.startPoint=startPoint;
		this.endPoint=endPoint;
		this.selected=selected;
	}
	
	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	
	public boolean contains(int x, int y) {
		return (startPoint.distance(x, y)+endPoint.distance(x, y))-length()<=2; 
	}
	
	@Override
	public String toString() {
		return startPoint+ "->" +endPoint;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line temp=(Line) obj;
			if(startPoint.equals(temp.getStartPoint()) && endPoint.equals(temp.getEndPoint()))
					return true;
			}
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Line) {
			Line temp = (Line)o;
			return ((int)(this.length()-temp.length()));
		}
		return 0;
	}
	
	
	@Override
	public void moveOn(int x, int y) {
		int midX = (startPoint.getX() + endPoint.getX())/2;
		int midY = (startPoint.getY() + endPoint.getY())/2;
		int dx = x - midX;
		int dy = y - midY;
		this.startPoint.moveBy(dx, dy);
		this.endPoint.moveBy(dx, dy);
	}
	
	@Override
	public void moveBy(int dx, int dy) {
		this.startPoint.moveOn(this.startPoint.getX() + dx, this.startPoint.getY() + dy);
		this.endPoint.moveOn(this.endPoint.getX() + dx, this.endPoint.getY() + dy);
	}	
	
	
	public boolean contains(Point p) {
		return contains(p.getX(),p.getY());
	}
	
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(),
				endPoint.getX(), endPoint.getY());
		
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	
}
