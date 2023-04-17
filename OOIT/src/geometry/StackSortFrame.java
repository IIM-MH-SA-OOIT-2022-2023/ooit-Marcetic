package geometry;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class StackSortFrame extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel buttonPanel;
	private JPanel panel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private DlgRectangle dlgR;
	private JToggleButton add;
	private JToggleButton remove;
	private JToggleButton sort;
	private JList<String> list;
	private JLabel recStack;
	private Stack<Rectangle> stack = new Stack<Rectangle>();
	private Rectangle rctngl;
	private JTextArea textArea_2;
	
	
	public StackSortFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Rectangle Stack/Sort 1.0");
		setResizable(false);
		setBounds(100, 100, 371, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
	
		add = new JToggleButton("Add Rectangle");
		add.addActionListener(this);
		buttonGroup.add(add);
		buttonPanel.add(add);
		
		sort = new JToggleButton("Sort");
		sort.addActionListener(this);
		buttonGroup.add(sort);
		buttonPanel.add(sort);
		
		remove = new JToggleButton("Remove Rectangle");
		remove.addActionListener(this);
		buttonGroup.add(remove);
		buttonPanel.add(remove);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout(0,0));
		contentPane.add(panel, BorderLayout.CENTER);
		
		list = new JList<String>();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(list);
		
		
		recStack = new JLabel("Rectangle Stack");
		recStack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		recStack.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(recStack, BorderLayout.NORTH);
		
		textArea_2 = new JTextArea();
		panel.add(textArea_2, BorderLayout.SOUTH);
		
		
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(add.isSelected()) {
			add();
		}else if(remove.isSelected()) {
			remove();
		}else if(sort.isSelected()) {
			sort();
		}
	}
	protected void add() {
		DlgRectangle dlgRect = new DlgRectangle();
		dlgRect.setVisible(true);
		int width = Integer.parseInt(dlgRect.getWidthField().getText());
		int height = Integer.parseInt(dlgRect.getHeightField().getText());
		int x = Integer.parseInt(dlgRect.getTextFieldAxisX().getText());
		int y = Integer.parseInt(dlgRect.getTextFieldAxisY().getText());
		Point upperLeft = new Point(x, y);
		rctngl = new Rectangle(upperLeft, width, height);
				
		if(dlgRect.isCommited()) {
			stack.push(rctngl);
			//System.out.println(stack);
			String stackString = stack.toString();
            JTextComponent textArea_2 = null;
			textArea_2.setText(stackString);
			
		}
		
	}


	
	protected void remove() {
		if(stack.isEmpty()) {
			JOptionPane.showMessageDialog(null, "The stack is empty!", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			Rectangle prom = stack.pop();
			//System.out.println(stack);
			String stackString = stack.toString();
            JTextComponent textArea_2 = null;
			textArea_2.setText(stackString);
			}
		}
	protected void sort() {
		if (!stack.isEmpty()) {
	        Rectangle[] rectArray = stack.toArray(new Rectangle[stack.size()]);
	        Arrays.sort(rectArray, new Comparator<Rectangle>() {
	            public int compare(Rectangle rect1, Rectangle rect2) {
	                int area1 = rect1.getWidth() * rect1.getHeight();
	                int area2 = rect2.getWidth() * rect2.getHeight();
	                return area1 - area2;
	            }
	        });
	        stack.clear();
	        for (Rectangle rect : rectArray) {
	            stack.push(rect);
	        }
	        String stackString = stack.toString();
	        JTextComponent textArea_2 = null;
			textArea_2.setText(stackString);
		} else {
			JOptionPane.showMessageDialog(null, "The stack is empty!", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackSortFrame frame = new StackSortFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
}
