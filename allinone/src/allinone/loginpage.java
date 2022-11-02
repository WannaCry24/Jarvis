package allinone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class loginpage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args)
	{
		new loginpage();
	}
	
	
	public loginpage()
	{
		frame = new JFrame();
		//frame.setEnabled(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Wanna\\Downloads\\1900851.png"));
		frame.setFont(new Font("Arial Black", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 901, 733);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Login = new JLabel("SIGN IN");
		Login.setBounds(420, 56, 167, 105);
		Login.setFont(new Font("Schadow BT", Font.BOLD, 40));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(320, 56, 72, 105);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Wanna\\Downloads\\png\\72\\arrow_down2.png"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(92, 457, 143, 140);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Wanna\\Downloads\\playstation-triangle-icon.png"));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Login);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel username = new JLabel("User Name");
		username.setForeground(new Color(255, 0, 255));
		username.setFont(new Font("Verdana", Font.BOLD, 30));
		username.setBounds(248, 229, 224, 47);
		frame.getContentPane().add(username);
		
		JLabel password = new JLabel("Password");
		password.setForeground(new Color(255, 0, 255));
		password.setFont(new Font("Verdana", Font.BOLD, 30));
		password.setBounds(248, 371, 186, 47);
		frame.getContentPane().add(password);
		
		textField = new JTextField();
		textField.setBounds(518, 229, 191, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(518, 376, 191, 47);
		frame.getContentPane().add(passwordField);
		frame.setVisible(true);
	}
}
