package core;

import java.util.*;

public class palprime {
	public static void main(String[]args)
	{
		int prime=0;
		int palindrome=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n=sc.nextInt();
	int p=n;
	int d=0;
	int rev=0;
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
		    count++;		
		}
	}
	if(count==2)
	{
		prime=1;
	}
	else
	{
		prime=0;
	}
	
	while(p!=0)
	{
		d=p%10;
		rev=rev*10+d;
		p=p/10;
			
	}
	p=n;
	if(rev==p)
	{
		palindrome=1;
	}
	else
	{
		palindrome=0;
	}
	
	if(prime==1 && palindrome==1)
	{
		System.out.println("Its a Palprime number");
	}
	else
	{
		System.out.println("Its not a Palprime number");
	}
	}

}


//output :
//	Enter a number : 
//  131
//	Its a Palprime number
