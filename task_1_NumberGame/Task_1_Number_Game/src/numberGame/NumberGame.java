package numberGame;

import java.awt.Color;
import java.awt.Font;
//import java.lang.Math.*;
import java.util.*;
import javax.swing.*;

public class NumberGame extends JFrame{
	
	JTextField tfuserround;
	
	NumberGame(){
		
		getContentPane().setBackground(new Color(225,165,255));
		setLayout(null);
		
		
		
		JLabel lbl1=new JLabel("Number Game");
		
		lbl1.setForeground(Color.white);
		lbl1.setFont(new Font("verdana",Font.BOLD,45));
		lbl1.setBounds(600,30,500,60);
		add(lbl1);
		
		

		
		
		Scanner sc=new Scanner(System.in);
		
		int min = 1;  
		int max = 100;  
		int b = (int)(Math.random()*(max-min+1)+min);  
//		System.out.println(b);  
		
		
		
		
		
		JPanel panel=new JPanel();
		panel.setBounds(700,100,700,700);
		panel.setBackground(new Color(204,0,204,95));
		panel.setLayout(null);
		add(panel);
		
		JLabel userroundlbl=new JLabel("How many rounds want to play? : ");
//		userchlbl.setText("Score : "+Integer.toString(b));
		userroundlbl.setForeground(Color.black);
		userroundlbl.setFont(new Font("verdana",Font.BOLD,16));
		userroundlbl.setBounds(10,60,350,30);
		panel.add(userroundlbl);
		
		
		tfuserround=new JTextField();
//		userchlbl.setText("Score : "+Integer.toString(b));
		tfuserround.setForeground(Color.black);
		tfuserround.setFont(new Font("verdana",Font.BOLD,16));
		tfuserround.setBounds(320,60,150,30);
		panel.add(tfuserround);
		
		JLabel userchlbl=new JLabel("Enter your number : ");
//		userchlbl.setText("Score : "+Integer.toString(b));
		userchlbl.setForeground(Color.black);
		userchlbl.setFont(new Font("verdana",Font.BOLD,16));
		userchlbl.setBounds(10,90,200,30);
		panel.add(userchlbl);
		
		
		
		
//		JLabel randomlbl=new JLabel();
//		randomlbl.setText("The correct number is "+Integer.toString(b));
//		randomlbl.setForeground(Color.blue);
//		randomlbl.setFont(new Font("verdana",Font.BOLD,22));
//		randomlbl.setBounds(100,150,500,50);
//		add(randomlbl);
		
		JButton exitbtn=new JButton("EXIT");
		exitbtn.setBounds(1200,30,100,40);
		exitbtn.setForeground(Color.white);
		exitbtn.setBackground(new Color(255,51,51));
		exitbtn.setFont(new Font("verdana",Font.BOLD,24));
		add(exitbtn);
		
		JLabel PlayerNamelbl=new JLabel();
		PlayerNamelbl.setText("Player Name : "+Integer.toString(b));
		PlayerNamelbl.setForeground(Color.blue);
		PlayerNamelbl.setFont(new Font("verdana",Font.BOLD,22));
		PlayerNamelbl.setBounds(25,150,500,30);
		add(PlayerNamelbl);
		
//		String name=
		JLabel tRoundlbl=new JLabel();
		tRoundlbl.setText("Total Rounds : "+(this.tfuserround.getText()));
		tRoundlbl.setForeground(Color.blue);
		tRoundlbl.setFont(new Font("verdana",Font.BOLD,22));
		tRoundlbl.setBounds(25,200,300,30);
		add(tRoundlbl);
		
		
		JLabel cRoundlbl=new JLabel();
		cRoundlbl.setText("Current Round : "+Integer.toString(b));
		cRoundlbl.setForeground(Color.blue);
		cRoundlbl.setFont(new Font("verdana",Font.BOLD,22));
		cRoundlbl.setBounds(25,250,300,30);
		add(cRoundlbl);
		
		
		JLabel Scorelbl=new JLabel();
		Scorelbl.setText("Score : "+Integer.toString(b));
		Scorelbl.setForeground(Color.blue);
		Scorelbl.setFont(new Font("verdana",Font.BOLD,22));
		Scorelbl.setBounds(25,300,200,30);
		add(Scorelbl);
		
	
		
		
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		

		
		
	}
	
	public static void main(String[] a)
	{
		new NumberGame();
	}
	
}
