package studentGradeCalculator;

import java.util.*;




public class StudentGradeCalculator1 {

	static String gradeCalci(int m)
	{
		String grade="";
		if(m>=90 && m<=100)
			grade="A++";
		else if(m>=80 && m<=89)
			grade="A+";
		else if(m>=70 && m<=79)
			grade="A";
		else if(m>=60 && m<=69)
			grade="B";
		else if(m>=50 && m<=59)
			grade="C";
		else if(m>=40 && m<=49)
			grade="A";
		else 
			grade="E";
		return grade;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n                                                      STUDENT GRADE CALCULATOR\n\n\n");
		
		String[] sub_name=new String[] {"Java","Python","Operating System","Software Engineering","Web Technology"};
//		ArrayList<Integer> marks=new ArrayList<Integer>();
		int[] marks=new int[sub_name.length];
//		ArrayList<String> grade1=new ArrayList<String>();
		
		String[] grade1=new String[sub_name.length];
		
		int total_marks=0;
		
		for (int i = 0; i < sub_name.length; i++) {
			
			System.out.print("Enter marks for "+sub_name[i]+" (out of 100) : ");
			marks[i]=sc.nextInt();
//			marks.add(mark);
			
			
			String grade=gradeCalci(marks[i]);

			
//			grade1.add(grade);
			
			grade1[i]=grade;
		}
		
		for(int m: marks) {
			total_marks=total_marks+m;
		}
		
//		System.out.println("total marks : "+total_marks);
		
		float avg_percent=total_marks/sub_name.length;
		

		
//		System.out.println("The average percentage is : "+avg_percent+"%\n\n\n\n");
		
		System.out.println("\n\n\n");
		
		System.out.println(" ----------------------------------------------------------------------------------");
		System.out.println("                              Student Grade Result                                ");
		System.out.println(" ----------------------------------------------------------------------------------");
		System.out.println(" Subject Name                                  | Marks                    | Grade  ");
		System.out.println(" ----------------------------------------------------------------------------------");
		System.out.println(" Java                                          |"+marks[0]+"                        |"+grade1[0]);
		System.out.println(" Python                                        |"+marks[1]+"                        |"+grade1[1]);
		System.out.println(" Operating System                              |"+marks[2]+"                        |"+grade1[2]);
		System.out.println(" Software Engineering                          |"+marks[3]+"                        |"+grade1[3]);
		System.out.println(" Web Technology                                |"+marks[4]+"                        |"+grade1[4]);
		System.out.println(" ----------------------------------------------------------------------------------");
		System.out.println("                                  Total Marks  |"+total_marks+"                       |");
		System.out.println("                           Average Percentage  |"+avg_percent+"%               Grade |   "+gradeCalci((int)avg_percent));
		
		
	}
}
