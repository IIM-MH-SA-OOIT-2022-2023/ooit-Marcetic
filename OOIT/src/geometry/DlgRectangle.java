package geometry;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgRectangle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	protected boolean commited;
	private static final long serialVersionUID = 1L;
	private JTextField heightField;
	private JTextField widthField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRectangle dialog = new DlgRectangle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public JTextField getHeightField() {
		return heightField;
	}

	public void setHeightField(JTextField heightField) {
		this.heightField = heightField;
	}

	public JTextField getWidthField() {
		return widthField;
	}

	public void setWidthField(JTextField widthField) {
		this.widthField = widthField;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Create the dialog.
	 */
	public DlgRectangle() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		setTitle("Rectangle");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblHeight = new JLabel("Height");
			contentPanel.add(lblHeight);
		}
		{
			heightField = new JTextField();
			contentPanel.add(heightField);
			heightField.setColumns(10);
		}
		{
			JLabel lblWidth = new JLabel("Width");
			contentPanel.add(lblWidth);
		}
		{
			widthField = new JTextField();
			widthField.setColumns(10);
			contentPanel.add(widthField);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!heightField.getText().isEmpty() && !widthField.getText().isEmpty()) {
							if(heightField.getText().matches("^[1-9]\\d*$") && widthField.getText().matches("^[1-9]\\d*$")) {
								setCommited(true);
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "All values have to be positive!", "ERROR", JOptionPane.ERROR_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null, "You have to enter all values!", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
