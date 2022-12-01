package geometry;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
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
		this.startPoint = startPoint;
	}
	
	
	public String toString() {
		return "";
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
