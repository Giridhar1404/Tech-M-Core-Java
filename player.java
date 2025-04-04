package core;

import java.util.Scanner;

public class player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='y';
		Scanner sc=new Scanner(System.in);
       library l=new library();
        do {
		System.out.println("Select the operation to be performed");
		System.out.println("1-Display");
		System.out.println("2-Add song");
		System.out.println("3-Remove Product");
		System.out.println("4-Play random song");
		int x=sc.nextInt();
		sc.nextLine();
		switch(x)
		{
		case 1:
			l.display();
		    break;
		case 2:
			System.out.println("Enter song name");
			String sname=sc.nextLine();
			System.out.println("Enter Artist name");
			String name=sc.nextLine();
			l.addsong(sname, name);
			break;
		case 3:
			System.out.println("Enter song name");
			String name1=sc.nextLine();
			l.removesong(name1);
			break;

		case 4:
			
		    l.random();
			break;

	
		    
		}
		 System.out.println("Press y to continue and n to terminate");	
		 sc.nextLine();
		 c=sc.nextLine().charAt(0);
		}while(c=='y');

	}

}
