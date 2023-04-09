package geometry;

import java.awt.Graphics;
import java.awt.Color;

public abstract class Shape implements Moveable, Comparable<Object>{
	protected boolean selected;
	private Color c;
	
	public Shape () {
		
	}
	
	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}
	
	public abstract boolean contains(int x, int y);
	
	public Shape(boolean selected) {
		this.selected=selected;
	}
	
	public abstract void draw(Graphics g);

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	

	
	
}
