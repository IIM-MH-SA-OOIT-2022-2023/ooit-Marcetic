package geometry;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class DlgCircle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	protected boolean commited;
	private JTextField textFieldAxisY;
	private JTextField textFieldAxisX;
	private JTextField textFieldRadius;



	public JTextField getTextFieldAxisY() {
		return textFieldAxisY;
	}

	public void setTextFieldAxisY(JTextField textFieldAxisY) {
		this.textFieldAxisY = textFieldAxisY;
	}

	public JTextField getTextFieldAxisX() {
		return textFieldAxisX;
	}

	public void setTextFieldAxisX(JTextField textFieldAxisX) {
		this.textFieldAxisX = textFieldAxisX;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCircle dialog = new DlgCircle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCircle() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{65, 36, 0, 86, 81, 86, 0};
		gbl_contentPanel.rowHeights = new int[]{20, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblModify1 = new JLabel("Modify X axis to");
			GridBagConstraints gbc_lblModify1 = new GridBagConstraints();
			gbc_lblModify1.anchor = GridBagConstraints.EAST;
			gbc_lblModify1.insets = new Insets(0, 0, 5, 5);
			gbc_lblModify1.gridx = 4;
			gbc_lblModify1.gridy = 0;
			contentPanel.add(lblModify1, gbc_lblModify1);
		}
		{
			textFieldAxisX = new JTextField();
			textFieldAxisX.setEnabled(false);
			GridBagConstraints gbc_textFieldAxisX = new GridBagConstraints();
			gbc_textFieldAxisX.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldAxisX.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldAxisX.gridx = 5;
			gbc_textFieldAxisX.gridy = 0;
			contentPanel.add(textFieldAxisX, gbc_textFieldAxisX);
			textFieldAxisX.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Modify Y axis to");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.gridx = 4;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textFieldAxisY = new JTextField();
			textFieldAxisY.setEnabled(false);
			GridBagConstraints gbc_textFieldAxisY = new GridBagConstraints();
			gbc_textFieldAxisY.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldAxisY.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldAxisY.gridx = 5;
			gbc_textFieldAxisY.gridy = 1;
			contentPanel.add(textFieldAxisY, gbc_textFieldAxisY);
			textFieldAxisY.setColumns(10);
		}
		{
			JLabel lblRadius = new JLabel("Radius:");
			GridBagConstraints gbc_lblRadius = new GridBagConstraints();
			gbc_lblRadius.anchor = GridBagConstraints.WEST;
			gbc_lblRadius.insets = new Insets(0, 0, 0, 5);
			gbc_lblRadius.gridx = 1;
			gbc_lblRadius.gridy = 2;
			contentPanel.add(lblRadius, gbc_lblRadius);
		}
		{
			textFieldRadius = new JTextField();
			GridBagConstraints gbc_textFieldRadius = new GridBagConstraints();
			gbc_textFieldRadius.gridwidth = 2;
			gbc_textFieldRadius.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldRadius.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRadius.gridx = 2;
			gbc_textFieldRadius.gridy = 2;
			contentPanel.add(textFieldRadius, gbc_textFieldRadius);
			textFieldRadius.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!textFieldRadius.getText().isEmpty()) {
							if(textFieldRadius.getText().matches("^[1-9]\\d*$")) {
								setCommited(true);
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "Sve vrednosti moraju biti pozitivne!", "ERROR", JOptionPane.ERROR_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null, "Morate uneti sve vrednosti!", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
					}
				);
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



	public JTextField getTextFieldRadius() {
		return textFieldRadius;
	}

	public void setTextFieldRadius(JTextField textFieldRadius) {
		this.textFieldRadius = textFieldRadius;
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
