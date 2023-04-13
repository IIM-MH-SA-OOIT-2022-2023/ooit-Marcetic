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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class DlgRectangle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	protected boolean commited;
	private static final long serialVersionUID = 1L;
	private JTextField textFieldAxisX;
	private JTextField textFieldAxisY;
	private JTextField heightField;
	private JTextField widthField;
	private JLabel lblRectangle;
	private JButton okButton;
	
	
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

	public JLabel getLblRectangle() {
		return lblRectangle;
	}



	public void setLblRectangle(JLabel lblRectangle) {
		this.lblRectangle = lblRectangle;
	}
	
	
	

	public JButton getOkButton() {
		return okButton;
	}

	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}

	public JTextField getTextFieldAxisX() {
		return textFieldAxisX;
	}



	public void setTextFieldAxisX(JTextField textFieldAxisX) {
		this.textFieldAxisX = textFieldAxisX;
	}



	public JTextField getTextFieldAxisY() {
		return textFieldAxisY;
	}



	public void setTextFieldAxisY(JTextField textFieldAxisY) {
		this.textFieldAxisY = textFieldAxisY;
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
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{94, 31, 86, 0, 0, 28, 86, 0};
		gbl_contentPanel.rowHeights = new int[]{20, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblHeight = new JLabel("Height");
			GridBagConstraints gbc_lblHeight = new GridBagConstraints();
			gbc_lblHeight.anchor = GridBagConstraints.WEST;
			gbc_lblHeight.insets = new Insets(0, 0, 5, 5);
			gbc_lblHeight.gridx = 1;
			gbc_lblHeight.gridy = 1;
			contentPanel.add(lblHeight, gbc_lblHeight);
		}
		{
			heightField = new JTextField();
			GridBagConstraints gbc_heightField = new GridBagConstraints();
			gbc_heightField.insets = new Insets(0, 0, 5, 5);
			gbc_heightField.fill = GridBagConstraints.HORIZONTAL;
			gbc_heightField.gridx = 2;
			gbc_heightField.gridy = 1;
			contentPanel.add(heightField, gbc_heightField);
			heightField.setColumns(10);
		}
		{
			JLabel lblWidth = new JLabel("Width");
			GridBagConstraints gbc_lblWidth = new GridBagConstraints();
			gbc_lblWidth.anchor = GridBagConstraints.WEST;
			gbc_lblWidth.insets = new Insets(0, 0, 5, 5);
			gbc_lblWidth.gridx = 5;
			gbc_lblWidth.gridy = 1;
			contentPanel.add(lblWidth, gbc_lblWidth);
		}
		{
			widthField = new JTextField();
			GridBagConstraints gbc_widthField = new GridBagConstraints();
			gbc_widthField.insets = new Insets(0, 0, 5, 0);
			gbc_widthField.fill = GridBagConstraints.HORIZONTAL;
			gbc_widthField.gridx = 6;
			gbc_widthField.gridy = 1;
			contentPanel.add(widthField, gbc_widthField);
			widthField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Modify X axis");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 2;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textFieldAxisX = new JTextField();
			textFieldAxisX.setEnabled(false);
			GridBagConstraints gbc_textFieldAxisX = new GridBagConstraints();
			gbc_textFieldAxisX.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldAxisX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldAxisX.gridx = 2;
			gbc_textFieldAxisX.gridy = 2;
			contentPanel.add(textFieldAxisX, gbc_textFieldAxisX);
			textFieldAxisX.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Modify Y axis");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.gridx = 5;
			gbc_lblNewLabel.gridy = 2;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textFieldAxisY = new JTextField();
			textFieldAxisY.setEnabled(false);
			GridBagConstraints gbc_textFieldAxisY = new GridBagConstraints();
			gbc_textFieldAxisY.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldAxisY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldAxisY.gridx = 6;
			gbc_textFieldAxisY.gridy = 2;
			contentPanel.add(textFieldAxisY, gbc_textFieldAxisY);
			textFieldAxisY.setColumns(10);
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
								JOptionPane.showMessageDialog(null, "Vrednosti moraju biti pozitivne!", "ERROR", JOptionPane.ERROR_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null, "Morate unete sve vrednosti!", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setCommited(false);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
