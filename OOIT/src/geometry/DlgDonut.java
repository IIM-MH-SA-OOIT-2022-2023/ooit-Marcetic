package geometry;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgDonut extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private boolean commited;
	private JTextField textFieldInnerR;
	private JTextField textFieldRadius;
	private JTextField textFieldCenterX;
	private JTextField textFieldCenterY;
	
	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public JTextField getTextFieldInnerR() {
		return textFieldInnerR;
	}

	public void setTextFieldInnerR(JTextField textFieldInnerR) {
		this.textFieldInnerR = textFieldInnerR;
	}

	public JTextField getTextFieldRadius() {
		return textFieldRadius;
	}

	public void setTextFieldRadius(JTextField textFieldRadius) {
		this.textFieldRadius = textFieldRadius;
	}


	public JTextField getTextFieldCenterX() {
		return textFieldCenterX;
	}

	public void setTextFieldCenterX(JTextField textFieldCenterX) {
		this.textFieldCenterX = textFieldCenterX;
	}

	public JTextField getTextFieldCenterY() {
		return textFieldCenterY;
	}

	public void setTextFieldCenterY(JTextField textFieldCenterY) {
		this.textFieldCenterY = textFieldCenterY;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDonut dialog = new DlgDonut();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDonut() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("Radius");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.gridx = 2;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textFieldRadius = new JTextField();
			GridBagConstraints gbc_textFieldRadius = new GridBagConstraints();
			gbc_textFieldRadius.gridwidth = 3;
			gbc_textFieldRadius.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldRadius.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRadius.gridx = 3;
			gbc_textFieldRadius.gridy = 1;
			contentPanel.add(textFieldRadius, gbc_textFieldRadius);
			textFieldRadius.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Modify center X");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_2.gridx = 6;
			gbc_lblNewLabel_2.gridy = 1;
			contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		}
		{
			textFieldCenterX = new JTextField();
			GridBagConstraints gbc_textFieldCenterX = new GridBagConstraints();
			gbc_textFieldCenterX.gridwidth = 3;
			gbc_textFieldCenterX.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldCenterX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldCenterX.gridx = 7;
			gbc_textFieldCenterX.gridy = 1;
			contentPanel.add(textFieldCenterX, gbc_textFieldCenterX);
			textFieldCenterX.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Inner radius");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.gridx = 2;
			gbc_lblNewLabel_1.gridy = 3;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textFieldInnerR = new JTextField();
			GridBagConstraints gbc_textFieldInnerR = new GridBagConstraints();
			gbc_textFieldInnerR.gridwidth = 3;
			gbc_textFieldInnerR.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldInnerR.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldInnerR.gridx = 3;
			gbc_textFieldInnerR.gridy = 3;
			contentPanel.add(textFieldInnerR, gbc_textFieldInnerR);
			textFieldInnerR.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Modify center Y");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_3.gridx = 6;
			gbc_lblNewLabel_3.gridy = 3;
			contentPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		}
		{
			textFieldCenterY = new JTextField();
			GridBagConstraints gbc_textFieldCenterY = new GridBagConstraints();
			gbc_textFieldCenterY.gridwidth = 3;
			gbc_textFieldCenterY.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldCenterY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldCenterY.gridx = 7;
			gbc_textFieldCenterY.gridy = 3;
			contentPanel.add(textFieldCenterY, gbc_textFieldCenterY);
			textFieldCenterY.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!textFieldRadius.getText().isEmpty() && !textFieldInnerR.getText().isEmpty()) {
							if(textFieldRadius.getText().matches("^[1-9]\\d*$") && textFieldInnerR.getText().matches("^[1-9]\\d*$")) {
								if(Integer.parseInt(textFieldInnerR.getText()) < Integer.parseInt(textFieldRadius.getText())) {
								setCommited(true);
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "Inner radius cannot be bigger than outter radius!", "ERROR", JOptionPane.ERROR_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null, "Values must be positive!", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
							{
							JOptionPane.showMessageDialog(null, "Fields cant be empty!", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
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