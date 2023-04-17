package geometry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.JColorChooser;
import javax.swing.ButtonGroup;
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
	private Point startPoint;
	private Point endPoint;
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
	private DlgPoint dlgPoint;
	private DlgLine dlgLine;
	private DlgCircle dlgCircle;
	private DlgDonut dlgDonut;
	
	
	
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
		 btnDelete.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
				 if(btnDelete.isSelected()) {
					if(panel.getShapes().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Panel je prazan.", "ERROR", JOptionPane.ERROR_MESSAGE);
					}else if(!panel.getShapes().isEmpty() && slctd.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Niste selektovali objekat.", "ERROR", JOptionPane.ERROR_MESSAGE);
					}else{
						if(JOptionPane.showConfirmDialog(null, "Da li zelite da obrisete objekat?", "Brisanje",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
								panel.getShapes().removeAll(slctd);
								slctd.clear();
								repaint();	
						}
					}
				}
		 	}
		 });
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
		btnColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnColor.isSelected()) {
					 {
					color = JColorChooser.showDialog(null, "Izaberite boju",Color.BLACK);
					btnColor.setBackground(color);
					if(slctd.size()==1) {
						for(Shape s : panel.getShapes()) {
							
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
				}
			}
		});
		buttons.add(btnColor);
		buttonGroup.add(btnColor);
		
		btnModify = new JToggleButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(panel.getShapes().isEmpty() || slctd.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Selektujte objekat koji zelite da menjate!", "ERROR", JOptionPane.ERROR_MESSAGE);
					}else if(slctd.size() > 1) {
						JOptionPane.showMessageDialog(null, "Ne mozete menjati vise od jednog objekta!", "ERROR", JOptionPane.ERROR_MESSAGE);
					}else if(slctd.size() == 1) {
						for(Shape s : panel.getShapes()) {
							if(s instanceof Point) {
								if(s.isSelected()) {
									Point temp = (Point) s;
									Point p = new Point();
									
									dlgPoint = new DlgPoint();
									dlgPoint.getTextFieldX().setText(Integer.toString(temp.getX()));
									dlgPoint.getTextFieldY().setText(Integer.toString(temp.getY()));
									dlgPoint.setVisible(true);
									
									if(dlgPoint.isCommited()) {
										p.setC(temp.getC());
										p.setSelected(false);
										p.moveOn(Integer.parseInt(dlgPoint.getTextFieldX().getText()), Integer.parseInt(dlgPoint.getTextFieldY().getText()));
										panel.getShapes().set(panel.getShapes().indexOf(temp), p);
										repaint();
										slctd.clear();
									}
								}
							}else if(s instanceof Line) {
								if(s.isSelected()) {
									Line temp = (Line) s;
									Line l = new Line();
									
									dlgLine = new DlgLine();
									dlgLine.getTextFieldStartPointX().setText(Integer.toString(temp.getStartPoint().getX()));
									dlgLine.getTextFieldStartPointY().setText(Integer.toString(temp.getStartPoint().getY()));
									dlgLine.getTextFieldEndPointX().setText(Integer.toString(temp.getEndPoint().getX()));
									dlgLine.getTextFieldEndPointY().setText(Integer.toString(temp.getEndPoint().getY()));
									dlgLine.setVisible(true);
									
									if(dlgLine.isCommited()) {
										l.setC(temp.getC());
										l.setSelected(false);
										l.setStartPoint(new Point(Integer.parseInt(dlgLine.getTextFieldStartPointX().getText()), Integer.parseInt(dlgLine.getTextFieldStartPointY().getText())));
										l.setEndPoint(new Point(Integer.parseInt(dlgLine.getTextFieldEndPointX().getText()), Integer.parseInt(dlgLine.getTextFieldEndPointY().getText())));
										panel.getShapes().set(panel.getShapes().indexOf(temp), l);
										repaint();
										slctd.clear();
									}
								}
							}else if(s instanceof Rectangle) {
								if(s.isSelected()) {
									Rectangle temp = (Rectangle) s;
									Rectangle r = new Rectangle();
									
									dlgRectangle = new DlgRectangle();
									dlgRectangle.getHeightField().setText(Integer.toString(temp.getHeight()));
									dlgRectangle.getWidthField().setText(Integer.toString(temp.getWidth()));
									dlgRectangle.getTextFieldAxisX().setText(Integer.toString(temp.getUpperLeft().getX()));
									dlgRectangle.getTextFieldAxisY().setText(Integer.toString(temp.getUpperLeft().getY()));
									dlgRectangle.getTextFieldAxisX().setEnabled(true);
									dlgRectangle.getTextFieldAxisY().setEnabled(true);
									dlgRectangle.setVisible(true);
									
									if(dlgRectangle.isCommited()) {
										r.setC(temp.getC());
										r.setSelected(false);
										r.setHeight(Integer.parseInt(dlgRectangle.getHeightField().getText()));
										r.setWidth(Integer.parseInt(dlgRectangle.getWidthField().getText()));
										r.setUpperLeft(new Point(Integer.parseInt(dlgRectangle.getTextFieldAxisX().getText()), Integer.parseInt(dlgRectangle.getTextFieldAxisY().getText())));
										panel.getShapes().set(panel.getShapes().indexOf(temp), r);
										repaint();
										slctd.clear();
									}
								}
							}else if(s instanceof Circle) {
								if(s.isSelected()) {
									if(s.getClass() != Circle.class) {
											Donut temp = (Donut) s;
											Donut d = new Donut();
											
											dlgDonut = new DlgDonut();
											dlgDonut.getTextFieldInnerR().setText(Integer.toString(temp.getInnerR()));
											dlgDonut.getTextFieldRadius().setText(Integer.toString(temp.getR()));
											dlgDonut.getTextFieldAxisX().setText(Integer.toString(temp.getCenter().getX()));
											dlgDonut.getTextFieldAxisY().setText(Integer.toString(temp.getCenter().getY()));
											dlgDonut.getTextFieldAxisX().setEnabled(true);
											dlgDonut.getTextFieldAxisY().setEnabled(true);
											dlgDonut.setVisible(true);
											
											if(dlgDonut.isCommited()) {
												d.setC(temp.getC());
												d.setSelected(false);
												d.setInnerR(Integer.parseInt(dlgDonut.getTextFieldInnerR().getText()));
												d.setR(Integer.parseInt(dlgDonut.getTextFieldRadius().getText()));
												d.setCenter(new Point(Integer.parseInt(dlgDonut.getTextFieldAxisX().getText()), Integer.parseInt(dlgDonut.getTextFieldAxisY().getText())));
												panel.getShapes().set(panel.getShapes().indexOf(temp), d);
												repaint();
												slctd.clear();
										}
									}else {
											Circle temp = (Circle) s;
											Circle c = new Circle();
											
											dlgCircle = new DlgCircle();
											dlgCircle.getTextFieldRadius().setText(Integer.toString(temp.getR()));
											dlgCircle.getTextFieldAxisX().setText(Integer.toString(temp.getCenter().getX()));
											dlgCircle.getTextFieldAxisY().setText(Integer.toString(temp.getCenter().getY()));
											dlgCircle.getTextFieldAxisX().setEnabled(true);
											dlgCircle.getTextFieldAxisY().setEnabled(true);
											dlgCircle.setVisible(true);
											
											
											if(dlgCircle.isCommited()) {
												c.setC(temp.getC());
												c.setSelected(false);
												c.setR(Integer.parseInt(dlgCircle.getTextFieldRadius().getText()));
												c.setCenter(new Point(Integer.parseInt(dlgCircle.getTextFieldAxisX().getText()), Integer.parseInt(dlgCircle.getTextFieldAxisY().getText())));
												panel.getShapes().set(panel.getShapes().indexOf(temp), c);
												repaint();
												slctd.clear();
										}
									}
								}
							}
						}
					

			}
			}
		});
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
					brojac++;
					if(brojac==1) {
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
						brojac=0;
						
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
						int r = Integer.parseInt(dlgCircle.getTextFieldRadius().getText());
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
						int radius = Integer.parseInt(dlgDonut.getTextFieldRadius().getText());
						int innerR = Integer.parseInt(dlgDonut.getTextFieldInnerR().getText());
						Donut d = new Donut(center,radius,innerR,selected);
						panel.getShapes().remove(center);
						panel.getShapes().add(d);
						d.setC(color);
						repaint();
					}else {
						panel.getShapes().remove(center);
						repaint();
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


