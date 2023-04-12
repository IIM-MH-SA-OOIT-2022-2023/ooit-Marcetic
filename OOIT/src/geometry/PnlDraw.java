package geometry;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

public class PnlDraw extends JPanel {

	/**
	 * Create the panel.
	 */
	public PnlDraw() {

	}
	
	
	private Shape selected;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	
	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(Shape s: shapes) {

			if(s.isSelected())
			{
			g.setColor(s.getC());
			s.draw(g);
			}
			else {
				s.draw(g);
			}
			
		}
				
	}
	
	public Shape getSelected() {
		return selected;
	}
	
	public ArrayList<Shape> getShapes(){
		return shapes;
	}
}
