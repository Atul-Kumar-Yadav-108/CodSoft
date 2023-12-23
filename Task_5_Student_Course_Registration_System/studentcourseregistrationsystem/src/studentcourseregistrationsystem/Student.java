package studentcourseregistrationsystem;
import java.sql.*;

import java.util.Scanner;

public class Student {
	static Connection con;
	static Scanner sc;
	private static void connect()
	{
		try {
			con=DriverManager.getConnection("jdbc:ucanaccess://student_course_db.accdb");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	Student()
	{
		connect();
	}
	
	
	protected void studentCourseRegistration()
	{
		connect();
		sc=new Scanner(System.in);
		
		try {
			PreparedStatement pst1=con.prepareStatement("SELECT * FROM course WHERE Capacity>0");
			ResultSet rs1=pst1.executeQuery();
			System.out.println("\n------------------------------------------------------------");
			System.out.println("CourseID       Title               Capacity       Schedule");
			System.out.println("------------------------------------------------------------");
			while(rs1.next())
			{
				String courseid=rs1.getString("CourseID");
				String title=rs1.getString("Title");
				String Capacity=rs1.getString("Capacity");
				String duration=rs1.getString("Schedule");
				System.out.printf("%-15s%-20s%-15s%-20s\n",courseid,title,Capacity,duration);
			}
			
			System.out.print("Enter Student name : ");
			String name=sc.nextLine();
			System.out.print("Enter Course : ");
			String course=sc.nextLine().toUpperCase();
			
			PreparedStatement pst2=con.prepareStatement("INSERT INTO student(Student_Name,Registered_Course) VALUES(?,?)");
			
			pst2.setString(1, name);
			pst2.setString(2, course);
			
			int rowAffected=pst2.executeUpdate();
			
			if(rowAffected>0)
			{
				System.out.println("Student Course Registration Successfull!!!!");
				PreparedStatement pst3=con.prepareStatement("Update course SET Capacity=Capacity-1 WHERE Title=?");
				pst3.setString(1, course);
				pst3.executeUpdate();
			}
			else {
				System.out.println("Registration Failed!!!!");
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	protected void viewStudentDetails()
	{
		
		try {
			PreparedStatement pst=con.prepareStatement("SELECT * FROM student");
			ResultSet rs=pst.executeQuery();
			
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("StudentID       Name                                   DESCRIPTION                                    ");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			while(rs.next())
			{
				String StudentID=rs.getString(1);
				String Student_Name=rs.getString(2);
				String Registered_Course=rs.getString(3);
				
				System.out.printf("%-15s%-40s%-100s\n",StudentID,Student_Name,Registered_Course);
				
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	protected void dropCourse() 
	{
		sc=new Scanner(System.in);
		connect();
		try {
			PreparedStatement pst1=con.prepareStatement("SELECT * FROM student");
			ResultSet rs1=pst1.executeQuery();
			System.out.println("\n------------------------------------------------------------");
			System.out.println("Student name                 Registered Course               ");
			System.out.println("------------------------------------------------------------");
			while(rs1.next())
			{
				String name=rs1.getString("Student_Name");
				String Registered_Course1=rs1.getString("Registered_Course");
				System.out.printf("%-30s%-30s\n",name,Registered_Course1);
			}
			
			System.out.print("\nEnter Student name : ");
			String name=sc.nextLine();
			System.out.print("Enter Course : ");
			String course=sc.nextLine().toUpperCase();
			
			PreparedStatement pst2=con.prepareStatement("DELETE FROM student WHERE Student_Name=? and Registered_Course=?");
			
			pst2.setString(1, name);
			pst2.setString(2, course);
			
			int rowAffected=pst2.executeUpdate();
			
			if(rowAffected>0)
			{
				System.out.println("Course Dropped Successfully!!!!");
				PreparedStatement pst3=con.prepareStatement("Update course SET Capacity=Capacity+1 WHERE Title=?");
				pst3.setString(1, course);
				pst3.executeUpdate();
			}
			else {
				System.out.println("Course Dropped Failed!!!!");
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	

	public static void main(String[] args) {
		new Student();
	}
}
