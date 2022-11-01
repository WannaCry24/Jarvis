package allinone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;

public class loginpage {

	private JFrame frame;

	public static void main(String[] args) {
		new loginpage();
	}
	
	
	public loginpage()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 901, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Login = new JLabel("LOGIN PAGE");
		Login.setBounds(369, 65, 163, 31);
		Login.setFont(new Font("Schadow BT", Font.BOLD, 25));
		frame.getContentPane().add(Login);
		frame.setVisible(true);
	}
}
