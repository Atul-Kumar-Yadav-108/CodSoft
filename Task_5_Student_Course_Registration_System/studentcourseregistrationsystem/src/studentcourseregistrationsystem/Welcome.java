package studentcourseregistrationsystem;
import java.util.Scanner;

public class Welcome {
	
	Scanner sc;
	
	Welcome()
	{
		sc=new Scanner(System.in);
		
		
			System.out.println("Select Operation - \n        1 . Course Registration \n        2 . Student Course Registration\n        3 . Close System");
			System.out.print("Enter your choice : ");
			int opch=sc.nextInt();
			
			switch(opch)
			{
			case 1 : {
//				System.out.println("You have selected _ Course Registration");
				CourseReg();
				break;
				}
			case 2 :{
//				System.out.println("You have selected Student Course Registration");
				StudentCourseReg();
				break;
			}
			case 3 : System.out.println("\n\n                                                                              System is closed🫠\n"); System.exit(0); break;
			default : System.out.println("Please Choose a valid Operation\n"); 
			}
		sc.close();
	}
	
	private void CourseReg()
	{
		sc= new Scanner(System.in);
		Course course=new Course();
		
		while(true)
		{
			System.out.println("\n        1 . Enter cousre Details \n        2 . Show Course Details\n        3 . Delete Course\n        4 . Update Course Details\n        5 . Goto main menu\n");
			System.out.print("Enter your choice ");
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1: {
//					System.out.println("Enter course details");
					course.courseReg();
				break;
			}
			case 2: {
//				System.out.println("Show Course Details ");
				course.viewCourseDetails();
				break;
			}
			case 3: {
//				System.out.println("Delete Couse");
				course.deleteCourseDetails();
				break;
			}
			case 4: {
//				System.out.println("Update Course Detials");
				course.updateCourseDetails();
				break;
			}
			case 5: {
				new Welcome();
				break;
			}
			
			default:
				System.out.println("Enter a valid choice !!!!");
			}
			
			System.out.println("\nDo you want to countinue : (Y/N)");
			String str=sc.next();
			if(str.toUpperCase().equals("N"))
			{
				new Welcome();
			}
		}
		
	}
	
	private void StudentCourseReg()
	{
		sc= new Scanner(System.in);
		Student stud=new Student();
		
		while(true)
		{
			System.out.println("\n        1 . Student Course Registration \n        2 . Show Student Details\n        3 . Drop Course \n        4 . Goto main menu\n");
			System.out.print("Enter your choice ");
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1: {
//					System.out.println("Enter Student Details ");
				stud.studentCourseRegistration();
				
				break;
			}
			case 2: {
//				System.out.println("Show Student Details ");
				stud.viewStudentDetails();
				break;
			}
			case 3: {
//				System.out.println("Drop Course");
				stud.dropCourse();
				break;
			}
			case 4: {
				new Welcome();
				break;
			}
			
			default:
				System.out.println("Enter a valid choice !!!!");
			}
			
			System.out.println("\nDo you want to countinue : (Y/N)");
			String str=sc.next();
			if(str.toUpperCase().equals("N"))
			{
				new Welcome();
			}
		
		}
		
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("                                                                   STUDENT COURSE REGISTRATION SYSTEM\n\n");

		new Welcome();
		
		
	}
}
