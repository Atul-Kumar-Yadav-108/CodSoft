package quizapp;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Score extends JFrame {
	
	Score(String name, int score,int correct,int incorrect)
	{
		
		
		JLabel heading=new JLabel("Thank you "+ name +" for playing QUIZ Test.");
		heading.setBounds(100,180,700,30);
		heading.setFont(new Font("Tahoma",Font.BOLD,26));
		add(heading);
		
		JLabel Score=new JLabel("Your score is : "+ score +" ");
		Score.setBounds(400,250,300,30);
		Score.setFont(new Font("Tahoma",Font.BOLD,26));
		add(Score);
		
		JLabel ct=new JLabel("Your correct Questions are : "+ correct +"");
		ct.setBounds(400,300,300,30);
		ct.setFont(new Font("Tahoma",Font.BOLD,18));
		add(ct);
		
		
		JLabel ict=new JLabel("Your Incorrect Questions are : "+ incorrect +"");
		ict.setBounds(400,350,300,30);
		ict.setFont(new Font("Tahoma",Font.BOLD,18));
		add(ict);
		
		
		JButton exit=new JButton("Exit");
		exit.setBounds(450,400,120,30);
		exit.setBackground(new Color(2,99,54));
		exit.setForeground(Color.white);
		add(exit);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				new Login();
				
			}
		});
		
		
		ImageIcon i111=new ImageIcon(ClassLoader.getSystemResource("image/result1.png"));
		Image i211=i111.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT	);
		ImageIcon i311=new ImageIcon(i211);
		JLabel res11=new JLabel(i311);
		res11.setBounds(30,250,250,200);
		add(res11);
		
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("image/result2.png"));
		Image i21=i11.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT	);
		ImageIcon i31=new ImageIcon(i21);
		JLabel res1=new JLabel(i31);
		res1.setBounds(10,220,400,300);
		add(res1);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/congra.png"));
		Image i2=i1.getImage().getScaledInstance(750, 200, Image.SCALE_DEFAULT	);
		ImageIcon i3=new ImageIcon(i2);
		JLabel cong=new JLabel(i3);
		cong.setBounds(0,0,750,200);
		add(cong);
		
		
		
		getContentPane().setBackground(Color.white);
		setSize(750,550);
		setLocation(400,150);
		setUndecorated(false);
		setLayout(null);
		setTitle("Scores");
		
		setAlwaysOnTop(true);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Score("User",0,0,0);
	}

}
