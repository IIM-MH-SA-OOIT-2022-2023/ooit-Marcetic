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
public class AppFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
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

	
	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	
	private MouseListener ml = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			if(btnPoint.isSelected()) {
				btnPoint(e);	
			}else if(btnLine.isSelected()) {
				btnLine(e);	
			}else if(btnRectangle.isSelected()) {
				btnRectangle(e);	
			}else if(btnCircle.isSelected()) {
				btnCircle(e);
			}else if(btnDonut.isSelected()) {
				btnDonut(e);
			}else if(btnSelect.isSelected()) {
				btnSelected(e);
			}
		}


	};
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public AppFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridwidth = 11;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 6;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		panel.setBorder(new LineBorder(new Color(0,0,0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		panel.addMouseListener(ml);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(Shape s : panel.getShapes()){
					if(s.contains(e.getX(),e.getY()))
					{
						if(s instanceof Point){
							if(!s.isSelected()) {
								s.setSelected(true);
								shapes.add(s);
								repaint();
							}else {
								s.setSelected(false);
								shapes.remove(s);
								repaint();
							}
						}else if(s instanceof Line) {
							if(!s.isSelected()) {
								s.setSelected(true);
								shapes.add(s);
								repaint();
							}else {
								s.setSelected(false);
								shapes.remove(s);
								repaint();
							}
						}else if(s instanceof Rectangle) {
							if(!s.isSelected()) {
								s.setSelected(true);
								shapes.add(s);
								repaint();
							}else {
								s.setSelected(false);
								shapes.remove(s);
								repaint();
							}
						}else if(s instanceof Circle) {
							if(s.getClass() != Circle.class) {
								if(!s.isSelected()) {
									s.setSelected(true);
									shapes.add(s);
									repaint();
								}else {
									s.setSelected(false);
									shapes.remove(s);
									repaint();
								}
							}else {
								if(!s.isSelected()) {
									s.setSelected(true);
									shapes.add(s);
									repaint();
								}else {
									s.setSelected(false);
									shapes.remove(s);
									repaint();
								}
							}
						}
					}
				}
			}

		});
		
		buttonGroup.add(btnSelect);
			
		GridBagConstraints gbc_btnSelect = new GridBagConstraints();
		gbc_btnSelect.insets = new Insets(0, 0, 5, 5);
		gbc_btnSelect.gridx = 6;
		gbc_btnSelect.gridy = 3;
		contentPane.add(btnSelect, gbc_btnSelect);
		
		JButton btnPoint = new JButton("Point");
		buttonGroup_1.add(btnPoint);
		
		GridBagConstraints gbc_btnPoint = new GridBagConstraints();
		gbc_btnPoint.insets = new Insets(0, 0, 5, 5);
		gbc_btnPoint.gridx = 8;
		gbc_btnPoint.gridy = 3;
		contentPane.add(btnPoint, gbc_btnPoint);
		
		JButton btnLine = new JButton("Line");
		buttonGroup_2.add(btnLine);
		GridBagConstraints gbc_btnLine = new GridBagConstraints();
		gbc_btnLine.insets = new Insets(0, 0, 5, 5);
		gbc_btnLine.gridx = 9;
		gbc_btnLine.gridy = 3;
		contentPane.add(btnLine, gbc_btnLine);
		
		JButton btnRectangle = new JButton("Rectangle");
		buttonGroup_3.add(btnRectangle);
		GridBagConstraints gbc_btnRectangle = new GridBagConstraints();
		gbc_btnRectangle.gridwidth = 4;
		gbc_btnRectangle.insets = new Insets(0, 0, 5, 5);
		gbc_btnRectangle.gridx = 10;
		gbc_btnRectangle.gridy = 3;
		contentPane.add(btnRectangle, gbc_btnRectangle);
		
		JButton btnCircle = new JButton("Circle");
		buttonGroup_4.add(btnCircle);
		GridBagConstraints gbc_btnCircle = new GridBagConstraints();
		gbc_btnCircle.insets = new Insets(0, 0, 5, 5);
		gbc_btnCircle.gridx = 14;
		gbc_btnCircle.gridy = 3;
		contentPane.add(btnCircle, gbc_btnCircle);
		
		JButton btnDonut = new JButton("Donut");
		buttonGroup_5.add(btnDonut);
		GridBagConstraints gbc_btnDonut = new GridBagConstraints();
		gbc_btnDonut.insets = new Insets(0, 0, 5, 5);
		gbc_btnDonut.gridx = 15;
		gbc_btnDonut.gridy = 3;
		contentPane.add(btnDonut, gbc_btnDonut);
		
		JButton btnDelete = new JButton("Delete");
		buttonGroup_6.add(btnDelete);
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.insets = new Insets(0, 0, 0, 5);
		gbc_btnDelete.gridx = 6;
		gbc_btnDelete.gridy = 4;
		contentPane.add(btnDelete, gbc_btnDelete);
		
		JButton btnColor = new JButton("Color");
		buttonGroup_7.add(btnColor);
		btnColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = JColorChooser.showDialog(null, "Choose color",Color.BLACK);
				btnColor.setBackground(color);
				for(Shape s : shapes) {
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
		});
		GridBagConstraints gbc_btnColor = new GridBagConstraints();
		gbc_btnColor.insets = new Insets(0, 0, 0, 5);
		gbc_btnColor.gridx = 7;
		gbc_btnColor.gridy = 4;
		contentPane.add(btnColor, gbc_btnColor);
	}
	
	

	protected void btnSelected(MouseEvent e) {
			for(Shape s : shapes){
				if(s.contains(e.getX(),e.getY()))
				{
					if(s instanceof Point){
						if(!s.isSelected()) {
							s.setSelected(true);
							shapes.add(s);
							repaint();
						}else {
							s.setSelected(false);
							shapes.remove(s);
							repaint();
						}
		}
	}
			}
		}

	protected void btnDonut(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void btnCircle(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void btnRectangle(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void btnPoint(MouseEvent e) {
		Point p = new Point(e.getX(),e.getY(),selected);
		p.setC(color);
		shapes.add(p);
		repaint();
	}

	protected void btnLine(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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
 public void actionPerformed(ActionEvent e) {
				
			}*/
