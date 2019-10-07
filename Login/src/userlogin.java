import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class userlogin {

	private JFrame frmUserLogin;
	private JTextField unametext;
	private JPasswordField passtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userlogin window = new userlogin();
					window.frmUserLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public userlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUserLogin = new JFrame();
		frmUserLogin.setTitle("User Login");
		frmUserLogin.setBounds(100, 100, 450, 300);
		frmUserLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserLogin.getContentPane().setLayout(null);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		loginbtn.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		loginbtn.setBounds(350, 187, 78, 26);
		frmUserLogin.getContentPane().add(loginbtn);
		
		unametext = new JTextField();
		unametext.setBounds(304, 73, 124, 26);
		frmUserLogin.getContentPane().add(unametext);
		unametext.setColumns(10);
		
		passtext = new JPasswordField();
		passtext.setBounds(304, 133, 124, 26);
		frmUserLogin.getContentPane().add(passtext);
		
		JButton cancelbtn = new JButton("Cancel");
		cancelbtn.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		cancelbtn.setBounds(260, 188, 78, 25);
		frmUserLogin.getContentPane().add(cancelbtn);
		
		JLabel unamelbl = new JLabel("Username :");
		unamelbl.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		unamelbl.setBounds(208, 72, 78, 20);
		frmUserLogin.getContentPane().add(unamelbl);
		
		JLabel passlbl = new JLabel("Password :");
		passlbl.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		passlbl.setBounds(208, 136, 82, 18);
		frmUserLogin.getContentPane().add(passlbl);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/vimalesh/Pictures/index.png"));
		lblNewLabel.setBounds(12, 30, 189, 172);
		frmUserLogin.getContentPane().add(lblNewLabel);
	}
}
