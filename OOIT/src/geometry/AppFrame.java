package geometry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
public class AppFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	private Shape selected;
	
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public AppFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridwidth = 11;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 5;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnSelect = new GridBagConstraints();
		gbc_btnSelect.insets = new Insets(0, 0, 5, 5);
		gbc_btnSelect.gridx = 5;
		gbc_btnSelect.gridy = 3;
		contentPane.add(btnSelect, gbc_btnSelect);
		
		JButton btnPoint = new JButton("Point");
		GridBagConstraints gbc_btnPoint = new GridBagConstraints();
		gbc_btnPoint.insets = new Insets(0, 0, 5, 5);
		gbc_btnPoint.gridx = 7;
		gbc_btnPoint.gridy = 3;
		contentPane.add(btnPoint, gbc_btnPoint);
		
		JButton btnLine = new JButton("Line");
		GridBagConstraints gbc_btnLine = new GridBagConstraints();
		gbc_btnLine.insets = new Insets(0, 0, 5, 5);
		gbc_btnLine.gridx = 8;
		gbc_btnLine.gridy = 3;
		contentPane.add(btnLine, gbc_btnLine);
		
		JButton btnRectangle = new JButton("Rectangle");
		GridBagConstraints gbc_btnRectangle = new GridBagConstraints();
		gbc_btnRectangle.gridwidth = 4;
		gbc_btnRectangle.insets = new Insets(0, 0, 5, 5);
		gbc_btnRectangle.gridx = 9;
		gbc_btnRectangle.gridy = 3;
		contentPane.add(btnRectangle, gbc_btnRectangle);
		
		JButton btnCircle = new JButton("Circle");
		GridBagConstraints gbc_btnCircle = new GridBagConstraints();
		gbc_btnCircle.insets = new Insets(0, 0, 5, 5);
		gbc_btnCircle.gridx = 13;
		gbc_btnCircle.gridy = 3;
		contentPane.add(btnCircle, gbc_btnCircle);
		
		JButton btnDelete = new JButton("Delete");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.insets = new Insets(0, 0, 0, 5);
		gbc_btnDelete.gridx = 5;
		gbc_btnDelete.gridy = 4;
		contentPane.add(btnDelete, gbc_btnDelete);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
