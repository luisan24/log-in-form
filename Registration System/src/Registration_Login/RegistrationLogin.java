package Registration_Login;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import Registration_System.Registration_System;

public class RegistrationLogin {

	private JFrame frmEmmanApps;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationLogin window = new RegistrationLogin();
					window.frmEmmanApps.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrationLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmmanApps = new JFrame();
		frmEmmanApps.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmEmmanApps.getContentPane().setForeground(Color.BLUE);
		frmEmmanApps.setForeground(Color.BLUE);
		frmEmmanApps.setFont(new Font("Arabic Typesetting", Font.BOLD | Font.ITALIC, 15));
		frmEmmanApps.setTitle("Membership Registration System");
		frmEmmanApps.setBounds(100, 100, 450, 250);
		frmEmmanApps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setBounds(10, 178, 124, 23);
		btnNewButton.setToolTipText("Log in Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				String password = txtPassword.getText();
				String userName = txtUserName.getText();
				
				if(password.equals("admin") && userName.equals("admin123")) {	
					txtPassword.setText(null);
					txtUserName.setText(null);
					
				Registration_System info = new Registration_System();
				///Registration_System.main(null);
				info.main(null);
				
									
			
				}
			else 
			{
				JOptionPane.showMessageDialog(null, "Invalid Log in Details","Log in Error",JOptionPane.ERROR_MESSAGE);
				txtPassword.setText(null);
				txtUserName.setText(null);
				
			}
				
			}
			});
		frmEmmanApps.getContentPane().setLayout(null);
		
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		frmEmmanApps.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(150, 178, 124, 23);
		btnReset.setToolTipText("Reset Button");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserName.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		btnReset.setBackground(Color.BLACK);
		frmEmmanApps.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(300, 178, 124, 23);
		btnExit.setToolTipText("Exit Button");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION ) {
					
				}
				System.exit(0);	
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		btnExit.setBackground(Color.BLACK);
		frmEmmanApps.getContentPane().add(btnExit);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(147, 75, 243, 23);
		txtUserName.setFont(new Font("Arabic Typesetting", Font.BOLD, 15));
		frmEmmanApps.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(28, 76, 64, 19);
		frmEmmanApps.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(28, 106, 84, 20);
		frmEmmanApps.getContentPane().add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(147, 105, 243, 23);
		frmEmmanApps.getContentPane().add(txtPassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 151, 384, 2);
		frmEmmanApps.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(25, 54, 384, 2);
		frmEmmanApps.getContentPane().add(separator_1);
		
		JLabel lblLogInForm = new JLabel("LOG IN FORM");
		lblLogInForm.setBounds(120, 11, 208, 32);
		lblLogInForm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frmEmmanApps.getContentPane().add(lblLogInForm);
			}
		}
	
	
