package core;

import java.util.Scanner;

public class bank {
	
	 
	 public int balance=10000;
	
	
	public void deposit(int damt)
	{
		if(damt>0)
		{
			balance = balance+damt;
			System.out.println("Deposited amount "+ damt + "$");
		}
		else
		{
			
		}
	}
	public void withdraw(int wamt)
	{
		if(wamt>0 && wamt<balance)
		{
			balance = balance-wamt;
			System.out.println("Withdrawl amount "+ wamt + "$");
		}
		else
		{
			System.out.println("Insufficient fund");
		}
	}
	public void check()
	{
		System.out.println("The total balance in your account is :"+ balance);
	}
	
	public static void main(String[]args)
	{
		int d=1;
		Scanner s = new Scanner(System.in);
		bank b=new bank();
		do 
		{
		System.out.println("Select your operation :");
		System.out.println("1 - Deposit");
		System.out.println("2 - withdraw");
		System.out.println("3 - Check Balance");
		int a = s.nextInt();
		switch(a)
		{
			case 1: 
				System.out.println("Enter amount to deposit :");
				int damt=s.nextInt();
				b.deposit(damt);
				break;
			case 2: 
				System.out.println("Enter amount to withdraw :");
				int wamt=s.nextInt();
				b.withdraw(wamt);
				break;	
			case 3:
				b.check();
				break;
				
			
		}
		System.out.println("Enter 1 to continue and 0 to terminate");
		d=s.nextInt();
		
		}while(d==1);
		
		
			
	
	}

}
