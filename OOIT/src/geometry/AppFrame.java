package geometry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import geometry.Shape;
import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;

public class AppFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Shape> slctd = new ArrayList<Shape>();
	private PnlDraw panel= new PnlDraw();
	private boolean selected;
	private int brojac = 0;
	private Point startPoint, endPoint;
	private Color color;
	private JToggleButton btnSelect;
	private JToggleButton btnModify;
	private JToggleButton btnDelete;
	private JToggleButton btnPoint;
	private JToggleButton btnLine;
	private JToggleButton btnRectangle;
	private JToggleButton btnColor;
	private JToggleButton btnDonut;
	private JToggleButton btnCircle;
	private DlgRectangle dlgRectangle;

	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Create the frame.
	 */
	public AppFrame() {
		
		JPanel buttons = new JPanel();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		contentPane.add(buttons, BorderLayout.SOUTH);
		
		panel.setBorder(new LineBorder(new Color(0,0,0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		 
		 
		  btnSelect = new JToggleButton("Select");
		  buttons.add(btnSelect);
		  buttonGroup.add(btnSelect);
		 
		 
		 btnDelete = new JToggleButton("Delete");
		 buttons.add(btnDelete);
		 buttonGroup.add(btnDelete);
			
		
		
		 btnPoint = new JToggleButton("Point");
		buttons.add(btnPoint);
		buttonGroup.add(btnPoint);
		
		
		 btnLine = new JToggleButton("Line");
		buttons.add(btnLine);
		buttonGroup.add(btnLine);
		
		
		 btnRectangle = new JToggleButton("Rectangle");
		buttons.add(btnRectangle);
		buttonGroup.add(btnRectangle);
		
		 btnCircle = new JToggleButton("Circle");
		buttons.add(btnCircle);
		buttonGroup.add(btnCircle);
		
		
		btnDonut = new JToggleButton("Donut");
		buttons.add(btnDonut);
		buttonGroup.add(btnDonut);
		
		
		btnColor = new JToggleButton("Color");
		buttons.add(btnColor);
		buttonGroup.add(btnColor);
		
		btnModify = new JToggleButton("Modify");
		buttons.add(btnModify);
		buttonGroup.add(btnModify);
		
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnSelect.isSelected()) {
					for(Shape s : panel.getShapes()){
						if(s.contains(e.getX(),e.getY()))
						{
							if(s instanceof Point){
								if(!s.isSelected()) {
									s.setSelected(true);
									slctd.add(s);
									repaint();
								}else {
									s.setSelected(false);
									slctd.remove(s);
									repaint();
								}
							}else if(s instanceof Line) {
								if(!s.isSelected()) {
									s.setSelected(true);
									slctd.add(s);
									repaint();
								}else {
									s.setSelected(false);
									slctd.remove(s);
									repaint();
								}
							}else if(s instanceof Rectangle) {
								if(!s.isSelected()) {
									s.setSelected(true);
									slctd.add(s);
									repaint();
								}else {
									s.setSelected(false);
									slctd.remove(s);
									repaint();
								}
							}else if(s instanceof Circle) {
								if(s.getClass() != Circle.class) {
									if(!s.isSelected()) {
										s.setSelected(true);
										slctd.add(s);
										repaint();
									}else {
										s.setSelected(false);
										slctd.remove(s);
										repaint();
									}
								}else {
									if(!s.isSelected()) {
										s.setSelected(true);
										slctd.add(s);
										repaint();
									}else {
										s.setSelected(false);
										slctd.remove(s);
										repaint();
									}
								}
							}
						}
				}
				}
				else if(btnPoint.isSelected()) {
					Point p = new Point(e.getX(),e.getY(),selected);
					panel.getShapes().add(p);
					p.setC(color);
					slctd.add(p);
					repaint();
				}
				else if(btnLine.isSelected()) {
					
					if(brojac==0) {
						startPoint = new Point(e.getX(),e.getY());
						panel.getShapes().add(startPoint);
						startPoint.setC(color);
						repaint();
					}else {
						endPoint = new Point(e.getX(),e.getY());
						Line l = new Line(startPoint,endPoint,selected);
						panel.getShapes().add(l);
						panel.getShapes().remove(startPoint);
						l.setC(color);
						repaint();
						brojac = 0;
					}
				
				}
				else if(btnRectangle.isSelected()) {
					Point upperLeft = new Point(e.getX(),e.getY());
					panel.getShapes().add(upperLeft);
					upperLeft.setC(color);
					repaint();
					dlgRectangle = new DlgRectangle();
					dlgRectangle.setVisible(true);
					
					if(dlgRectangle.isCommited()) {
						int width = Integer.parseInt(dlgRectangle.getWidthField().getText());
						int height = Integer.parseInt(dlgRectangle.getHeightField().getText());
						Rectangle r = new Rectangle(upperLeft,width,height,selected);
						panel.getShapes().remove(upperLeft);
						panel.getShapes().add(r);
						r.setC(color);
						repaint();	
					}else {
						panel.getShapes().remove(upperLeft);
						repaint();
					}
				}
				else if(btnCircle.isSelected()) {
					Point center = new Point(e.getX(),e.getY());
					panel.getShapes().add(center);
					center.setC(color);
					repaint();
					dlgCircle = new DlgCircle();
					dlgCircle.setVisible(true);
					
					if(dlgCircle.isCommited()) {
						int r = Integer.parseInt(dlgCircle.getRadius().getText());
						Circle c = new Circle(center, r, selected);
						panel.getShapes().remove(center);
						panel.getShapes().add(c);
						c.setC(color);
						repaint();
					}else {
						panel.getShapes().remove(center);
						repaint();
					}
				}
				else if(btnDonut.isSelected()) {
					Point center = new Point(e.getX(),e.getY());
					panel.getShapes().add(center);
					center.setC(color);
					repaint();
					dlgDonut = new DlgDonut();
					dlgDonut.setVisible(true);
					
					if(dlgDonut.isCommited()) {
						int outerR = Integer.parseInt(dlgDonut.getOutR().getText());
						int innerR = Integer.parseInt(dlgDonut.getInR().getText());
						Donut d = new Donut(center,outerR,innerR,selected);
						panel.getShapes().remove(center);
						panel.getShapes().add(d);
						d.setC(color);
						repaint();
					}else {
						panel.getShapes().remove(center);
						repaint();
					}
				}
				else if(btnColor.isSelected()) {
					color = JColorChooser.showDialog(null, "Choose color",Color.BLACK);
					btnColor.setBackground(color);
					for(Shape s : slctd) {
						if(s instanceof Point){
								repaint();
								s.setC(color);
								repaint();
						}else if(s instanceof Line) {
								repaint();
								s.setC(color);
								repaint();
						}else if(s instanceof Rectangle) {
								repaint();
								s.setC(color);
								repaint();
						}else if(s instanceof Circle) {
							if(s.getClass() != Circle.class) {
								repaint();
								s.setC(color);
								repaint();
							}else {
								repaint();
								s.setC(color);
								repaint();
							}		
						}
					}
				}
				else if(btnModify.isSelected()) {
					color = JColorChooser.showDialog(null, "Choose color",Color.BLACK);
					btnColor.setBackground(color);
					for(Shape s : slctd) {
						if(s instanceof Point){
								repaint();
								s.setC(color);
								repaint();
						}else if(s instanceof Line) {
								repaint();
								s.setC(color);
								repaint();
						}else if(s instanceof Rectangle) {
								repaint();
								s.setC(color);
								repaint();
						}else if(s instanceof Circle) {
							if(s.getClass() != Circle.class) {
								repaint();
								s.setC(color);
								repaint();
							}else {
								repaint();
								s.setC(color);
								repaint();
							}		
						}
					}
				}

			}
		});
	}
	

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				AppFrame frame = new AppFrame();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}


