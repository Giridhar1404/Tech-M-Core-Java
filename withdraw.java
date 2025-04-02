package core;

import java.util.Scanner;

public class withdraw {
	
	int balance=1000;

	public withdraw(int w) throws InsufficientBalanceException {
		if(w>balance)
		{
			throw new InsufficientBalanceException("Insufficient Funds");
		}
		else
		{
			balance=balance-w;
			System.out.println(" Withdraw succesfull");
			System.out.println(" Your balance is "+balance);
		}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter amount to withdraw :");
      int w=s.nextInt();
      try {
		withdraw w1=new withdraw(w);
	} catch (InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		 System.out.println( " Enter less than you balance .");
	}
     
      
	
	}

}
