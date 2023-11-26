package studentGradeCalculator;

import java.util.*;




public class StudentGradeCalculator {

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
		ArrayList<Integer> marks=new ArrayList<Integer>();
		ArrayList<String> grade1=new ArrayList<String>();
		
		int total_marks=0;
		
		for (int i = 0; i < sub_name.length; i++) {
			
			System.out.print("Enter marks for "+sub_name[i]+" (out of 100) : ");
			int mark=sc.nextInt();
			marks.add(mark);
			
			
			String grade=gradeCalci(mark);

			
			grade1.add(grade);
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
		System.out.println(" Java                                          |"+marks.get(0)+"                        |"+grade1.get(0));
		System.out.println(" Python                                        |"+marks.get(1)+"                        |"+grade1.get(1));
		System.out.println(" Operating System                              |"+marks.get(2)+"                        |"+grade1.get(2));
		System.out.println(" Software Engineering                          |"+marks.get(3)+"                        |"+grade1.get(3));
		System.out.println(" Web Technology                                |"+marks.get(4)+"                        |"+grade1.get(4));
		System.out.println(" ----------------------------------------------------------------------------------");
		System.out.println("                                  Total Marks  |"+total_marks+"                       |");
		System.out.println("                           Average Percentage  |"+avg_percent+"%               Grade |   "+gradeCalci((int)avg_percent));
		
		
	}
}
