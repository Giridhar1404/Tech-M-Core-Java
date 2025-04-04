package core;

import java.util.Scanner;

public class services {

	public static void main(String[] args) {
		char c='y';
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        inventory i=new inventory();
        do {
		System.out.println("Select the operation to be performed");
		System.out.println("1-Display");
		System.out.println("2-Add Product");
		System.out.println("3-Update Product");
		System.out.println("4-Remove Product");
		System.out.println("5-Search Product");
		System.out.println("6-Check Inventory");
		int x=sc.nextInt();
		
		
		
		switch(x)
		{
		case 1:
			i.display();
		    break;
		case 2:
			System.out.println("Enter an id");
			int k=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a name");
			String name=sc.nextLine();
			i.addProduct(k,name);
			break;
		case 3:
			System.out.println("Enter an id");
			int f=sc.nextInt();
			i.updateProduct(f);
			break;

		case 4:
			System.out.println("Enter an id");
			int l=sc.nextInt();
			i.removeProduct(l);
			break;

		case 5:
			System.out.println("Enter an id");
			int a=sc.nextInt();
			i.search(a);
			break;
			
		case 6:
			i.checkInventory();
			
		    
		}
		 System.out.println("Press y to continue and n to terminate");	
		 sc.nextLine();
		 c=sc.nextLine().charAt(0);
		}while(c=='y');

	}

}
