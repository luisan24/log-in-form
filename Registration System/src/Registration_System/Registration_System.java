package Registration_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Registration_System extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtReferenceNo;
	private JTextField txtFirstName;
	private JTextField txtSurName;
	private JTextField txtAddress;
	private JTextField txtPostCode;
	private JTextField txtTelephone;
	private JTextField txtDateRegistered;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_System frame = new Registration_System();
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
	public Registration_System() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1025, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Reference No");
		lblNewLabel_1.setBounds(34, 88, 83, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Firstname");
		lblNewLabel_2.setBounds(34, 124, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Surname");
		lblNewLabel_2_1.setBounds(34, 149, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Address");
		lblNewLabel_2_2.setBounds(34, 174, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Post Code");
		lblNewLabel_2_3.setBounds(34, 199, 73, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Telephone");
		lblNewLabel_2_4.setBounds(34, 232, 73, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Date Registered");
		lblNewLabel_2_5.setBounds(34, 257, 96, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("prove of ID");
		lblNewLabel_2_6.setBounds(34, 289, 83, 14);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Membership Type");
		lblNewLabel_2_7.setBounds(34, 322, 86, 26);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("Amount Paid");
		lblNewLabel_2_8.setBounds(34, 359, 83, 25);
		contentPane.add(lblNewLabel_2_8);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 102)));
		panel.setBounds(0, 69, 303, 333);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox cmbAmountPaid = new JComboBox();
		cmbAmountPaid.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "P20", "P50", "P200", "P400"}));
		cmbAmountPaid.setBounds(159, 290, 119, 20);
		panel.add(cmbAmountPaid);
		
		JComboBox cmbMembershipType = new JComboBox();
		cmbMembershipType.setBounds(159, 256, 119, 23);
		panel.add(cmbMembershipType);
		cmbMembershipType.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Monthly", "Quarterly", "Six Months", "Annually"}));
		
		JComboBox cmbProveOfID = new JComboBox();
		cmbProveOfID.setBounds(159, 225, 119, 20);
		panel.add(cmbProveOfID);
		cmbProveOfID.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Student ID", "Driver's License", "Pilot License", "Passport"}));
		
		txtDateRegistered = new JTextField();
		txtDateRegistered.setBounds(157, 184, 121, 20);
		panel.add(txtDateRegistered);
		txtDateRegistered.setColumns(10);
		
		txtTelephone = new JTextField();
		txtTelephone.setBounds(157, 158, 121, 20);
		panel.add(txtTelephone);
		txtTelephone.setColumns(10);
		
		txtPostCode = new JTextField();
		txtPostCode.setBounds(159, 127, 119, 20);
		panel.add(txtPostCode);
		txtPostCode.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(159, 102, 119, 20);
		panel.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtSurName = new JTextField();
		txtSurName.setBounds(159, 71, 119, 20);
		panel.add(txtSurName);
		txtSurName.setColumns(10);
		
		txtReferenceNo = new JTextField();
		txtReferenceNo.setBounds(159, 23, 119, 20);
		panel.add(txtReferenceNo);
		txtReferenceNo.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(159, 48, 119, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 102)));
		panel_1.setBounds(0, 3, 1009, 62);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Membership Registration System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 102)));
		panel_1_1.setBounds(0, 413, 1009, 62);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[]{
						txtReferenceNo.getText(),
						txtFirstName.getText(),
						txtSurName.getText(),
						txtAddress.getText(),
						txtPostCode.getText(),
						txtTelephone.getText(),
						txtDateRegistered.getText(),
						cmbProveOfID.getSelectedItem(),
						cmbAmountPaid.getSelectedItem(),
						cmbMembershipType.getSelectedItem(),
				
		});
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership update confirm","Membership Management System",JOptionPane.OK_OPTION);
					}
					
				}
			
				
				
			}
		});
		btnAddRecord.setBounds(52, 15, 111, 36);
		panel_1_1.add(btnAddRecord);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtReferenceNo.setText(null);
				txtFirstName.setText(null);
				txtSurName.setText(null);
				txtAddress.setText(null);
				txtPostCode.setText(null);
				txtTelephone.setText(null);
				txtDateRegistered.setText(null);
				cmbProveOfID.setSelectedItem("Make a selection");
				cmbAmountPaid.setSelectedItem("Make a selection");
				cmbMembershipType.setSelectedItem("Make a selection");
			}
		});
		btnReset.setBounds(245, 15, 105, 36);
		panel_1_1.add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					table.print();
					
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
					
				}
			}
		});
		btnPrint.setBounds(451, 15, 111, 36);
		panel_1_1.add(btnPrint);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel)table.getModel();
						if(table.getSelectedRow() == -1) {
							if(table.getRowCount() == 0) {	
				

						JOptionPane.showMessageDialog(null, "No data delete","Membership Management System",JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "No data delete","Membership Management System",JOptionPane.OK_OPTION);
					}
					
				}else {
					model.removeRow(table.getSelectedRow());
				}
			
			}
		});
		btnDelete.setBounds(643, 15, 118, 36);
		panel_1_1.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Membership Registration System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION ) {
					
				}
				System.exit(0);	
				
			}
		});
		btnExit.setBounds(839, 15, 113, 36);
		panel_1_1.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 102)));
		panel_2.setBounds(313, 69, 696, 333);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 676, 311);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference No", "Firstname", "Surname", "Address", "Post Code", "Telephone", "Date Registered", "Prove of ID", "Membership Type", "Amount Paid"
			}
		));
		scrollPane.setViewportView(table);
	}
}
