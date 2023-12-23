package studentcourseregistrationsystem;

import java.sql.*;
import java.util.Scanner;



public class Course {

	static Connection con;
	private static  Scanner sc;
	
	private static void connect()
	{
		
		try {
			con=DriverManager.getConnection("jdbc:ucanaccess://student_course_db.accdb");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	Course(){
		connect();
	}
	
	
	
	protected void courseReg()
	{
		sc= new Scanner(System.in);
		System.out.print("Enter CourseID : ");
		String scid=sc.nextLine();
//		String title1=sc.nextLine();
		System.out.print("Enter Title : ");
		String title=sc.nextLine();
		System.out.print("Description of Course : ");
		String desc=sc.nextLine();
		System.out.print("Enter Capacity : ");
		int cap=sc.nextInt();
		System.out.print("Enter Scedule( in Month) : ");
		int schedule=sc.nextInt();
		
		connect();
		try {
		String query="INSERT INTO course(CourseID,Title,Description,Capacity,Schedule) VALUES(?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(query);
		
		st.setString(1, scid);
		st.setString(2, title);
		st.setString(3, desc);
		st.setInt(4, cap);
		st.setInt(5, schedule);
		int rowAffected=st.executeUpdate();
		
		if(rowAffected>0) {
			System.out.println("Record inserted successfully!!!");
		}
		else
		{
			System.out.println("Record insertion Failed!!!");	
		}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
	protected void viewCourseDetails()
	{
		sc=new Scanner(System.in);
		
		try {
			PreparedStatement pst=con.prepareStatement("SELECT * FROM course");
			ResultSet rs=pst.executeQuery();
			
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("CourseID       TITLE                         DESCRIPTION                                                                                      CAPACITY   SCHEDULE(IN MONTHS)");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			while(rs.next())
			{
				String courseID=rs.getString(2);
				String title=rs.getString(3);
				String desc=rs.getString(4);
				String capacity=rs.getString(5);
				String schedule=rs.getString(6);
				
				System.out.printf("%-15s%-30s%-100s%-10s%-20s\n",courseID,title,desc,capacity,schedule);
				
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	protected void deleteCourseDetails()
	{
		sc= new Scanner(System.in);
		System.out.print("Enter CourseID : ");
		String scid=sc.nextLine();
		
		connect();
		try {
		String query="DELETE FROM course WHERE CourseID=?";
		PreparedStatement st=con.prepareStatement(query);
		
		st.setString(1, scid);
		int rowAffected=st.executeUpdate();
		
		if(rowAffected>0) {
			System.out.println("Record inserted successfully!!!");
		}
		else
		{
			System.out.println("Record deletion Failed!!!");	
		}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
		
	}
	
	
	protected void updateCourseDetails()
	{
		sc= new Scanner(System.in);
		System.out.print("Enter CourseID : ");
		String scid=sc.nextLine();
		System.out.print("Enter Capacity : ");
		int cap=sc.nextInt();
		System.out.print("Enter Scedule( in Month) : ");
		int schedule=sc.nextInt();
		
		connect();
		try {
		String query="UPDATE course SET Capacity=?,Schedule=? WHERE CourseID=?";
		PreparedStatement st=con.prepareStatement(query);
		
		st.setString(3, scid);
		st.setInt(1, cap);
		st.setInt(2, schedule);
		int rowAffected=st.executeUpdate();
		
		if(rowAffected>0) {
			System.out.println("Record Updated successfully!!!");
		}
		else
		{
			System.out.println("Record updation Failed!!!");	
		}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new Course();
	}
}
