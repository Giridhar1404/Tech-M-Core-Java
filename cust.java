package core;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class cust extends rest {
	int total =0;
	float disc=0;
	float prom=0;
	
		HashMap <String,Integer> order=	 new HashMap <String,Integer>();
		
        
	
	boolean addorder(String d,int k)
	{
		if(menu.containsKey(d))
		{
			order.put(d, k);
			System.out.println("Items ordered successfully");
			return false;
		}
		else
		{
			
			System.out.println("Item not present in Menu");
			return true;
		}
			
	}
	
	void displaymenu()
	{
		super.display1();
	}
	
	void displayorder()
	{
		Set<String> s= order.keySet();
		for(String f:s)
		{
			System.out.println("Item name : "+f+ ", Quantity : "+order.get(f)+ "* "+menu.get(f)+" = "+order.get(f)*super.menu.get(f));
		}
	}
	
	void bill()
	{
		float total =0;
		float disc=0;
		Set<String> s= order.keySet();
		for(String f:s)
		{
			
			total=total+ order.get(f)*super.menu.get(f);
			
		}
		System.out.println("Your total bill is : "+total);
		if(total>100)
		{
			System.out.println("You unlocked 10% discount as your bill is above 100.");
			 disc=total-(total*10/100);
			System.out.println("Your payable amount is "+disc);
			
		}
		 System.out.println("After 18% GST ");
	 	 float gst=disc+(disc*18/100);
		 System.out.println("Your payable amount is :"+gst);
		System.out.println("Do you have any coupon code?");
        System.out.println("Enter y or n");
        Scanner sc=new Scanner(System.in);
        char g=sc.nextLine().charAt(0);
        switch(g)
        {
        case 'y':
        	System.out.println("Enter promo code :");
        	String l=sc.nextLine();
        	if(l.equals("first10") )
        	{
        		 prom=disc-(disc*10/100);
        		System.out.println("Valid promo code");
    			System.out.println("Your payable amount is :"+prom);
        	}
        	else
        	{
        		System.out.println("Invalid promo code");
        		System.out.println("Your payable amount is "+disc);
        		
        	}
        	break;
        	
        case 'n':
        	System.out.println("Your payable amount is "+disc);
        	break;
        }
       
	}
	
		 
 		

	
}
		
	
	
	
	


