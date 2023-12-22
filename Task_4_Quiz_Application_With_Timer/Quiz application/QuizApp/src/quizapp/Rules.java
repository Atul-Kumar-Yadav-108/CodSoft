package quizapp;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Rules extends JFrame implements ActionListener{
	
	JButton back,start;
	String name;
	
	Rules(String name)
	{	
		
		this.name=name;
		
		getContentPane().setBackground(Color.white);
		setLocation(300,150);
		setSize(1000,500);
		setTitle("QUIZ Rules ");
		setLayout(null);
		
		JLabel heading=new JLabel("Welcome "+name+" to QUIZ test");
		heading.setBounds(250,20,500,50);
		heading.setFont(new Font("verdana",Font.BOLD,32));
		heading.setForeground(Color.red);
		add(heading);
		
		JLabel rules=new JLabel("Rules : ");
		rules.setBounds(150,100,90,25);
		rules.setFont(new Font("Tahoma",Font.BOLD,24));
		rules.setForeground(Color.yellow);
		add(rules);
		
		JLabel rules1=new JLabel();
		rules1.setBounds(180,125,900,250);
		rules1.setFont(new Font("Tahoma",Font.BOLD,16));
		rules1.setForeground(Color.white);
		
		rules1.setText(
				"<html>"+
						"1 . Participation in the quiz is free and open to all persons above 18 years old."+"<br><br>"+
						"2 . There are total 10 questions. "+"<br><br>"+
						"3 . You have only 15 seconds to answer the question."+"<br><br>"+
						"4 . No cell phones or any other devices in the room or test area are allowed."+"<br><br>"+
						"5 . No talking is allowed."+"<br><br>"+
						"6 . No one else can be in the room with you."+"<br><br>"+
				"<html>"
				
				
				
				);
		add(rules1);
		
		
		start=new JButton("Start");
		start.setBounds(780,385,150,50);
		start.setFont(new Font("Verdana",Font.BOLD,25));
		start.setBackground(Color.green);
		start.setForeground(Color.red);
		start.addActionListener(this);
		add(start);
		
		back=new JButton("Back");
		back.setBounds(70,385,150,50);
		back.setFont(new Font("Verdana",Font.BOLD,25));
		back.setBackground(Color.red);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/bgpage.jpg"));
		Image i2=i1.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel img=new JLabel(i3);
		img.setBounds(0,0,1000,500);
		add(img);
		
		setUndecorated(false);
		setAlwaysOnTop(true);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==start)
		{
			
			Quiz qz=new Quiz(name);
			qz.setAlwaysOnTop(true);
			setVisible(false);
			
		}else if(e.getSource()==back)
		{
			Login lg=new Login();
			lg.setAlwaysOnTop(true);
			setVisible(false);
		}
		
	}
	
	public static void main(String[] a)
	{
		new Rules("User");
	}

}
