package core;

import java.util.Scanner;

public class Restaurant extends cust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        cust c=new cust();
        c.rest();
        System.out.println("Welcome to our Restaurant");
        System.out.println();
        char o='y';
       
          System.out.println("Here is our menu");
          System.out.println();
        	c.displaymenu();
        	System.out.println();
         do {
        	
        	
        	System.out.println("Order here");
        	System.out.println("Enter item name : ");
        	String f=sc.nextLine();
        	System.out.println("Enter Quantity : ");
        	int u=sc.nextInt();
        	c.addorder(f, u);
        	sc.nextLine();
        	System.out.println("Press y to order an other item and n to close ");
        	o=sc.nextLine().charAt(0);
        	}while(o=='y');
        	
        	System.out.println("Your order is :");
    
         c.displayorder();
         
        c.bill();
        
		
	}

}
