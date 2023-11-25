package numberGame;

import java.util.*;

public class NumberGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int min=1;
		int max=100;
		
		System.out.println("\n\n\n                                                                           NUMBER GAME                                 \n\n");
		
		System.out.println("---------------------Instruction----------------------------------");
		System.out.println("1 . Player can play any numbers of rounds.");
		System.out.println("2 . Each round have only three attempts.");
		System.out.println("------------------All The Best!!!   Enjoy it----------------------");
		
		System.out.print("\n\nHow many Rounds you want to play???   ");
		int rounds=sc.nextInt();
		System.out.println("\n\n");
		
		
		int win=0;
		
		for(int i=1;i<=rounds;i++) 
		{	
			
			
			
			System.out.println("------------------------------------------------------------------------------------\n");
			System.out.println("          Total Rounds  - "+rounds+"                                    Round -   "+i+"        \n");
			System.out.println("------------------------------------------------------------------------------------");
			
			int total_life=3;
			int rem_life=total_life;
			for(int j=1;j<=total_life;j++)
			{	
				
				
				
				//random number generate
				int rand=(int)(Math.random()*(max-min+1)+1);
				
				System.out.println("                        Remaining Life   -   "+(--rem_life)+"                   ");
				
				System.out.print("Enter you guess (1-100): ");
				int guess=sc.nextInt();
				
				if(rand==guess)
				{
					System.out.println("Congrates !!!");
					System.out.println("Yor won!!!!!!");
					++win;
					break;
				}
				else if(rand>guess)
				{
					System.out.println("Too Low");
				}
				else if(rand<guess)
				{
					System.out.println("Too High");
				}
			}
		}
		
		System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|           Total rounds : "+rounds+"          total Wins/Scores : "+win+"                                  Total loose : "+(rounds-win)+"                          |");
		System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------");

	}

}
