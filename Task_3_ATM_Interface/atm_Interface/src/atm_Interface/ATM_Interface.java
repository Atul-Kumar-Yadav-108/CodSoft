package atm_Interface;

import java.util.Scanner;

public class ATM_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("\n                                        Task 3 - ATM INTERFACE                                           \n");
		
		System.out.println("\n\n              -------------------------------------------------------------------------------------");
		System.out.println("                                                XYZ - ATM                                           ");
		System.out.println("              -------------------------------------------------------------------------------------\n\n");
		System.out.println("                            PIN NUMBERS : 6001, 6002, 6003,6004,6005\n\n");

	
		Bank_Account bank=new Bank_Account();
		
		System.out.print("                                          Enter your pin : ");
		int pno=s.nextInt();
		
		bank.getPin(pno);
		

		String choice2;
		String y1="y",y2="Y";
		
		do
		{
			System.out.println("\n\n                           1. WITHDRAW\n                           2. Deposite\n                           3. Check Balance\n");
			System.out.print("                           Enter your choice : ");
			int ch=s.nextInt();
			
			switch(ch)
			{
			case 1:{
				System.out.print("                            Enter amount to withdraw : ");
				long amt=s.nextLong();
				bank.withdraw(bank.cstno,amt);
				break;
			}
			case 2:{
				System.out.print("                            Enter amount to be deposit : ");
				long amt=s.nextLong();
				bank.deposite(bank.cstno,amt);
				System.out.println("                            Your balance is deposited successfully ");
				break;
			}
			case 3:{
				bank.checkBalance(bank.cstno);
				break;
			}
			}
			
			System.out.print("\n                            Do you want to continue (y/n): ");
			
			choice2=s.next();
		}while(choice2.equals(y1) || choice2.equals(y2));
		
		System.out.println("\n\n                                          THANK YOU😊😊😊");
		
		
		
	}

}
