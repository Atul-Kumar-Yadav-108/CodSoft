package quizapp;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	
	private JTextField nametxt;
	private JButton close,Next;
	
	Login()
	{
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setSize(1000,500);
		setLocation(300,100);
		setTitle("Quiz application");
		
		
		JLabel heading=new JLabel("Welcome To QUIZ Test");
		heading.setBounds(320,-40,600,150);
		heading.setFont(new Font("verdana",Font.BOLD,32));
		heading.setBackground(Color.white);
		heading.setForeground(Color.white);
		add(heading);
		
		ImageIcon iml1=new ImageIcon(ClassLoader.getSystemResource("image/lofinlogo.png"));
		Image iml2=iml1.getImage().getScaledInstance(150, 80, Image.SCALE_DEFAULT);
		ImageIcon iml3=new ImageIcon(iml2);
		JLabel imglbl1=new JLabel(iml3);
		imglbl1.setBounds(150,0,150,80);
		add(imglbl1);
		
		
		JLabel name=new JLabel("Enter your name  ");
		name.setBounds(400,150,300,20);
		name.setFont(new Font("Monolian Baiti",Font.BOLD,18));
		name.setForeground(Color.white);
		add(name);
		
		nametxt=new JTextField();
		nametxt.setBounds(320,200,300,30);
		nametxt.setFont(new Font("verdana",Font.BOLD,18));
		nametxt.setForeground(new Color(90,50,168));
		add(nametxt);
		
		
		close=new JButton("Close");
		close.setBounds(340,270,120,30);
		close.setBackground(Color.red);
		close.setForeground(Color.white);
		close.setFont(new Font("verdana",Font.BOLD,18));
		close.addActionListener(this);
		add(close);
		
		Next=new JButton("Next");
		Next.setBounds(480,270,120,30);
		Next.setBackground(Color.green);
		Next.setForeground(Color.red);
		Next.setFont(new Font("verdana",Font.BOLD,18));
		Next.addActionListener(this);
		add(Next);
		
		
		
		ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("image/loginimg.jpg"));
		Image im2=im1.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
		ImageIcon im3=new ImageIcon(im2);
		JLabel imglbl=new JLabel(im3);
		imglbl.setBounds(0,0,1000,500);
		add(imglbl);
		
		
		setUndecorated(false);
		setAlwaysOnTop(true);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()== Next)
		{
			String name=nametxt.getText();
			setVisible(false);
			Rules rl=new Rules(name);
			rl.setAlwaysOnTop(true);
		}
		else if (e.getSource()== close)
		{
			System.exit(0);
		}
		{
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
