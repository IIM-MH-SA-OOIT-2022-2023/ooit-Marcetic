package geometry;

public class Line extends Shape{
	private Point startPoint;
	private Point endPoint;
	
	public Point getStartPoint() {
		return startPoint;
	}
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
		return "";
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
	
	
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	
}
