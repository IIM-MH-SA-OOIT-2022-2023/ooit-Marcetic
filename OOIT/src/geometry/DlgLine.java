package geometry;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgLine extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldStartPointY;
	private JTextField textFieldStartPointX;
	private JTextField textFieldEndPointX;
	private JTextField textFieldEndPointY;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private boolean commited;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgLine dialog = new DlgLine();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgLine() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			lblNewLabel_3 = new JLabel("Start point X");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_3.gridx = 3;
			gbc_lblNewLabel_3.gridy = 1;
			contentPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		}
		{
			textFieldStartPointX = new JTextField();
			GridBagConstraints gbc_textFieldStartPointX = new GridBagConstraints();
			gbc_textFieldStartPointX.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldStartPointX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldStartPointX.gridx = 4;
			gbc_textFieldStartPointX.gridy = 1;
			contentPanel.add(textFieldStartPointX, gbc_textFieldStartPointX);
			textFieldStartPointX.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("End point X");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.gridx = 7;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textFieldEndPointX = new JTextField();
			GridBagConstraints gbc_textFieldEndPointX = new GridBagConstraints();
			gbc_textFieldEndPointX.gridwidth = 2;
			gbc_textFieldEndPointX.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldEndPointX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldEndPointX.gridx = 8;
			gbc_textFieldEndPointX.gridy = 1;
			contentPanel.add(textFieldEndPointX, gbc_textFieldEndPointX);
			textFieldEndPointX.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Start point Y");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_2.gridx = 3;
			gbc_lblNewLabel_2.gridy = 2;
			contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		}
		{
			textFieldStartPointY = new JTextField();
			GridBagConstraints gbc_textFieldStartPointY = new GridBagConstraints();
			gbc_textFieldStartPointY.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldStartPointY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldStartPointY.gridx = 4;
			gbc_textFieldStartPointY.gridy = 2;
			contentPanel.add(textFieldStartPointY, gbc_textFieldStartPointY);
			textFieldStartPointY.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("End point Y");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.gridx = 7;
			gbc_lblNewLabel_1.gridy = 2;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textFieldEndPointY = new JTextField();
			GridBagConstraints gbc_textFieldEndPointY = new GridBagConstraints();
			gbc_textFieldEndPointY.gridwidth = 2;
			gbc_textFieldEndPointY.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldEndPointY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldEndPointY.gridx = 8;
			gbc_textFieldEndPointY.gridy = 2;
			contentPanel.add(textFieldEndPointY, gbc_textFieldEndPointY);
			textFieldEndPointY.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(!textFieldStartPointX.getText().isEmpty() && !textFieldEndPointX.getText().isEmpty() && !textFieldEndPointX.getText().isEmpty() && !textFieldEndPointY.getText().isEmpty()) {
								if(textFieldStartPointX.getText().matches("^[1-9]\\d*$") && textFieldEndPointX.getText().matches("^[1-9]\\d*$") && textFieldEndPointX.getText().matches("^[1-9]\\d*$") 
									&& textFieldEndPointY.getText().matches("^[1-9]\\d*$")) {
									setCommited(true);
									dispose();
								}else {
									JOptionPane.showMessageDialog(null, "Sve vrednosti moraju biti pozitivne!", "ERROR", JOptionPane.ERROR_MESSAGE);
								}
							}else {
								JOptionPane.showMessageDialog(null, "Morate uneti sve vrednosti!", "ERROR", JOptionPane.ERROR_MESSAGE);
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

	public JTextField getTextFieldStartPointY() {
		return textFieldStartPointY;
	}

	public void setTextFieldStartPointY(JTextField textFieldStartPointY) {
		this.textFieldStartPointY = textFieldStartPointY;
	}

	public JTextField getTextFieldStartPointX() {
		return textFieldStartPointX;
	}

	public void setTextFieldStartPointX(JTextField textFieldStartPointX) {
		this.textFieldStartPointX = textFieldStartPointX;
	}

	public JTextField getTextFieldEndPointX() {
		return textFieldEndPointX;
	}

	public void setTextFieldEndPointX(JTextField textFieldEndPointX) {
		this.textFieldEndPointX = textFieldEndPointX;
	}

	public JTextField getTextFieldEndPointY() {
		return textFieldEndPointY;
	}

	public void setTextFieldEndPointY(JTextField textFieldEndPointY) {
		this.textFieldEndPointY = textFieldEndPointY;
	}


	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

}
