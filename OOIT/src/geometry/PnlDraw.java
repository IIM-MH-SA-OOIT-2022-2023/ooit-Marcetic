package geometry;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;
public class PnlDraw extends JPanel {

	/**
	 * Create the panel.
	 */
	public PnlDraw() {

	}
	
	private static final long serialVerionUID=1L;
	
	
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
	
	public ArrayList<Shape> getShapes(){
		return shapes;
	}
}
