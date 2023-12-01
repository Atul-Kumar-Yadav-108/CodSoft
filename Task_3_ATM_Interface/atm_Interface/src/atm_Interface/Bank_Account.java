package atm_Interface;

import java.util.Iterator;
import java.util.*;

public class Bank_Account {
	static int getpin;
	static int cstno;
	static int pin[]=new int[] {6001,6002,6003,6004,6005};
	static String username[]= {"Atul Kumar Yadav","Balram Singh Yadav","Satish Yadav","Alok Kumar Yadav","Abhijeet Singh Yadav"};
	long bal[]=new long[] {0,0,0,0,0};
	
	
	
	Bank_Account()
	{
		
//		account(getpin,pin, username);
		
	}
	
	static void account(int pin1,int pin[],String username[])
	{

		for(int i=0;i<=pin.length;i++)
		{
				
			if(i<pin.length)
			{
				if(pin1==pin[i])
				{
					System.out.println("\n                                          Weclome : "+username[i]);
					cstno=i;
					break;
				}
			}
			else
			{
				System.out.println("\n\n\n                            Sorry, You don't have account in this bank!!!!!!!");
				System.out.println("\n\n                                          THANK YOU😊😊😊");
				System.exit(0);
			}
		}
		
	
	}
	
	
	void deposite(int csn,long amt)
	{
		bal[csn]=bal[csn]+amt;
	}
	
	
	void withdraw(int csn,long amt)
	{
		if(bal[csn]>=amt) {
			System.out.println("                            Transaction Successful , Withdraw amount : "+amt);
			bal[csn]=bal[csn]-amt;
		}
		else
		{
			System.out.println("                            Insufficient balance");
		}
	}
	
	
	void checkBalance(int csn)
	{
		System.out.println("                            Your available Balance is : "+bal[csn]);
	}
	
	static void getPin(int pin1) {
		getpin=pin1;
		account(getpin,pin, username);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Bank_Account();
		
//		System.out.println("Your balance is "+balance);

	}

}
