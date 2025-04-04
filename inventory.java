package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inventory {
	Scanner sc=new Scanner(System.in);

	List<product> products;
	product p=new product(101,"bread" );
	product p1=new product(102,"biscuts" );
	product p2=new product(103,"chocolates" );
	product p3=new product(104,"candy" );
	product p4=new product(105,"drinks" );
	inventory()
	{
		products=new ArrayList<product>();
		products.add(p);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
	}
	
	void addProduct(int id,String name)
	{
		product p6=new product(id, name);
		products.add(p6);
		display();
	}
	
	
	void display()
	{
		for(product x:products)
		{
			System.out.println(x);
		}
		
	}
	
	void search(int pid)
	{
		for(product x:products)
		{
			if(x.id==pid)
			{
				System.out.println("product found !");
				System.out.println("Product name :"+x.name);
				break;
			}
			
		}
	}
	
	
	void removeProduct(int pid)
	{
		for(product x:products)
		{
			if(x.id==pid)
			{
				products.remove(x);
				System.out.println("Product deleted successfully");
				break;
			}
			
		}
		display();
	}
	
	void updateProduct(int pid)
	{
		System.out.println("enter name to be replace");
		String s=sc.nextLine();
		for(product x:products)
		{
			if(x.id==pid)
			{
				x.setName(s);
				System.out.println("Product updated successfully");
				break;
			}
			
		}
		display();
		
	}
	
	void checkInventory()
	{
		if(products.size()<6)
		{
			System.out.println("Low Inventory");
			System.out.println("Add products");
		}
		else
		{
			System.out.println("Inventory has "+products.size()+" products");
		}
	}

}