/*
  btnSelect.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent e) {
		  		for(Shape s : panel.getShapes()){
		  			if(s.contains(e.getX(),e.getY()))
		  			{
		  				if(s instanceof Point){
		  					if(!s.isSelected()) {
		  						s.setSelected(true);
		  						slctd.add(s);
		  						repaint();
		  					}else {
		  						s.setSelected(false);
		  						slctd.remove(s);
		  						repaint();
		  					}
		  				}else if(s instanceof Line) {
		  					if(!s.isSelected()) {
		  						s.setSelected(true);
		  						slctd.add(s);
		  						repaint();
		  					}else {
		  						s.setSelected(false);
		  						slctd.remove(s);
		  						repaint();
		  					}
		  				}else if(s instanceof Rectangle) {
		  					if(!s.isSelected()) {
		  						s.setSelected(true);
		  						slctd.add(s);
		  						repaint();
		  					}else {
		  						s.setSelected(false);
		  						slctd.remove(s);
		  						repaint();
		  					}
		  				}else if(s instanceof Circle) {
		  					if(s.getClass() != Circle.class) {
		  						if(!s.isSelected()) {
		  							s.setSelected(true);
		  							slctd.add(s);
		  							repaint();
		  						}else {
		  							s.setSelected(false);
		  							slctd.remove(s);
		  							repaint();
		  						}
		  					}else {
		  						if(!s.isSelected()) {
		  							s.setSelected(true);
		  							slctd.add(s);
		  							repaint();
		  						}else {
		  							s.setSelected(false);
		  							slctd.remove(s);
		  							repaint();
		  						}
		  					}
		  				}
		  			}
		  		}
		  	}

		  });
		  
		  
		  
		  			brojac++;
				switch(brojac) {
					case 1:
						startPoint = new Point(e.getX(),e.getY());
						panel.getShapes().add(startPoint);
						startPoint.setC(color);
						repaint();
						break;
					case 2:
						endPoint = new Point(e.getX(),e.getY());
						Line l = new Line(startPoint,endPoint,selected);
						panel.getShapes().add(l);
						panel.getShapes().remove(startPoint);
						l.setC(color);
						repaint();
						brojac = 0;
						break;
				}
		  */
