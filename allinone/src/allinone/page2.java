package allinone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class page2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) 
	{
		new page2();
	}
	
	public page2() 
		{
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 128));
		frame.setBounds(100, 100, 1000, 747);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

//frame.setBounds(null);
frame.getContentPane().setLayout(null);

JLabel reg = new JLabel("REGISTRATION FORM");
reg.setFont(new Font("Times New Roman", Font.BOLD, 40));
reg.setBounds(286, 37, 558, 82);
frame.getContentPane().add(reg);


JLabel name = new JLabel("Name");
name.setFont(new Font("Bell MT", Font.BOLD, 25));
name.setBounds(250, 170, 150, 50);
frame.getContentPane().add(name);


JLabel email = new JLabel("Email");
email.setFont(new Font("Bell MT", Font.BOLD, 25));
email.setBounds(250, 250, 120, 50);
frame.getContentPane().add(email);


JLabel gender = new JLabel("Gender");
gender.setFont(new Font("Bell MT", Font.BOLD, 25));
gender.setBounds(250, 335, 120, 50);
frame.getContentPane().add(gender);
textField = new JTextField();
textField.setBounds(492, 178, 111, 30);
frame.getContentPane().add(textField);
textField.setColumns(10);
textField_1 = new JTextField();
textField_1.setBounds(492, 258, 111, 30);
frame.getContentPane().add(textField_1);
textField_1.setColumns(10);
JRadioButton male = new JRadioButton("Male");
male.setBounds(492, 348, 70, 30);
frame.getContentPane().add(male);
JRadioButton female = new JRadioButton("Female");
female.setBounds(711, 348, 70, 30);
frame.getContentPane().add(female);
JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("I accept terms and conditions");
rdbtnNewRadioButton_2.setBackground(new Color(0, 255, 128));
rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
rdbtnNewRadioButton_2.setBounds(250, 588, 270, 39);
frame.getContentPane().add(rdbtnNewRadioButton_2);
JButton register = new JButton("Register");
register.setForeground(new Color(0, 64, 128));
register.setBackground(new Color(128, 128, 128));
register.setFont(new Font("Times New Roman", Font.PLAIN, 20));
register.setBounds(711, 587, 103, 40);
frame.getContentPane().add(register);
JLabel phoneno = new JLabel("Phone No");
phoneno.setFont(new Font("Bell MT", Font.BOLD, 25));
phoneno.setBounds(250, 448, 120, 30);
frame.getContentPane().add(phoneno);
textField_2 = new JTextField();
textField_2.setBounds(492, 448, 111, 28);
frame.getContentPane().add(textField_2);
textField_2.setColumns(10);

frame.setVisible(true);	}
}
