package allinone;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class loginpage {

	private JFrame frame;

	public static void main(String[] args) {
		new loginpage();
	}
	
	
	public loginpage()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
	}
}
