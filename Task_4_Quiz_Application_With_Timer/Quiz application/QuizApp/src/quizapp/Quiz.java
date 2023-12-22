package quizapp;
import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Quiz extends JFrame implements ActionListener{
	
	String[][] questions = new String[10][5];
	String[][] answers=new String[10][2];
	String useranswers[][]=new String[10][1];
	
	ButtonGroup group;
	JRadioButton a,b,c,d;
	JLabel qno,question;
	JButton save,next,help;
	public static int timer=30;
	public static int ans_given=0;
	public static int count=0;
	public static int score=0,incorrect=0,correct=0;
	String name;
	
	
	Quiz(String name){
		
		this.name=name;
		
		qno=new  JLabel();
		qno.setBounds(100,250,50,30);
		qno.setFont(new Font("Tahoma",Font.PLAIN,24));
		add(qno);
		
		question =new JLabel();
		question.setBounds(150,250,1000,30);
		question.setFont(new Font("Tahoma",Font.PLAIN,24));
		add(question);
		
		
		questions[0][0] = "Number of primitive data types in Java are.?";
        questions[0][1] = "6";
        questions[0][2] = "7";
        questions[0][3] = "8";
        questions[0][4] = "9";

        questions[1][0] = "What is the size of float and double in java.?";
        questions[1][1] = "32 and 64";
        questions[1][2] = "32 and 32";
        questions[1][3] = "64 and 64";
        questions[1][4] = "64 and 32";

        questions[2][0] = "Automatic type conversion is possible in which of the possible cases?";
        questions[2][1] = "Byte to int";
        questions[2][2] = "Int to Long";
        questions[2][3] = "Long to int";
        questions[2][4] = "Short to int";

        questions[3][0] = "When an array is passed to a method, what does the method receive?";
        questions[3][1] = "The reference of the array";
        questions[3][2] = "A copy of the array";
        questions[3][3] = "Length of the array";
        questions[3][4] = "Copy of first element";

        questions[4][0] = "Arrays in java are.?";
        questions[4][1] = "Object References";
        questions[4][2] = "Objects";
        questions[4][3] = "Primitive data type";
        questions[4][4] = "None";

        questions[5][0] = "When is the object created with new keyword?";
        questions[5][1] = "At rum time";
        questions[5][2] = "At compile time";
        questions[5][3] = "Depends on the code";
        questions[5][4] = "None";

        questions[6][0] = "Identify the corrected definition of a package.?";
        questions[6][1] = "A package is a collection of editing tools";
        questions[6][2] = "A package is a collection of Classes";
        questions[6][3] = "A package is a collection of Classes and interfaces";
        questions[6][4] = "A package is a collection of interfaces";

        questions[7][0] = "compareTo() returns";
        questions[7][1] = "True";
        questions[7][2] = "False";
        questions[7][3] = "An int value";
        questions[7][4] = "None";

        questions[8][0] = "To which of the following does the class string belong to.";
        questions[8][1] = "java.lang";
        questions[8][2] = "java.awt";
        questions[8][3] = "java.applet";
        questions[8][4] = "java.String";

        questions[9][0] = "Total constructor string class have.?";
        questions[9][1] = "3";
        questions[9][2] = "7";
        questions[9][3] = "13";
        questions[9][4] = "20";
        
        answers[0][1] = "8";
        answers[1][1] = "32 and 64";
        answers[2][1] = "Int to Long";
        answers[3][1] = "The reference of the array";
        answers[4][1] = "Objects";
        answers[5][1] = "At rum time";
        answers[6][1] = "A package is a collection of Classes and interfaces";
        answers[7][1] = "An int value";
        answers[8][1] = "java.lang";
        answers[9][1] = "13";
		
		
        a=new JRadioButton();
        a.setBounds(170,340,700,30);
        a.setBackground(Color.white);
        a.setFont(new Font("Dialog",Font.PLAIN,20));
        add(a);
        
        b=new JRadioButton();
        b.setBounds(170,400,700,30);
        b.setBackground(Color.white);
        b.setFont(new Font("Dialog",Font.PLAIN,20));
        add(b);
        
        c=new JRadioButton();
        c.setBounds(170,460,700,30);
        c.setBackground(Color.white);
        c.setFont(new Font("Dialog",Font.PLAIN,20));
        add(c);
        
        d=new JRadioButton();
        d.setBounds(170,520,700,30);
        d.setBackground(Color.white);
        d.setFont(new Font("Dialog",Font.PLAIN,20));
        add(d);
        
        
        group=new ButtonGroup();
        group.add(a);
        group.add(b);
        group.add(c);
        group.add(d);
        
        
        next=new JButton("Next");
        next.setBounds(700,600,200,30);
        next.setBackground(new Color(22,99,54));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
        
        save=new JButton("Submit");
        save.setBounds(1150,600,200,30);
        save.setBackground(new Color(255,215,0));
        save.setForeground(Color.black);
        save.addActionListener(this);
        add(save);
        
        help=new JButton("Help");
        help.setBounds(930,600,200,30);
        help.setBackground(Color.LIGHT_GRAY);
        help.setForeground(Color.black);
        help.addActionListener(this);
        add(help);
        
        start(count);
        
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("image/headerquiz.jpg"));
		Image i21=i11.getImage().getScaledInstance(1340, 180, Image.SCALE_DEFAULT);
		ImageIcon i31=new ImageIcon(i21);
		JLabel bg1=new JLabel(i31);
		bg1.setBounds(50,50,1340,180);
		add(bg1);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/quiz.png"));
		Image i2=i1.getImage().getScaledInstance(1440, 820, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel bg=new JLabel(i3);
		bg.setBounds(0,0,1440,820);
		add(bg);
		
		
		setSize(1440,820);
		setLocation(50,0);
		setTitle("QUIZ Test");
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setUndecorated(false);
		setAlwaysOnTop(true);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== next)
		{
			repaint();
			a.setEnabled(true);
			b.setEnabled(true);
			c.setEnabled(true);
			d.setEnabled(true);
			ans_given=1;
			if(group.getSelection()==null)
			{
				useranswers[count][0]="";
				
			}else {
				useranswers[count][0]=group.getSelection().getActionCommand();
			}
			
			if(count==8)
			{
				next.setEnabled(false);
				save.setEnabled(true);
			}
			
			count++;
			start(count);
		}
		else if(e.getSource()== help)
		{
			if (count==2 || count == 4 || count == 6 || count == 8 || count ==9)
			{
				b.setEnabled(false);
				c.setEnabled(false);
			}else
			{
				a.setEnabled(false);
				d.setEnabled(false);
			}
			
			help.setEnabled(false);
		}
		else if(e.getSource() == save)
		{
			ans_given=1;
			if(group.getSelection() == null) {
				useranswers[count][0]="";
			}else {
				useranswers[count][0]=group.getSelection().getActionCommand();
			}
			
			for(int i=0; i<useranswers.length;i++)
			{
				if(useranswers[i][0].equals(answers[i][1])) {
					score +=10;
					correct++;
				}else {
					score +=0;
					incorrect++;
				}
			}
			setVisible(false);
			Score sr=new Score(name,score,correct,incorrect);
			sr.setAlwaysOnTop(true);
		}
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		String time = "Time left - " + timer + "seconds";
		g.setColor(Color.red);
		g.setFont(new Font("Verdana",Font.BOLD,25));
		if(timer>0)
		{
			g.drawString(time, 1050, 300);
		}
		else {
			g.drawString("Times up!!!",1050,300);
		}
		
		timer--;
		
		try {
			Thread.sleep(1000);
			repaint();
		}catch(Exception we)
		{
			we.printStackTrace();
		}
		
		
		if(ans_given==1)
		{
			ans_given=0;
			timer=30;
			
		}else if( timer<0) {
			timer =30;
			a.setEnabled(true);
			b.setEnabled(true);
			c.setEnabled(true);
			d.setEnabled(true);
			
			if(count == 8)
			{
				next.setEnabled(false);
				save.setEnabled(true);
			}
			if(count ==9)
			{
				if(group.getSelection()==null)
				{
					useranswers[count][0] ="";
				}else {
					useranswers[count][0] = group.getSelection().getActionCommand();
					
				}
				
				for(int i=0;i<useranswers.length;i++)
				{
					if(useranswers[i][0].equals(answers[i][1]))
					{
						score +=10;
					}else
					{
						score +=0;
					}
				}
				setVisible(false);
				Score sr=new Score(name,score,correct,incorrect);
				sr.setAlwaysOnTop(true);
			}else {
				if(group.getSelection()== null)
				{
					useranswers[count][0]="";
					
				}else
				{
					useranswers[count][0]=group.getSelection().getActionCommand();
				}
				count++;
				start(count);
			}
		}
		
	}
	
	
	public void start(int count) {
		qno.setText(""+ (count+1)+". ");
		question.setText(questions[count][0]);
		
		a.setText(questions[count][1]);
		a.setActionCommand(questions[count][1]);
		
		b.setText(questions[count][2]);
		b.setActionCommand(questions[count][2]);

		c.setText(questions[count][3]);
		c.setActionCommand(questions[count][3]);
		
		d.setText(questions[count][4]);
		d.setActionCommand(questions[count][4]);
		
		
		group.clearSelection();
	}
	
	public static void main(String[] args) {
		new Quiz("User");
	}

}
